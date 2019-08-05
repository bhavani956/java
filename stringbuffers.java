import java.util.*;
class bufferstrings
{
	public static void main(String[] args)
	{
		
	 	Scanner ob=new Scanner(System.in);
	    	System.out.println("enter string ");
	        String s=ob.nextLine();
		System.out.println(s);

		String s1="priya";
		String b="hello";
	        String c=b.replace('l','a');
		System.out.println(c);

		StringBuffer str=new StringBuffer("mahima");
		System.out.println("this is original string \t :"+str); 
		str.append(s1);						// appending string //
		System.out.println( " modified string is \t : "+str);

		//  *****************  set character at nth position ****************8//
		
		String s2,s3;
		str.setCharAt(3,'m');
		System.out.println("after replacing   \t " +str);

		// ***************   inserting at nth place **********88//
		String e="satya";
		String d="bhavani";
		str.insert(4,d);      // modifying the previous string  //
		System.out.println(str);
	       
		int a=10;
		System.out.println(String.valueOf(a));

	        
		 
	}
}