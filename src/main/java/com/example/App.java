package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Simple Interest Calculator ---");

        System.out.print("Enter Principal (P): ");
        double principal = input.nextDouble();

        System.out.print("Enter Annual Rate (R%): ");
        double rate = input.nextDouble();

        System.out.print("Enter Time in Years (T): ");
        double time = input.nextDouble();

        // Formula: SI = (P * R * T) / 100
        double interest = (principal * rate * time) / 100;
        double total = principal + interest;

        System.out.println("\nResults:");
        System.out.printf("Interest Amount: %.2f\n", interest);
        System.out.printf("Total Maturity Value: %.2f\n", total);

        input.close();
    }
}
