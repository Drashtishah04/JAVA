import java.util.*;
public class MapEx
{
    public static void main(String p[])
    {
        Map< String , String > map=new HashMap< String , String >();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        System.out.println(map);
        for(Map.Entry data: map.entrySet())
        {
            System.out.println(data);
        }
    }
}


/*{key1=value1, key2=value2, key3=value3}
key1=value1
key2=value2
key3=value3 */