package com.ibm.activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomScannerActivity {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Random indexGen = new Random();
        int n;

       System.out.println("Enter the integers:");

        while (scan.hasNextInt())
            list.add(scan.nextInt());

        n = list.size();

        int randomIndex = indexGen.nextInt(n);
        System.out.println("Random generated index: " + randomIndex + " has value: " + list.get(randomIndex));
    }

}
