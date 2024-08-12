package org.syntax;

public class numberSwipe {
    public static void main(String[] args) {
        int a= 10, b=20;
        System.out.println("before swapping values are.." +a+" "+b);
        //logical third variable
        int t=a;
        a=b;
        b=t;
        System.out.println("After swapping values are.." +a+" "+b);

        //logic 2 use -+ without third variable
        //
       /*a=a+b; //10+20=30
        b=a-b; //30-20=10
        a=a-b; //30-10=20*/

        //logic 3 use multiplication without using third variable
        //here values of a and b should not be zero

       /* a=a*b; // 10*20=200
        b=a/b; // 200/20
        a=a/b;  // 200/10*/

        //logic 4 bitwise xor(^)
     /*   a=a^b; //30
        b=a^b;  //10
        a=a^b;  //20*/

        //logic 5 single statement
        b=a+b-(a=b);


    }
}
