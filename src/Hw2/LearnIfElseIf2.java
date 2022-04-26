package Hw2;

import java.util.Scanner;

public class LearnIfElseIf2 {


    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
        System.out.println("  Covid vaccination requirement ");

        System.out.println("Did you get dose 1");
        String dose1 =input.nextLine();
    if(dose1.equalsIgnoreCase("Yes")) {
        System.out.println("you are eligible for next dose after two months");
         }
        System.out.println("two months is gone after  dose 1");
        System.out.println( "******");
        System.out.println("Did you get dose 2");
       String dose2= input.nextLine();
    if(dose2.equalsIgnoreCase("Yes")) {
        System.out.println("you are eligible for booster");
    }
   else {
        System.out.println("You are not eligible for Vaccination");
    }

    }

}
