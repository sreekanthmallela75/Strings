package com.strings;

public class CountCharacter {
    public static void main(String[] args) {
        CountCharacter.countCharacter();

    }

    public static void countCharacter() {
        String s = "This is string class";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

           if (s.charAt(i)!= ' '){

                count++;

            }
        }
        System.out.println(count);

    }
}


