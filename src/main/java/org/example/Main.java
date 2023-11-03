package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //binary search for Arrays
        int [] array = {10,2,7,9,4,1,5};
        Arrays.sort(array);
        System.out.println("Sorted Arrays[] = " + Arrays.toString(array));

        BinarySearchArrays bsa = new BinarySearchArrays();
        int iArray = 10;
        System.out.println("Binary Search Array[] of number '" + iArray + "' is = " + bsa.search(array,iArray));
        System.out.println();

        //binary serach for ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(9);
        Collections.sort(arrayList);
        System.out.println("Sorted ArrayList = " + arrayList);

        BinarySearchArrayList bsal = new BinarySearchArrayList();
        int iArrayList = 7;
        System.out.println("Binary Search ArrayList of number '" + iArrayList + "' is = " + bsal.serach(arrayList,iArrayList));
    }
}