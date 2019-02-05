package string_programs;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first String");
        String firstString = sc.nextLine();

        System.out.println("Enter the first String");
        String secondString = sc.nextLine();

        if(checkForAnagram(firstString,secondString)){
            System.out.println("Yes these strings are anagram");
        } else {
            System.out.println("no, these strings are not anagram");
        }
    }

    private static boolean checkForAnagram(String firstString, String secondString) {
        if(firstString.length() != secondString.length()){
            return false;
        }

        char[] firstStringToCharArray = firstString.toCharArray();
        Arrays.sort(firstStringToCharArray);

        char[] secondStringToCharArray = secondString.toCharArray();
        Arrays.sort(secondStringToCharArray);

        boolean isAnagram = true;
        for( int i = 0; i< firstString.length()-1; i++){
            if(firstStringToCharArray[i] != secondStringToCharArray[i]){
                isAnagram = false;
            }
        }

        return isAnagram;
    }
}
