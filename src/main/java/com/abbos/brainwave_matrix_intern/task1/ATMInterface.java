package com.abbos.brainwave_matrix_intern.task1;

/**
 * @author Aliabbos Ashurov
 * @since 14/January/2025  09:36
 **/
import java.util.Scanner;

public class ATMInterface {

    private static double balance = 1000.00; // Initial balance
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the ATM Machine!");
        boolean exit = false;

        while (!exit) {
            showMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    viewBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\nATM Main Menu:");
        System.out.println("1. View Balance");
        System.out.println("2. Deposit Funds");
        System.out.println("3. Withdraw Funds");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static int getUserChoice() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number between 1 and 4.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void viewBalance() {
        System.out.printf("\nYour current balance is: $%.2f\n", balance);
    }

    private static void deposit() {
        System.out.print("\nEnter the amount to deposit: $");
        double amount = getValidAmount();

        if (amount > 0) {
            balance += amount;
            System.out.printf("$%.2f deposited successfully.\n", amount);
            viewBalance();
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    private static void withdraw() {
        System.out.print("\nEnter the amount to withdraw: $");
        double amount = getValidAmount();

        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.printf("$%.2f withdrawn successfully.\n", amount);
                viewBalance();
            } else {
                System.out.println("Insufficient balance. Please try again.");
            }
        } else {
            System.out.println("Withdrawal amount must be greater than zero.");
        }
    }

    private static double getValidAmount() {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid amount.");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}

