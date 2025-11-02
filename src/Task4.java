
//TASK 4 – SUMMARY OF EVEN NUMBERS FROM 1 TO 100 - USING A FOR LOOP

public class Task4 {
    public static void main(String[] args) {
        int sumEvens = 0;

        for (int i = 2; i <= 100; i += 2) {
            sumEvens += i;
        }

        System.out.println("Sum of all evens from 1 to 100: " + sumEvens);
    }
}
