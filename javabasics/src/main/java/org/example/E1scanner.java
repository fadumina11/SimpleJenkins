package org.example;

import java.util.Scanner;

public class E1scanner {
    public static <scanner> void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("what is your age?");
        int age=scan.nextInt();
        if(age>50){
            System.out.println("you will get 10% discount on toys");
        }

    }
}
