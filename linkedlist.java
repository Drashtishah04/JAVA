import java.util.*;  
public class linkedlist
{
    public static void main(String p[])
    {
        LinkedList< String > lnklst=new LinkedList<>();
        lnklst.add("This");
        lnklst.add("is");
        lnklst.add("LINKEDLIST");
        lnklst.add("EXAMPLE");
        System.out.println(lnklst);
        System.out.println("Display Data using ITERATOR : ");
        Iterator< String > move=lnklst.iterator();
        while(move.hasNext())
        {
            System.out.println(move.next());
        }

        System.out.println("Remove EXAMPLE from the LinkedList : ");
        lnklst.remove("EXAMPLE");
        System.out.println(lnklst);
        System.out.println("Display in DESC ORDER : ");
        Iterator move1=lnklst.descendingIterator();  
        while(move1.hasNext())
        {
            System.out.println(move1.next());
        } 
    }
}

/*
PS C:\drashti\java> javac linkedlist.java
PS C:\drashti\java> java linkedlist
[This, is, LINKEDLIST, EXAMPLE]
Display Data using ITERATOR :
This
is
LINKEDLIST
EXAMPLE
Remove EXAMPLE from the LinkedList :
[This, is, LINKEDLIST]
Display in DESC ORDER :
LINKEDLIST
is
This
*/  