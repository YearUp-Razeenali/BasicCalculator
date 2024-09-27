package com.pluralsight;

import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        double first_number = number.nextInt();
        number.nextLine();

        System.out.print("Enter your second number: ");
        double second_number = number.nextInt();
        number.nextLine();

        System.out.println("Possible calculations: ");
        System.out.println("    (A)dd");
        System.out.println("    (S)ubtract");
        System.out.println("    (M)ultiply");
        System.out.println("    (D)ivide");

        System.out.print("Please select an option: ");
        String operation = number.nextLine();
        System.out.println();
        //number.nextLine();
        //System.out.println(operation);

        double total_number;

        if(operation.equals("A") || operation.equals("a")) {

            total_number = first_number + second_number;
            System.out.println(first_number + " + " + second_number +" = " + total_number);
        }
        else if (operation.equals("S") || operation.equals("s")) {

            total_number = first_number - second_number;
            System.out.println(first_number + " - " + second_number +" = " + total_number);
        }
        else if (operation.equals("M") || operation.equals("m")) {

            total_number = first_number * second_number;
            System.out.println(first_number + " * " + second_number +" = " + total_number);
        }
        else if (operation.equals("D") || operation.equals("d")){

            total_number = first_number / second_number;
            System.out.println(first_number + " / " + second_number +" = " + String.format("%.2f", total_number));
        }
        else {
            
            System.out.println("Please try again and selection a valid operation");
        }
    }
}
