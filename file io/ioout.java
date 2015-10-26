import java.util.*;
import java.io.*;

class ioout{
	public static void main(String []args)
	{
		Scanner input;
		input=new Scanner(System.in);
		
		System.out.print("\nPlease Enter your filename: ");
		String fn=input.next();
		
		File file=null;
		
		file=new File(fn);
		if(file.exists())
		{
			System.out.print("\nFile already exists");
			return;
		}
		else
		{
			try{
			file.createNewFile();
			}
			catch(Exception ex){}
		}
			PrintWriter pw=null;
			try{
			pw=new PrintWriter(file);
			}catch(Exception ex){}
			System.out.print("Enter text: ");
			input.nextLine();
			// String a=input.nextLine();
			for(int i=1; i<=100; i++)	
			pw.write("qno "+i+" is this ?\r\n");
			pw.close();
		
	}
}