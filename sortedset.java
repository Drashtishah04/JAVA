import java.util.*;
public class sortedset
{
    public static void main(String p[])
    {
        SortedSet ss=new TreeSet();
        ss.add("This");
        ss.add("is");
        ss.add("Data");
        ss.add("of");
        ss.add("a");
        ss.add("SortedSet");
        System.out.println(ss);
        System.out.println("Display using loop : ");
        for(Object o:ss)
        {
            System.out.println(o);
        }
    }
}



/*PS C:\diya> javac sortedset.java
PS C:\diya> java sortedset
[Data, SortedSet, This, a, is, of]
Display using loop :
Data
SortedSet
This
a
is
of
*/