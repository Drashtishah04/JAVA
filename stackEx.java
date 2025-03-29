import java.util.*;
public class stackEx
{
    public static void main(String p[])
    {
        Stack< String > st=new Stack<>();
        st.push("This");
        st.push("is");
        st.push("Data");
        st.push("of");
        st.push("Stack");
        st.push("Collection");
        System.out.println("Display Data : ");
        System.out.println(st);
        System.out.println("Remove last Data (pop) : ");
        st.pop();
        System.out.println(st);
        String data=st.peek();
        System.out.println("Peek Data is : "+data);
        System.out.println("Empty : "+st.empty());
        System.out.println("Size : "+st.size());
    }
}


/*Display Data : 
[This, is, Data, of, Stack, Collection]
Remove last Data (pop) :
[This, is, Data, of, Stack]
Peek Data is : Stack
Empty : false
Size : 5 */
