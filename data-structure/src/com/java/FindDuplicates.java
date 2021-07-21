package com.java;

import java.util.Arrays;

/**
 * Given an array of n elements that contains elements from 0 to n-1, with any of these numbers appearing any number of times.
 * Find these repeating numbers in O(n) and using only constant memory space.
 */
public class FindDuplicates {

    public static void main(String[] args) {
        FindDuplicates duplicate = new FindDuplicates();
                int arr[] = { 1, 2, 3, 1, 3, 6, 6 };
                int arr_size = arr.length;

                duplicate.printRepeating(arr, arr_size);

        }

    // Function to print duplicates
    void printRepeating(int arr[], int size)
    {
        int i;
        System.out.println("The repeating elements are : ");

        for (i = 0; i < size; i++) {
            int j = Math.abs(arr[i]);
            System.out.println(j);
            if (arr[j] >= 0)
                arr[j] = -arr[j];
            else
                System.out.print(j + " ");
        }

        Arrays.toString(arr);
    }
    }
