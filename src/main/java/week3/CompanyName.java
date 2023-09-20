package week3;

import java.util.Arrays;

public class CompanyName {


    public static void main(String[] args) {
        String [] companyNames ={ "ikea", "at&t", "cvs", "3m"};

            for (int x = 0; x < companyNames.length ; x++){
                companyNames[x]= companyNames[x].toUpperCase();
            }
            System.out.println(Arrays.toString(companyNames));
        }
    }

