package week3;

import static input.InputUtils.intInput;
public class Counting {

    //This is the main method
    public static void main(String[] args) {

        int smallNumber = intInput(" Enter a small Number");
        int largeNumber = intInput(" Enter a large Number");

        System.out.println("I will now count from  " + smallNumber + " to " + largeNumber);


        // Call the count method
        count(smallNumber, largeNumber);
    } // This is the end of the main method


    // A new method that we've created called count
    // This method takes two arguments, both integers
    // Representing a number to start counting from, and a number to stop counting to
    // It will count from min to max, printing out each number

    public static void count   (int min, int max){

        for (int i = min ; i <= max ; i++){
            System.out.println(i);
        }
    }// The end of the count method


} // The end of the counting class
