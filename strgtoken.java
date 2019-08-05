import java.util.StringTokenizer;
import java.util.*;
class strgtoken
{
	public static void main(String[] args)
	{
	StringTokenizer ob=new StringTokenizer("hi, how r u.?");
	StringTokenizer ob1=new StringTokenizer("bhavani ?satya","?");
	StringTokenizer ob2=new StringTokenizer("bhavani,satya","I","true");
	StringTokenizer ob3=new StringTokenizer("bhavanisatya",",");
	StringTokenizer ob4=new StringTokenizer("how are u");
	System.out.println(ob.nextToken());
	System.out.println(ob1.nextToken());
	System.out.println(ob2.nextToken());
	System.out.println(ob2.nextToken());
	System.out.println(ob2.nextToken());
	System.out.println(ob3.nextToken());
	System.out.println(ob4.nextToken());
	System.out.println(ob4.nextToken());
	while(ob4.hasMoreToken())
	 { 
	  System.out.println(ob.countToken());
	 }

	}
}