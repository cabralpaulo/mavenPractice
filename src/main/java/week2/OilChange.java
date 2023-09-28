package week2;

public class OilChange {


    public static void main(String[] args) {

        int miles = 150000;
        int oilChangeInterval = 3000;

        for (int oilChange = 0; oilChange <=8; oilChange++ ) {
            miles = miles + oilChangeInterval;
            System.out.println(miles);
        }
    }
}
