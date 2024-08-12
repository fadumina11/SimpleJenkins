package org.syntax;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter number:");
        int num=scanner.nextInt();
        //1. using algorithm
        int rev=0;
         while (num!=0){
             rev=rev*10 + num%10;
             num=num/10;
         }

        System.out.println("Reverse number is:" + rev);
    }

}
