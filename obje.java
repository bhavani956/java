class student
{
int r;
long ph;
String name;
 void display()
 {
	System.out.println(r);
	System.out.println(ph);
	System.out.println(name);
 }
}
class details
{
public static void main(String[] args)
{
student s1=new student();
s1.r=30;
s1.ph=891947320;
s1.name="bhavani";
s1.display();
student s2=new student();
s2.r=31;
s2.ph=964003434;
s2.name="ramya";
s2.display();
}
}