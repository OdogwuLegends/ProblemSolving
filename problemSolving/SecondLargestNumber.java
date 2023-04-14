package problemSolving;

import java.util.Scanner;

public class SecondLargestNumber {
    /*Take an input of multiple numbers from a user. Find the second largest number of the
    numbers.*/

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        secondHighestNumber();
    }

    public static int secondHighestNumber(){
        int largest = 0;
        int secondHighest = 1;

        for (int i = 1; i <= 10 ; i++) {
            System.out.println("Enter a number ");
            int response = scanner.nextInt();
            if(response > largest) largest = response;
            if(response > secondHighest && response < largest) secondHighest = response;
        }
        System.out.println("Largest = " + largest +" second = " + secondHighest);
        return secondHighest;
    }
}
