package Hw2;

public class ReturnTypeMethodWithParameter {

public String customerinfo( String name){

    System.out.println("customer name ="+ " " + name);
    return name;

}
public double doSum(double cnum1,double cnum2 ){
    System.out.println("total customer num"+ " " +(cnum1+cnum2));
    return cnum1+cnum2;
}
    public double doSum(double cnum1,double cnum2, double cnum3,double cnum4,double cnum5) {
        System.out.println("total customer num" + " " + (cnum1 + cnum2 + cnum3 + cnum4 + cnum5));
        return cnum1 + cnum2 + cnum3 + cnum4 + cnum5;
   }

public int productMalti(int pnum1,int pnum2,int pnum3,int pnum4){

    return pnum1*pnum2*pnum3*pnum4;
}
    public boolean productisAvailable(String proname,char proquntity,int proprice,boolean proavailable){
        System.out.println("proname=mask"+ " "+ "proquntity=8"+" "+"proprice=3"+" "+"proavailable=true");

    return proavailable;

    }

public static void main(String[] args) {

    ReturnTypeMethodWithParameter hwobj = new ReturnTypeMethodWithParameter();
    hwobj.customerinfo("orpi jamal");
    hwobj.doSum(7,3);
    hwobj.doSum( 7,3,5,5,10);

    System.out.println("total product ="+ " "+hwobj.productMalti(2,2,3,3));
    hwobj.productisAvailable("mask",'8',3,true);














    }




}
