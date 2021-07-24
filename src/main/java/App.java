/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 1 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */

import java.util.Scanner;

public class App {
    public static double calcBMI(double height, double weight) {
        return (weight / (height * height)) * 703;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double height = 0, weight = 0;
        boolean isNumeric = false;

        while(!isNumeric) {
            try {
                System.out.print("What is your height in inches? ");
                height = Double.parseDouble(in.nextLine());
                System.out.print("What is your weight in pounds? ");
                weight = Double.parseDouble(in.nextLine());
                isNumeric = true;
            } catch (NumberFormatException nfe) {
                System.out.println("that is not a numeric input");
            }
        }

        double bmi = calcBMI(height, weight);
        if(bmi < 18.5)
            System.out.println("you are underweight. consult your physician.");
        else if(bmi > 25)
            System.out.println("you are overweight. consult your physician.");
        else
            System.out.println("you are within the ideal weight range. ");
    }
}
