
//TASK 5 – FINDING THE BIGGEST AND THE SMALLEST NUMBERS FROM THE SET OF NUMBERS DRAWN BY A LOOP WHILE

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int count = 0;
        int largestNumber = 0;
        int lowestNumber = 0;
        int currentNumber = 0;

        System.out.print("Drawn numbers: ");
        while (count < 10) {
            currentNumber = rand.nextInt(100) + 1;
            System.out.printf(currentNumber + (count < 9 ? ", " : ";%n"));

            if (count == 0) {
                largestNumber = currentNumber;
                lowestNumber = currentNumber;
            } else {
                if (currentNumber < lowestNumber) {
                    lowestNumber = currentNumber;
                }
                if (currentNumber > largestNumber) {
                    largestNumber = currentNumber;
                }
            }

            count++;
        }

        System.out.println("Lowest number: " + lowestNumber);
        System.out.println("Largest number: " + largestNumber);
    }
}
