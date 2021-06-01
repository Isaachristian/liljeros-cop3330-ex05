package org.example;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        // Variables
        double num1, num2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the first number? ");
        num1 = scanner.nextDouble();
        System.out.print("What is the second number? ");
        num2 = scanner.nextDouble();

        System.out.printf(
            "%f + %f = %f\n" +
            "%f - %f = %f\n" +
            "%f * %f = %f\n" +
            "%f / %f = %f\n",
                num1, num2, (num1 + num2),
                num1, num2, (num1 - num2),
                num1, num2, (num1 * num2),
                num1, num2, (num1 / num2)
        );
    }
}
