
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
public class bool {
    public static void main(String[]arg){
        Scanner obj=new Scanner(System.in);
        majority m=new majority();
        int e;
        System.out.println("enter 3 boolean values:");
        boolean b=obj.nextBoolean();
        boolean c=obj.nextBoolean();
        boolean d=obj.nextBoolean();
       e=m.major(b,c,d);
       if(e==1)
       {
           System.out.println("true...");
       }
       else
       {
           System.out.println("false...");
       }
             
    }
}
class majority
{  
    int a;
    int major(boolean b,boolean c,boolean d)
    {
        if((b&&c)||(b&&d)||(c&&d))
        {
            
          return a=1;
        }
        else
           return a=0;

    }
}