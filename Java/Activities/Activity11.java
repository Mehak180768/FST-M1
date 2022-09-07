package com.ibm.activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

    public static void main(String[] args) {

        Map<Integer, String> colours = new HashMap<>();

        colours.put(1, "Red");
        colours.put(2, "Blue");
        colours.put(3, "Yellow");
        colours.put(4, "Green");
        colours.put(5, "Orange");

        System.out.println("The map is: " + colours);

        System.out.println("Removing the 5th entry from the map. " + colours.remove(5));

        System.out.println("Is 'green' in the map? " + colours.containsValue("green"));

        System.out.println("The number of entries in the map are: " + colours.size());
    }
}
