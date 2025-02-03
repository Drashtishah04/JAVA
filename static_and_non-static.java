class Test3
{
    public static void main (String[] a)
    {
        System.out.print("\n Main Method");
        Test3 t1=new Test3();
        t1.demo();
        view();
    }
    public void demo()
    {
        System.out.print("\n demo method");
    }
    public static void view()
    {
        System.out.print("\n view method");
    }
}