/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bhavani
 */
public class fibanocii {
    public static void main(String[] args)
    {
        int n=10,a=0,b=1,c,i;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(i=2;i<n;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
