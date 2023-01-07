package com.strings;

public class AllSubsets {
    public static void main(String[] args) {
        AllSubsets.allSubsets();

    }

    public static void allSubsets() {


        String s = "Sreekanth";
        int n = s.length();
        int temp = 0;

        String[] arr = new String[n * (n + 1 / 2)];


        for (int i=0; i<n; i++) {
            for (int j = i; j < n; j++) {
                arr[temp] = s.substring(i, j +1);
                temp++;
            }
        }
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }
            }

    }
