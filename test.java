class test
{
test()
{
System.out.println("constructor");
}
void display()
{
System.out.println("hello");
}
void print()
{
System.out.println("hai");
display();
}
}
class test_p
{
public static void main(String[] args)
{
test ob = new test();
ob.display();
ob.print();
}
}
