package week1;

import static input.InputUtils.intInput;

public class NumberQuizBasic {
    public static void main(String[] args) {
        int secretNumber = 7;
        int guess = intInput ("Guess the number I'm thinking of:");

        if (guess == secretNumber) {
            System.out.println("You guesses correctly!");
        } else System.out.println("Wrong, try again!");
    }
}
