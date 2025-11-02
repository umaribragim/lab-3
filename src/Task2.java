
//TASK 2 – CALCULATION OF THE BMI INDEX

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float weightIbra;
        float heightIbra;

        System.out.print("Please enter your weight (kg): ");
        do {
//          Checking if input is number
            while(!input.hasNextFloat()) {
                System.out.print("Invalid input! Please enter a valid weight (kg): ");
                input.next();
            }
            weightIbra = input.nextFloat();
//          Checking if weight is not 0
            if (!(weightIbra > 0)) {
                System.out.print("Invalid input! Please enter a valid weight (kg): ");
            }
        } while (!(weightIbra > 0));


        System.out.print("Please enter your height (cm): ");
        do {
//          Checking if input is number
            while(!input.hasNextFloat()) {
                System.out.print("Invalid input! Please enter a valid height (cm): ");
                input.next();
            }
            heightIbra = input.nextFloat();
//          Checking if height is not 0
            if (!(heightIbra > 0)) {
                System.out.print("Invalid input! Please enter a valid height (cm): ");
            }
        } while (!(heightIbra > 0));

        input.close();

//      Calculating BMI
        double bmi = weightIbra / Math.pow((heightIbra / 100), 2);
        System.out.printf("Your BMI: %.2f%n", bmi);

//      Checking for BMI classification
        String classification;
        if (bmi < 16.00) {
            classification = "starvation";
        } else if (bmi < 17.00) {
            classification = "emaciation";
        } else if (bmi < 18.50) {
            classification = "underweight";
        } else if (bmi < 23.00) {
            classification = "normal, low range";
        } else if (bmi < 25.00) {
            classification = "normal, high range";
        } else if (bmi < 27.50) {
            classification = "overweight, low range";
        } else if (bmi < 30.00) {
            classification = "overweight, high range";
        } else if (bmi < 35.00) {
            classification = "1st degree obesity";
        } else if (bmi < 40.00) {
            classification = "2nd degree obesity";
        } else {
            classification = "3rd degree obesity";
        }
        System.out.println("Your classification: " + classification);
    }
}
