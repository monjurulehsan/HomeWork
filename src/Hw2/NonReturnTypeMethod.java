package Hw2;

public class NonReturnTypeMethod {

public void home(){

    System.out.println( "This is Nonreturn Type Method Without Parameter");

}
public void home1(){
    int price1=30;
    int price2=70;
    int total=price1+price2;
    System.out.println("total price="+ " " +total);
}
    public void home2(){
        int price1=10;
        int price2=20;
        int total=price1*price2;
        System.out.println("total price="+ " " +total);
    }
    public void home3(){
        int price1=20;
        int price2=10;
        int total=price1/price2;
        System.out.println("total price="+" "+total);
    }
    public void home4(){
        int price1=20;
        int price2=10;
        int price3=20;

        int total= price1+price2+price3;
        System.out.println("total price="+ " " +total);
    }
    public static void main(String[] args) {

        NonReturnTypeMethod hwobj=new NonReturnTypeMethod();
        hwobj.home();
        hwobj.home1();
        hwobj.home2();
        hwobj.home3();
        hwobj.home4();



    }



}
