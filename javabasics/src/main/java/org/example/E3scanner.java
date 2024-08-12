package org.example;

import java.util.Scanner;

public class E3scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=10;
        while (number>5){
            System.out.println("please enter a number");
            number=scan.nextInt();
        }
    }
}
