package org.example;

import java.util.Scanner;

public class E2scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("what is your grade?");
        char grade=scan.next().charAt(0);
        switch (grade){
            case 'A':
                System.out.println("Very good grade");
                break;
            case 'B':
                System.out.println("good Grade");
            case 'c':
                System.out.println("Average Grade");
                break;
            case 'D':
                System.out.println("Bad Grade");
                break;
            case 'F':
                System.out.println("You failed, you need to train it again");
                break;
            default:
                System.out.println("Wrong Grade Entered");
        }
    }
}
