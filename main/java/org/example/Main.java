package org.example;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer [] arraysOfInts = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(Arrays.toString(arraysOfInts));
        Arrays.sort(arraysOfInts, Collections.reverseOrder());
        System.out.println(Arrays.toString(arraysOfInts));
        String[] arraysOfStrings = {"Edward", "Prince", "Michael", "Williams"};
        System.out.println(arraysOfStrings[2]);
        Arrays.sort(arraysOfStrings);
        System.out.println(Arrays.toString(arraysOfStrings));
        Arrays.sort(arraysOfStrings, Collections.reverseOrder());
        System.out.println();
        System.out.println(Arrays.toString(arraysOfStrings));

    }
}