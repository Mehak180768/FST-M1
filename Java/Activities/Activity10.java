package com.ibm.activities;

import java.util.HashSet;

public class Activity10 {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(6);

        System.out.println("The number of elements in the set are: " + hs.size());

        System.out.println("Removing '1' from the set. " + hs.remove(1));

        System.out.println("Removing '9' from the set. " + hs.remove(9));

        System.out.println("Is '1' present in the set? " + hs.contains(1));

        for (Integer element: hs)
            System.out.println(element);
    }

}
