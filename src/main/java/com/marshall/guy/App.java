package com.marshall.guy;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int iterations = scanner.nextInt();
        scanner.close();
        
        if (iterations <= 1)
        {
            System.out.println("Please enter a number larger than 1.");
            System.exit(1);
        }

        for (int i = 1; i <= iterations; i++)
        {
            System.out.printf("%d: %f%n", i, Math.pow((1 + 1.0/i), i));
        }
    }
}
