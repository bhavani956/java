// with passing arguments
class rectangle 
{
    int ar,p;
    void display(int l,int b)
    {
        ar=l*b;
        System.out.println("area of rectangle="+ar);
        p=2*(l+b);
        System.out.println("perimetr of rectangle="+p);
    }
 }
class rectangle1
 {
     public static void main(String[] args)
    {
        rectangle ob= new rectangle();
         int x=10,y=10;
         ob.display(x,y);
    }
 }
