/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class counter {
    public static void main(String[] arg){
        sample obj1=new sample();
        obj1.incr();
        sample obj=new sample();
        obj.incr();
    }
   
}
class sample
{
    static int i=10;
    int j=20;
    void incr()
    {
        i++;//with static
        j++;//without static
        System.out.println("static variable i="+i+"\non-static variable j="+j);
    }
}