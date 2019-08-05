/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bhavani
 */
public class leap1 {
    public static void main(String[] args)
    {
        int y=2100;
        if((y%400==0)||y%100!=0&&y%4==0)
            System.out.println("given year is leap year");
        else
            System.out.println("given year is not a leap year");
    }
}
