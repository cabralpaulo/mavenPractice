package week3;

import static input.InputUtils.stringInput;
public class HelloMethods {
    //This is the main method
    public static void main(String[] args) {

        String name = stringInput("Pleas eenter your name: ");
        String greeting = makeGreeting(name);
        System.out.println(greeting);
        //This is the end of the main method
    }

    //A new method we've created.
    // This method takes one argument a String.
    //It will create a new String made from word "Hello"
    //Plus the String argument, plus an exclamation point !
    // It will then return that new greeting String.

    public static String makeGreeting(String n) {

        String greeting = "Hello " + n + "!";
        return greeting;

    } //The end of the makeGreeting Method
} // End of the HelloMethods.java
