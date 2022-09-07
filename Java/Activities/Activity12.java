package com.ibm.activities;

public class Activity12 {

    public static void main(String[] args) {

        Addable addable1 = (a, b) -> a + b;
        Addable addable2 = (int a, int b) -> {
            return a + b;
        };

        System.out.println("Addable 1: " + addable1.add(2, 3));
        System.out.println("Addable 2: " + addable2.add(2, 3));
    }


}

interface Addable{

    int add(int num1, int num2);



}
