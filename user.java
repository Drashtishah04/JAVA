class user
{
    user()
    {
        System.out.println("This is user");
    }
    public static void main(String a[])
    {
        new user();
        String s=a[0];
        System.out.print("Name: "+s);
    }
}