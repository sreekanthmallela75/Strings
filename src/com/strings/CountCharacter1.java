package com.strings;

public class CountCharacter1 {
    public static void main(String[] args) {
     CountCharacter1.countCharacters();
    }
    public  static void countCharacters() {
        String s1 = "The;,./ subject/,.; is java";

        int count1 = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ';'|| s1.charAt(i)==','|| s1.charAt(i)=='.'|| s1.charAt(i)=='/' ) {
              count1++;
            }
        }
        String s2 = "The subject is cpp";
        int count2 = 0;
        for (int i=0; i<s2.length(); i++){
            if (s2.charAt(i)!= ' '){
             count2++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
    }
}