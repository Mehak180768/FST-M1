package com.ibm.activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();

        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("E");

        System.out.println("The names in the list are: ");

        for (String element: myList){
            System.out.println(element);
        }

        System.out.println("The third name in the list is: " + myList.get(2));

        System.out.println("Is 'A' present in the list? " + myList.contains("A"));

        System.out.println("The number of names in the list is: " + myList.size());

        myList.remove("D");

        System.out.println("The new number of names in the list is: " + myList.size());
    }
}
