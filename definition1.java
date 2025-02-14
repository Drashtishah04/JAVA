import java.util.*;
abstract class student
{
    abstract void home1();
}
class subject extends student
{
    void home1()
    {
        System.out.println("hii");
    }
}
class home1{
    public static void main(String s[])
    {
        home1();
    }
    public static void home1()
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value: ");
        a=sc.nextInt();
        System.out.print("Enter value: ");
        b=sc.nextInt();
        c=a+b;
        System.out.println("sum :"+c);
        c=a-b;
        System.out.println("sub :"+c);
        c=a*b;
        System.out.println("mul :"+c);
        c=a/b;
        System.out.println("div :"+c);
    }
}