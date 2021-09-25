package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = null;
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        int min = arr[0], buf,index = 0;
        for(int i = 0; i < arr.length; ++i)
            if(min > arr[i]) {
                min = arr[i];
                index = i;
            }
        buf = arr[0];
        arr[0] = min;
        arr[index] = buf;
    }

}