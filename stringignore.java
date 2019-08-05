import java.util.*;
class ignore   // string comparision ignore case //
{
	public static void main(String[] args)
	{
	   Scanner ob=new Scanner(System.in);
	   System.out.println("enter string");
           String a=ob.nextLine();
	   System.out.println(a);
	   
	   Scanner ob1=new Scanner(System.in);
	   System.out.println("enter string");
           String a1=ob1.nextLine();
	   System.out.println(a1);
           
	   int s;
	   s=a.compareToIgnoreCase(a1);
       	   System.out.print(s);
	}
}
class equal
{
	public static void main(String[] args)
	{
	   Scanner ob2=new Scanner(System.in);
	   System.out.println("enter string");
           String a2=ob2.nextLine();
	   System.out.println(a2);

	   Scanner ob3=new Scanner(System.in);
	   System.out.println("enter string");
           String a3=ob3.nextLine();
	   System.out.println(a3);
	    System.out.println(a2.equals(a3));
	   
	}
}
          
class equalignore
{
	public static void main(String[] args)
	{
	   Scanner ob4=new Scanner(System.in);
	   System.out.println("enter string");
           String a4=ob4.nextLine();
	   System.out.println(a4);

	   Scanner ob5=new Scanner(System.in);
	   System.out.println("enter string");
           String a5=ob5.nextLine();
	   System.out.println(a5);
	    System.out.println(a4.equalsIgnoreCase(a5));
	}
}
         