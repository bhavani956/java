class test
{
int a;
test()
{
a=15;
System.out.println("constructor: "+a);
}
int display()
{
a=45;
return a;
}
void print(int x)
{
a=x;
System.out.println("initialise: "+x);
}
int show(int x)
{
a=x;
return a;
}
}
class test_p
{
public static void main(String[] args)
{
test ob = new test();
int c=ob.display();
System.out.println(c);
ob.print(25);
int d=ob.show(35);
System.out.println("return: "+d);
}
}
