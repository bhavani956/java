/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bhavani
 */
public class ex 
    {
        int a;
        void display()
        {
            a=10;
            System.out.println(a);
        }
    }
class test
{
   public static void main(String[] args)
   {
      ex obj =new ex();
      obj.display();
       obj.a=30;
       System.out.println(obj.a);
       obj.display();
   }
}