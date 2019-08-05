/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bhavani
 */
public class reverse {
    public static void main(String[] args)
    {
        int n=12345,b,sum=0;
        while(n!=0)
        {
            b=n%10;
            sum=(sum*10)+b;
            n=n/10;
        }
        System.out.println("reverse number is: "+sum);
    }
}
