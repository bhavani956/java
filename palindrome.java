/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bhavani
 */
public class palindrome {
    public static void main(String[] args)
    {
        int a=12321,b,n,sum=0;
        n=a;
        while(n!=0)
        {
            b=n%10;
            sum=(sum*10)+b;
            n=n/10;    
        }
        if(sum==a)
            System.out.println(a+" is palindrome");
        else
            System.out.println(a+" is not palindrome");
    }
}
