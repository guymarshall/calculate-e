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

        for (double i = 1.0; i <= iterations; i++)
        {
            System.out.printf("%f: %f%n", i, Math.pow((1 + 1.0/i), i));
        }
    }
}
