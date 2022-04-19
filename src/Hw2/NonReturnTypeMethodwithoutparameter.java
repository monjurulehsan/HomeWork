package Hw2;

public class NonReturnTypeMethodwithoutparameter {

public void home(int num1,int num2){

 int total= num1+num2;

 System.out.println("total num="+" "+total);

}
    public void home1(int num1,int num2,int num3,int num4){

        int total= (num1+num2+num3)*num4;

        System.out.println("total num="+" "+total);

}
    public void home2(int num1,int num2,double num3,double num4){

        double total= (num1+num2+num3)*num4;

        System.out.println("total num="+" "+total);

    }

    public void home3(String fname,String lname){

        String fullname= fname + lname;

        System.out.println("full name="+ " " + fullname);

    }
    public void home4(double num1,double num2,int num3){

        double total= num1+num2-num3;

        System.out.println("total num="+" "+total);

    }


    public static void main(String[] args) {


        NonReturnTypeMethodwithoutparameter hwobj=new NonReturnTypeMethodwithoutparameter();

        hwobj.home(12,8);
        hwobj.home1(12,8,10,5);
        hwobj.home2(12,8,10.5,5.5);
        hwobj.home3("0rpi", "jamal");
        hwobj.home4(10,5,10);
    }

}
