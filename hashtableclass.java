import java.util.*;  
public class hashtableclass
{
    public static void main(String p[])
    {
        Hashtable< String,String > hash=new Hashtable< String,String >();
        hash.put("Name","shah drashti");
        hash.put("Address","6, gokul tenament , shital park , Rajkot");
        hash.put("Contact No","456789654");
        hash.put("WORK","Development");
        System.out.println("Display HASHTABLE DATA : "+hash);
        hash.put("Address","6 , gokul tenament , Opp. lizat papad , Near shital park , Rajkot");
        System.out.println("UPDATE HASHTABLE DATA using key : "+hash);
        System.out.println("Display Data Using MAP : ");
        for(Map.Entry dir:hash.entrySet())
        {
            System.out.println("Key => "+dir.getKey()+" , Value => "+dir.getValue());
        }
        hash.remove("WORK");
        System.out.println("Display After Remove (WORK): \n"+hash);

    }
}


/*
PS C:\drashti\java> javac hashtableclass.java
PS C:\drashti\java> java hashtableclass
Display HASHTABLE DATA : {Name=shah drashti, Contact No=456789654, WORK=Development, Address=6, gokul tenament , shital park , Rajkot}
UPDATE HASHTABLE DATA using key : {Name=shah drashti, Contact No=456789654, WORK=Development, Address=6 , gokul tenament , Opp. lizat papad , Near shital park , Rajkot}
Display Data Using MAP :
Key => Name , Value => shah drashti
Key => Contact No , Value => 456789654
Key => WORK , Value => Development
Key => Address , Value => 6 , gokul tenament , Opp. lizat papad , Near shital park , Rajkot
Display After Remove (WORK):
{Name=shah drashti, Contact No=456789654, Address=6 , gokul tenament , Opp. lizat papad , Near shital park , Rajkot}
*/
