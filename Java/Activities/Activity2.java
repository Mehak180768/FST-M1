package com.ibm.activities;

public class Activity2 {

    public static void main(String[] args) {

        int[] array = {10, 77, 10, 54, -11, 10};

        System.out.println("Result: " + isSumEquals30(array));

    }

    private static boolean isSumEquals30(int[] array){
        int sum = 0;

        for( int i = 0; i < array.length; i++)
            if( array[i] == 10)
                sum += 10;

        if (sum == 30)
            return true;
        else
            return false;
    }
}
