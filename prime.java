/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bhavani
 */
public class prime {
    public static void main(String[] args)
    {
        int i,j,c=0;
        for(i=2;i<=100;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==0)
            {
                System.out.print(i+" ");
            }
            else
                c=0;
        }
    }
}
