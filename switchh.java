/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bhavani
 */
public class switchh {
    public static void main(String[] args)
    {
        int a=70,b=30,c;
        char op='+';
        switch(op)
        {
            case '+': c=a+b;
                System.out.println(c);
                break;
            case '-': c=a-b;
                System.out.println(c);
                break;
            case '*': c=a*b;
                System.out.println(c);
                break;    
            case '/': c=a/b;
                System.out.println(c);
                break;
            default:
                System.out.println("Invalid option");
        }
        
    }
}
