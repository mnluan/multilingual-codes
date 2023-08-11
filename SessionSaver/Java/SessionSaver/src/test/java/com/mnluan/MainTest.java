package com.mnluan;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;

public class MainTest {

    @Test
    public void testCreateAndAddTimestamp() throws IOException {
        String testFilename = "test_create_timestamp.txt";
        File testFile = new File(testFilename);

        try {
            Main.createAndAddTimestamp(testFile);

            assertTrue(testFile.exists());

            List<String> lines = Files.readAllLines(testFile.toPath());
            assertEquals(1, lines.size());

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String timestamp = dateFormat.format(new Date());
            assertEquals(timestamp, lines.get(0));
        } finally {
            testFile.delete();
        }
    }

    @Test
    public void testUpdateAndDisplayTimestamps() throws IOException {
        String testFilename = "test_update_timestamp.txt";
        File testFile = new File(testFilename);

        try {
            testFile.createNewFile();
            Main.updateAndDisplayTimestamps(testFile);

            List<String> lines = Files.readAllLines(testFile.toPath());
            assertEquals(1, lines.size());

            Main.updateAndDisplayTimestamps(testFile);

            lines = Files.readAllLines(testFile.toPath());
            assertEquals(2, lines.size());

        } finally {
            testFile.delete();
        }
    }
}