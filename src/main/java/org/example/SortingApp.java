package org.example;

import java.util.Arrays;

public class SortingApp  {
    public static void main(String[] args) {
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        Arrays.sort(numbers);

        System.out.println("Sorted numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
