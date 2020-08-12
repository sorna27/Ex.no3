
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class round {
    public static void main(String[] arg){
        int c;
        Scanner obj=new Scanner(System.in);
      
        System.out.println("enter the number...");
        double a=obj.nextDouble();
        c=nin.nint(a);
        System.out.println("round off="+c);
    }
}
class nin
{
    static int nint(double a)
    {
        int b;
        b=(int) Math.round(a);
        return b;
    }
}
