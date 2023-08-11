package com.mnluan;

import java.io.*;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String filename = "sessions.txt";

        try {
            File file = new File(filename);

            if (!file.exists()) {
                createAndAddTimestamp(file);
            } else {
                updateAndDisplayTimestamps(file);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createAndAddTimestamp(File file) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String timestamp = dateFormat.format(new Date());

            writer.println(timestamp);
            System.out.println("File created and timestamp added: " + timestamp);
        }
    }

    public static void updateAndDisplayTimestamps(File file) throws IOException {
        List<String> lines = Files.readAllLines(file.toPath());
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        if (!lines.isEmpty()) {
            String lastTimestamp = lines.get(lines.size() - 1);
            System.out.println("Last timestamp: " + lastTimestamp);

            if (lines.size() > 1) {
                String penultimateTimestamp = lines.get(lines.size() - 2);
                System.out.println("Penultimate timestamp: " + penultimateTimestamp);
            }
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
            String newTimestamp = dateFormat.format(new Date());
            writer.println(newTimestamp);
            System.out.println("New timestamp added: " + newTimestamp);
        }
    }
}