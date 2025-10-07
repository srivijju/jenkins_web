package org.bd1a050c.kmit.maven_java;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n==== Simple Calculator ====");
            System.out.println("1) Addition");
            System.out.println("2) Subtraction");
            System.out.println("3) Multiplication");
            System.out.println("4) Division");
            System.out.println("5) Modulo");
            System.out.println("6) Power");
            System.out.println("7) Exit");
            System.out.print("Choose an option (1-7): ");
            int choice = sc.nextInt();
            if (choice == 7) {
                System.out.println("Exiting... Goodbye!");
                break;
            }
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();
            double result;
            switch (choice) {
                case 1:
                    result = a + b;
                    break;
                case 2:
                    result = a - b;
                    break;
                case 3:
                    result = a * b;
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Error: Division by zero");
                        continue;
                    }
                    result = a / b;
                    break;
                case 5:
                    if (b == 0) {
                        System.out.println("Error: Modulo by zero");
                        continue;
                    }
                    result = a % b;
                    break;
                case 6:
                    result = Math.pow(a, b);
                    break;
                default:
                    System.out.println("Invalid option. Please choose between 1-7.");
                    continue;
            }
            System.out.println("Result: " + result);
            System.out.println("Result");
        }
        sc.close();
    }
}
