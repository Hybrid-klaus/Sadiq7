package oops.handson;

public class calculator {
    public static int powerInt(int num1,int num2)
    {
        return  (int)Math.pow(num1,num2);

    }
   public static double powerDouble(double num1,Double num2)
    {
         return Math.pow(num1,num2);
    }

    public static void main(String args[])
    {
        System.out.println(powerInt(10,20));
        System.out.println(powerDouble(40,50.50));
    }
}
