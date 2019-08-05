/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bhavani
 */
public class greternnestedif 
{
  public static void main(String[] org)
  {
      int a=7,b=8,c=6;
      if(a>b)
      {
          if(a>c)
          {
              System.out.println("a is greate than b and c");
          }
          else
              System.out.println("c is greater than a and b");
      }
      else
      {
          if(b>c)
               System.out.println("b is greater than a and c");
          else
               System.out.println("c is greater than a and b");
      }
  }
}
