import java.util.*;
import java.io.*;

class assignmentioout{
	public static void main(String [] args)
	{
		File file=new File("hello.txt");
		if(file.exists())
		{
			System.out.print("File already exist");
			return;
		}
		try
		{
			file.createNewFile();
		}
		catch(Exception ex){}
		PrintWriter pw=null;
		try
		{
			pw=new PrintWriter(file);
		}
		catch(Exception ex){}
		
		for(int i=1; i<=100; i++)
		pw.write(i+",\r\n");
		
		pw.close();
	}
}