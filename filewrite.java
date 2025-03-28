import java.io.*;
import java.util.*;
public class filewrite
{
	public static void main(String s[])
	{
		try{
			File f=new File("C:\\drashti\\java\\filewrite.txt");
			if(f.createNewFile())
			{
				System.out.println("File CReated");
			}
			FileWriter fw=new FileWriter(f);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Data: ");
			String nm;
			nm=sc.nextLine();
			fw.write(nm);
			System.out.println("Data Inserted");
			fw.flush();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
}