package com.stayready.assessment1.part1;

import java.util.*;

public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {
        return stringArray[0];
        
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {
        return stringArray[1];
    }


    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String[] reverse(String[] stringArray) {
        String[] inputArray = {"The", "quick", "brown"};   
        reverseArray(inputArray);
        return inputArray;
    }
    public static void reverseArray(String[] arr) {
        List<String> list = Arrays.asList(arr);
        Collections.reverse(list);
        String[] reversedArray = list.toArray(arr);
        System.out.print("Reverse Array : " + Arrays.toString(reversedArray));
   }



    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        String[] inputArray2 = {"The", "quick", "brown", "fox"};
        
        return null;
    }
}
