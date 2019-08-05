/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bhavani
 */
public class elseif 
{
    public static void main(String[] arg)
    {
        int a=9,b=6,c=7;
        if(a>b && c>b)
             System.out.println("a is greater than b and c");
        else
            if(b>c)
                 System.out.println("b is greater than a and c");
            else
                 System.out.println("c is greater than a and b");
    }
}
