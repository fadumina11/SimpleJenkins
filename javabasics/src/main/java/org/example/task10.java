

import org.example.string;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("what is your first name?");
        String name = scan.nextLine();

        System.out.println("how much do you spend on tea daily?");
        double tea = scan.nextDouble();

        System.out.println("how much do you spent on quruxlow monthly?");
        double quruxlow= scan.nextDouble();

        System.out.println(" you must be broke Man by spending your money eating out a lot!!");
    }
}
