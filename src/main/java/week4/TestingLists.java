package week4;

/*Import Lists*/

import java.util.ArrayList;
import java.util.List;



public class TestingLists {
    public static void main(String[] args) {


        List<String> arrayList = new ArrayList<>();

        arrayList.add("Hello");
        arrayList.add("World");

        for(String s: arrayList) {
            System.out.println(s);
        }

    }
}
