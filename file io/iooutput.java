import java.util.*;
import java.io.*;

class iooutput{
	public static void main(String []args)
	{
		Scanner input=null;
		File file=null;
		file= new File("t.txt");
		if(file.exists())
		{
			System.out.println("Cannot creat file already exist");
		}
		else
		{
			try{
				file.createNewFile();
			}catch(Exception ex){}
		}
		
		PrintWriter printWriter=null;
		
		try{
			printWriter=new PrintWriter(file);
		}catch(Exception ex){}
		for(int i=1; i<=100; i++)
		printWriter.write("Q"+i+". this is question no."+i+ "? \r\n");
		printWriter.close();
		FileReader f=null;
		try{
			f=new FileReader("t.txt");
		}catch(Exception ex){}
		BufferedReader b=new BufferedReader(f);
		input=new Scanner(b);
		
		System.out.println(input.nextLine());
	}

}