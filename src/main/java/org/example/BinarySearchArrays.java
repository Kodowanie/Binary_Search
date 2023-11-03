package org.example;

public class BinarySearchArrays {

    public int search(int [] array, int number){
        int low = 0;
        int high = array.length - 1;
        while (low <= high){
            int middlePosition = (low + high) / 2;
            int middleNumber = array[middlePosition];
            if (number == middleNumber){
                return middlePosition;
            }
            if (number < middleNumber){
                high = middlePosition - 1;
            } else {
                low = middlePosition + 1;
            }
        }
        return -1;
    }
}
