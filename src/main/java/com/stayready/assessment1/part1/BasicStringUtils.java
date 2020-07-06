package com.stayready.assessment1.part1;



public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        int i = str.length() - 1; 
        int start, end = i + 1; 
        String result = ""; 
        
        while(i >= 0) { 
            if(str.charAt(i) == ' '){ 
                start = i + 1; 
                while(start != end) 
                    result += str.charAt(start++); 
                result += ' '; 
                end = i; 
                } 
            i--;
        }
        
        start = 0; 
        while(start != end) 
        result += str.charAt(start++); 
        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        return null;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String[] s = str.split(" ");
        String ret = "";
        for(int i = 0; i < s.length; i++)
        {
            ret += " " + new StringBuilder(s[i]).reverse().toString();
        }

        return ret.substring(1);
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1, str.length() - 1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] arr = str.toCharArray();

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = Character.isUpperCase(arr[i]) ? Character.toLowerCase(arr[i]) : Character.toUpperCase(arr[i]);
        }

        return new String(arr);
    }

}
