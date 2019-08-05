import java.lang.String;
import java.util.*;
class userstring
{
	public static void main(String[] args)
	{
	   
	    Scanner ob=new Scanner(System.in);
	    System.out.print("enter the string: ");
	    String s=ob.nextLine();
	    
	    int n=s.length();
	    int i;
	   String b=" ";
	   for(i=n-1;i>=0;i--)
	   {	
		b=b+s.charAt(i);
	    }
	   System.out.print("reverse string is:");
	    System.out.print(b);
	}
}