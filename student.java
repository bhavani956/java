/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bhavani
 */
public class student {
    int rno,phno;
    void display()
    {
        System.out.println("roll no="+rno);
        System.out.println("ph n0="+phno);
    }
}
class student_test
{
    public static void main(String[] args)
    {
        student s1=new student();
        s1.rno=956;
        s1.phno=8919;
        s1.display();
    }
}
