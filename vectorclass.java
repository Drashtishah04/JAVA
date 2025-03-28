import java.util.*;  
public class vectorclass
{
    public static void main(String p[])
    {
        Vector< String > v=new Vector< String >();
        v.add("This");
        v.add("is");
        v.add("Data");
        v.add("TEST");
        System.out.println("Data Of VECTOR : "+v);
        System.out.println("Size of Vector : "+v.size());
        System.out.println("Capacity of Vector : "+v.capacity());
        System.out.println("Remove of Vector : "+v.remove("TEST"));
        System.out.println("Data Of VECTOR AFTER REMOVE : "+v);
    }
}


/*
PS C:\drashti\java> javac vectorclass.java
PS C:\drashti\java> java vectorclass
Data Of VECTOR : [This, is, Data, TEST]
Size of Vector : 4
Capacity of Vector : 10
Remove of Vector : true
Data Of VECTOR AFTER REMOVE : [This, is, Data]
*/