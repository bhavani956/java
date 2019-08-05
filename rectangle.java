// without passing arguments
class rectangle {
    int l,b;
    void area()
    {
        int a;
        a=l*b;
        System.out.println("area of rectangle="+a);
    }
    void perimeter()
    {
        int p;
        p=2*(l+b);
        System.out.println("perimetr of rectangle="+p);
    }
 }
class rectangle1
 {
     public static void main(String[] args)
    {
        rectangle ob= new rectangle();
         ob.l=10;
         ob.b=5;
         ob.area();
        ob.perimeter();
    }
 }
