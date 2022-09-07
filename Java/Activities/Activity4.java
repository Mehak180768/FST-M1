package com.ibm.activities;

public class Activity4 {

    public static void main(String[] args) {

        int[] array = {5, 6, 7, 4, 1, 9};

        System.out.println("Array before sorting: ");
        printArray(array);

        for (int i = 1; i < array.length; i++) {

            int j = i - 1;

            while (j >= 0 && array[j] > array[j + 1]) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;

                j--;
            }
        }

        System.out.println("\nArray after sorting: ");
        printArray(array);
    }

    private static void printArray(int[] array){

        for (int i =0; i < array.length; i++)
            System.out.print(array[i] + "\t");
    }
}
