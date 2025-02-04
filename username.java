import java.util.*;
class user
{
    user()
    {
        String nm;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter name: ");
        nm=sc.nextLine();
        System.out.println("Name: "+nm);
    }
    public static void main(String[] s)
    {
       new user();
    }
}