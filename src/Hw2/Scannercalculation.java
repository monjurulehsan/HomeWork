package Hw2;


import java.util.Scanner;

public class Scannercalculation {



    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);



        System.out.println( " yearly income and expenses of = ");
        String name=input.nextLine();
        System.out.println("income1 salary =");
        int salary=input.nextInt();
        System.out.println( "home rant="  );
        int rant=input.nextInt();
        System.out.println(salary-rant);
        System.out.println("car payment=");
        int car_payment=input.nextInt();
        System.out.println(salary-rant-car_payment);
        System.out.println("food expenses=");
        int food_expenses=input.nextInt();
        System.out.println(salary-rant-car_payment-food_expenses);
        System.out.println("other income=");
        int after_food_expenses=input.nextInt();
        int other_income=input.nextInt();
        System.out.println(salary-rant-car_payment-food_expenses+other_income);
        int total_income=input.nextInt();
        System.out.println(salary-rant-car_payment-food_expenses+other_income);
        int total_save=input.nextInt();


    }
}
