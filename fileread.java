import java.io.*;
public class fileread
{
	public static void main(String s[])
	{
		try{
			FileReader fr=new FileReader("C:\\drashti\\java\\filewrite.txt");
			int i;
			while((i=fr.read())!=-1)
			{	
				System.out.print((char)i);
			}
			fr.close();
			System.out.println("\n");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}