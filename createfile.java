import java.io.*;
public class createfile
{
	public static void main(String s[])
	{
		try{
			File f=new File("C:\\drashti\\java\\filecreate.txt");
			if(f.createNewFile())
			{
				System.out.println("File created");
			}
			else
			{	
				System.out.println("File already exist");
			}
		}catch(Exception e)
		{	
			e.printStackTrace();
		}
		
	}
}