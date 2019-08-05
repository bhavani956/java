class test
{
int a;
test()
{
a=10;
System.out.println(a);
}
void display(test ob)
{
System.out.println("intialise: "+ob.a);
a=ob.a;
System.out.println("value: "+a);
}
}
class test_m
{
public static void main(String[] args)
{
test ob = new test();
ob.a=80;
test ob2 = new test();
ob2.display(ob);
ob.a=70;
ob2.display(ob);
}
}