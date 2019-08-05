import java.util.*;
class random
{
public static void main(String[] args)
{
int a=2,d=6,i;
float b;
double c;
Random ob=new Random();
a=ob.nextInt();
for(i=a;i<d;i++)
{
System.out.println(i);
}
b=ob.nextFloat();
System.out.println(b);
c=ob.nextDouble();
System.out.print(c);
}
}
