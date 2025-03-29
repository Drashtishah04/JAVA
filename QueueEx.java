import java.util.*;
public class QueueEx
{
    public static void main(String p[])
    {
        PriorityQueue que = new PriorityQueue<>();
        que.add("This");
        que.add("is");
        que.add("a");
        que.add("Example");
        que.add("of");
        que.add("Queue");
        System.out.println("Display Data : ");
        Iterator itr = que.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        que.remove();
        que.poll();
        System.out.println("Display After Remove two Elements : ");
        Iterator itr1 = que.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
    }
}



/*Display Data : 
Example
This
Queue
is
of
a
Display After Remove two Elements :
This
is
a
of */