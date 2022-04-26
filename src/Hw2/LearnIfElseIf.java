package Hw2;

import java.util.Scanner;

public class LearnIfElseIf {


    public void getscore() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Score to get the Grade");
        double score = input.nextDouble();

        if (score >= 94 && score <= 100) {
            System.out.println("you get Excellent");
        } else if (score >= 90 && score <= 93) {
            System.out.println("you get very Good");
        } else if (score >= 85 && score <= 89) {
            System.out.println("you get  Good");
        } else if (score >= 80 && score <= 84) {
            System.out.println("you get Average");
        } else if (score >= 70 && score <= 79) {
            System.out.println("you get pass");
        } else if (score >= 60 && score <= 69) {
            System.out.println("you get poor");
        } else if (score >= 50 && score <= 59) {
            System.out.println("you need to Repeat this course");
        } else {
            System.out.println("you are fail");
        }
    }


    public static void main(String[] args) {

        LearnIfElseIf get = new LearnIfElseIf();
        get.getscore();

    }

//for(
//    int i = 5;
//    i <=10;
//    i++)
//            System.out.println("fahim")


}








