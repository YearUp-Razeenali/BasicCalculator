package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        double first_number = promptforDouble("Enter your first number: ");
        double second_number = promptforDouble("Enter your second number: ");
        String operation = promptforOpearationType();


        if(operation.equals("A") || operation.equals("a")) {
            doAdd(first_number,second_number);
            //The following is another way of writing the previous line
            //System.out.printf("%.2f + %.2f = %.2f", first_number, second_number, total_number);
        }
        else if (operation.equals("S") || operation.equals("s")) {

            doSubtract(first_number,second_number);
        }
        else if (operation.equals("M") || operation.equals("m")) {

            doMultiply(first_number,second_number);
        }
        else if (operation.equals("D") || operation.equals("d")){

            doDivide(first_number,second_number);
        }
        else {

            System.out.println("Please try again and selection a valid operation");
        }

    }

    public static double promptforDouble(String prompt){

        System.out.print(prompt);
        double num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }

    public static String promptforOpearationType(){
        System.out.println("Possible calculations: ");
        System.out.println("    (A)dd");
        System.out.println("    (S)ubtract");
        System.out.println("    (M)ultiply");
        System.out.println("    (D)ivide");
        System.out.print("Please select an option: ");

        String operation = scanner.nextLine();
        return operation;
    }

    public static void doAdd(double a, double b){
        double total_number = a + b;
        System.out.println(a + " + " + b +" = " + total_number);
    }

    public static void doSubtract(double a, double b){
        double total_number = a - b;
        System.out.println(a + " - " + b +" = " + total_number);
    }

    public static void doMultiply(double a, double b){
        double total_number = a * b;
        System.out.println(a + " * " + b +" = " + total_number);
    }

    public static void doDivide(double a, double b){
        double total_number = a / b;
        System.out.println(a + " / " + b +" = " + String.format("%.2f", total_number));
    }

}
