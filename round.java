
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
        float i;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number...");
        i=obj.nextFloat();
        System.out.println("Round off..."+Math.round(i));
    }
}
