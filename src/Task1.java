import java.util.Scanner;

// TASK 1 – SIMPLE CALCULATOR, USING FROM INPUT - OUTPUT OPERATIONS

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float firstNumberIbra;
        float secondNumberIbra;

        System.out.print("Please enter first number: ");
        while(!input.hasNextFloat()) {
            System.out.print("Invalid input! Please enter a valid number: ");
            input.next();
        }
        firstNumberIbra = input.nextFloat();

        System.out.print("Please enter second number: ");
        while(!input.hasNextFloat()) {
            System.out.print("Invalid input! Please enter a valid number: ");
            input.next();
        }
        secondNumberIbra = input.nextFloat();
        input.close();

//      Calculation Operations
        float sum = firstNumberIbra + secondNumberIbra;
        System.out.printf("The sum is: %.2f %n", sum);

        float difference = firstNumberIbra - secondNumberIbra;
        System.out.printf("The difference is: %.2f %n", difference);

        float product = firstNumberIbra * secondNumberIbra;
        System.out.printf("The product is: %.2f %n", product);

        float quotient = secondNumberIbra == 0 ? 0 : firstNumberIbra / secondNumberIbra;
        System.out.printf("The quotient is: %.2f %n", quotient);
    }
}
