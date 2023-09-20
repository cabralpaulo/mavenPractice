package week3;

import static input.InputUtils.doubleInput;

public class MilesToKm {

    public static void main(String[] args) {

        double miles = doubleInput ("Please enter number of Miles");
        double km = milesToKM(miles);
        System.out.println(miles + " miles is equal to " + km + " kilometers ");
    } //This is the end of the main method

    // This method takes one argument, a number of miles
    // It calculates the equivalent in kilometers, and return a value

    public static double milesToKM(double miles) {

        double km = miles * 1.6; // One mile is 1.6 Kilometers
        return km;
    } // The end of the mainToKm method


}


