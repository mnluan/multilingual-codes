package com.mnluan

import java.text.DecimalFormat
import java.util.Scanner

import kotlin.math.pow
import kotlin.math.sqrt

object TriangleType {

    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)

        println("Enter the sizes (cm) of the sides of the triangle (X, Y, and Z)")
        print("X: ")
        val x = scanner.nextDouble()
        print("Y: ")
        val y = scanner.nextDouble()
        print("Z: ")
        val z = scanner.nextDouble()

        if (x <= 0 || y <= 0 || z <= 0) {
            println("The sizes of the sides should be positive.")
        } else {
            if (isTriangle(x, y, z)) {
                println("It's a ${calcFormat(x, y, z)} triangle! ${calcArea(x, y, z)}")
            } else {
                println("Nope, It's not a triangle!")
            }
        }
    }

    private fun isTriangle(x: Double, y: Double, z: Double): Boolean {
        // check if it's a triangle
        // The sum of two sides must be greater than the third side
        return (x + y > z) && (x + z > y) && (y + z > x)
    }

    private fun calcFormat(x: Double, y: Double, z: Double): String {
        return when {
            x == y && y == z -> "Equilateral"
            x == y || x == z || y == z -> "Isosceles"
            else -> {
                val biggerSide = maxOf(maxOf(x, y), z)
                val sumSquaresMinorSides = (x.pow(2) + y.pow(2) + z.pow(2) - biggerSide.pow(2))
                when {
                    sumSquaresMinorSides > biggerSide.pow(2) -> "Acute"
                    sumSquaresMinorSides < biggerSide.pow(2) -> "Obtuse"
                    else -> "Right"
                }
            }
        }
    }

    private fun calcArea(x: Double, y: Double, z: Double): String {
        val df = DecimalFormat()
        df.maximumFractionDigits = 2

        val p = (x + y + z) / 2
        val a = sqrt(p * (p - x) * (p - y) * (p - z))

        return "And its area is ${df.format(a)}cm"
    }
}