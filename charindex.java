import java.util.*;
/*class character
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter string");
          	 String a=ob.nextLine();
	  	 System.out.println(a);
		char s=a.CharAt(3);
		System.out.print(s);

	}
}*/
class CharAtExample
{  
	public static void main(String args[])
	{  
	   Scanner ob=new Scanner(System.in);
	   System.out.println("enter string");
	   String name=ob.nextLine();
	   System.out.println(name);
	   char ch=name.charAt(4);//returns the char value at the 4th index  
	    System.out.println(ch);  
	}
} 