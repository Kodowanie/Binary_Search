package org.example;

import java.util.*;

public class BinarySearchArrayList {

    public int serach (ArrayList<Integer> list, int number){
        int low = 0;
        int high = list.size() - 1;
        while (low <= high){
            int middlePosition = (high + low)/2;
            if (number == list.get(middlePosition)){
                return middlePosition;
            }
            if (number < list.get(middlePosition)){
                high = middlePosition - 1;
            } else {
                low = middlePosition + 1;
            }
        }
        return -1;
    }
}
