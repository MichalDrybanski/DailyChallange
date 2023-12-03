package org.example;

public class PalindromeNumber {
    public static void main(String[] args) {
        boolean isTrue = isPalindrome(121);
        System.out.println(isTrue);
    }
    private static boolean isPalindrome(int x){
        String parseToString = Integer.toString(x);
        char [] parts = parseToString.toCharArray();
        int half = parts.length/2;

        for(int index = 0; index < half; index++){
            if(parts[index] != parts[parts.length-index - 1]){
                return false;
            }
        }
        return true;
    }
}
