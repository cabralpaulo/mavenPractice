package week2;

import static input.InputUtils.stringInput;
public class WhileLoopPassword {
    public static void main(String[] args) {
        String secretPassword = "Honey";
        String  userPassword = stringInput("Enter Password: ");

        while (! userPassword.equals(secretPassword)) {
            System.out.println("Password Incorrect, access denied!");
            System.out.println("Try Again!");
            userPassword = stringInput("Enter Password: ");
        }
        System.out.println("Correct Password - Access Granted");
    }
}
