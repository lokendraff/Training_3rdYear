import java.util.*;
public class Subtraction{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter 1st number");
        int num1=sc.nextInt();
        System.out.print("enter 2nd number");
        int num2=sc.nextInt();
        int res=num1-num2;
        System.out.print("the result is:"+res);
    }
}