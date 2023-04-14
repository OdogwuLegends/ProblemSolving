package problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArraysAndSort {

    public static void main(String[] args) {
        int[] firstArray = {1, 3, 4, 5};
        int[] secondArray = {2, 6, 7, 8};

        System.out.println(Arrays.toString(merge(firstArray, secondArray)));
    }



    public static int[] merge(int[] firstArray, int[] secondArray){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < firstArray.length; i++) {
            list.add(firstArray[i]);
        }
        for (int i = 0; i < secondArray.length; i++) {
            list.add(secondArray[i]);
        }
        int[] newArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArray[i] = list.get(i);
        }

        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = i+1; j < newArray.length; j++) {
                if (newArray[i] > newArray[j]){
                    int temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }
        return newArray;
    }
}
