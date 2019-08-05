public class coprimes {
    public static void main(String[] args)
    {
        int a=15,b=12,r;
        r=a%b;
        while(r!=0)
        {
            a=b;
            b=r;
            r=a%b;
        }
        if(b==1)
            System.out.println("given numbers are coprimes");
        else
            System.out.println("given numbers are not coprimes");
    }
}
