package com.strings;

public class DivideString {
    public static void main(String[] args) {
        DivideString d = new DivideString();
        d.divideString();

    }
    public void divideString() {
        String s = "aaaabbbbcccc";
        int n = 3;
        int temp = 0;
        int len = s.length();
        int ch = len / n;

        String[] arr = new String[n];

        for (int i=0; i<len; i=i+ch){
            String s1 = s.substring(i,i+ch);
            arr[temp]=s1;
            temp++;
        }
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
