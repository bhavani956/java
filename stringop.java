import java.util.*;
class stringoperations
{
	public static void main(String[] args)
	{
	   Scanner ob=new Scanner(System.in);
	   System.out.print("enter string1: ");
           String s=ob.nextLine();
	   Scanner ob1=new Scanner(System.in);
	   System.out.print("enter string2: ");
           String s1=ob1.nextLine();
	   String s2;
	System.out.print("After Concatenation: ");
	   s2=s.concat(s1);
	   System.out.print(s2);   
	}
}

class comparision
{
	public static void main(String[] args)
	{

	   Scanner aa=new Scanner(System.in);
	   System.out.println("enter string");
           String a1=aa.nextLine();           
           Scanner bb=new Scanner(System.in);
	   System.out.println("enter string");
           String b1=bb.nextLine(); 
	   int c;
	   c=a1.compareTo(b1);
	   System.out.println(c);
           System.out.println();

	}
}


              	 