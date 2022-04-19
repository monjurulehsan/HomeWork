package Hw2;

public class ReturnTypeMethodWithoutParameter {
    public int doSum(){
        int fnumber1=50;
        int fnumber2=60;
       int total = fnumber1+fnumber2;

        System.out.println( total);

        return total;
    }

    public double doMulti(){
        double fnumber1=120;
        int fnumber2=80;
        double total = fnumber1+fnumber2;

        System.out.println(total);

        return total;
    }
    public String customerName(){
        String fname= "orpi";
        String lname= "jamal";
        String fullname = fname + " " +lname;

        System.out.println(fullname);

        return fullname;
    }
    public double doMulti1(){
        double fnumber1=20;
        int fnumber2=10;
        double total = fnumber1*fnumber2;

        System.out.println(total);

        return total;
    }
    public boolean foodisgood(){
        boolean foodisgood= true;
        System.out.println(foodisgood);

        return foodisgood;
    }

    public static void main(String[] args) {

        ReturnTypeMethodWithoutParameter hwobj = new ReturnTypeMethodWithoutParameter();


      hwobj.doSum();
      hwobj.doMulti();
      hwobj.customerName();
      hwobj.doMulti1();
      hwobj.foodisgood();


    }

}