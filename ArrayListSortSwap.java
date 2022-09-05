/*
Name: Garrett Dodd
Date: 14 April 2022
Lab 7
My methods are: size(), isEmpty(), and contains()
*/

import java.util.ArrayList;
import java.util.Collections; 

public class ArrayListSortSwap{

    public static void main(String[] args){

        ArrayList<String> names = new ArrayList<String>();
        
        names.add("Marge");
        names.add("George");
        names.add("Maria");
        names.add("Sarah");
        names.add("Martin");
        names.add("Brian");
        names.add("Kevin");
        names.add("Ralph");
        names.add("Ned");

        System.out.println("*** STEP 3 : First Display ***");
        System.out.println(names);

        System.out.println("*** Step 4 : Remove 5th element ***");
        names.remove(4);
        System.out.println(names);

        System.out.println("*** Step 7 : Sort ***");
        Collections.sort(names);
        System.out.println(names);


        System.out.println("Size: " + names.size());
        System.out.println("Is Empty: " + names.isEmpty());
        System.out.println("Contains 'Garrett': " + names.contains("Garrett"));
    }
}