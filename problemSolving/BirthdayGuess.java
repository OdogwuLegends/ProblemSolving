package problemSolving;

import java.util.Scanner;

public class BirthdayGuess {
    /*
    You just made a new friend at school and he is trying to guess your birthday. He has already
guessed the month and year of your birth, and is now trying to guess the date. Write a loop
to allow your friend to keep guessing until he guesses right. Stop once he has guessed
correctly. Print out “Incorrect Guess” if the guess is not correct, and “Correct Guess” if the
guess is correct
     */

    public static void main(String[] args) {
        guess();
    }

    public static void guess(){
        Scanner scanner = new Scanner(System.in);
        int birthdate = 0;
        while(birthdate != 16){
            System.out.println("Guess my birthdate");
            birthdate = scanner.nextInt();
            if (birthdate == 16){
                System.out.println("Correct!\nWell done!");
            }
            else {
                System.out.println("Wrong guess. Try again.");
            }
        }
    }
}
