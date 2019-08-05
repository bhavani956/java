import java.util.*;
class geometry
{
int l,b;
float r;
double s,h;
void area(int x,int y)
{
l=x;
b=y;
System.out.println("area of rectangle: "+l*b);
}
void area(float a)
{
r=a;
System.out.println("area of circle: "+Math.PI*r*r);
}
void area(double a,double b)
{
s=a;
h=b;
System.out.println("area of triangle: "+0.5*s*h);
}
}
class g_p
{
public static void main(String[] args)
{
geometry ob=new geometry();
ob.area(10,5);
ob.area(10.0f);
ob.area(2.5,3.5);
}
}