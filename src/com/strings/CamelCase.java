package com.strings;
import java.util.Scanner;
public class CamelCase {




        public static String convertingToCamel(String s) {
            String[] str = s.split("\\s");
            //  for(int i = 0; i<str.length; i++){
            for (String vi : str) {


                String s1 = vi.substring(0, 1);
                String s2 = vi.substring(1);
                String s3 = s1.toUpperCase() + s2.toLowerCase();
                System.out.print(s3 + " ");

            }
            return " ";
        }

        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the String");
            String s = sc.nextLine();
            CamelCase.convertingToCamel(s);
        }
    }

