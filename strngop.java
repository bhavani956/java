import java.util.*;
class strings
{
	public static void main(String[] args)
	{
	    System.out.printf("hi");
	    System.out.println();
	    String a="bhavani";
	    System.out.println(a);

	    String b,c,d,e,f;

	    b=a.toUpperCase();
	    System.out.println(b);
	    c=b.toLowerCase();
	    System.out.println(c);
	    d=a.substring(1,5);
	    System.out.println(d);
	    e=a.replace('a','k');
	    System.out.println(e);
	    f=a.replaceFirst("bha","satya");
	    System.out.println(f);	
	    int g=a.indexOf('v');
	    System.out.println(g);
	    int h=a.lastIndexOf('n');
	    System.out.println(h);
	    boolean i=a.startsWith("bs");
	    System.out.println(i);
	
	}
}
