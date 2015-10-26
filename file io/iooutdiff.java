import java.util.*;
import java.io.*;

class iooutdiff{
	public static void main(String [] args)
	{
		if(args.length<2)
		{
			System.out.print("Enter two file names");
			return;
		}
		Scanner input=null;
		Scanner input1=null;
		try{
			input=new Scanner(new File(args[0]));
			input1=new Scanner(new File(args[1]));
		}
		catch(Exception ex){System.out.print("file input error");}
		while(input.hasNext() || input1.hasNext())
		{
			try{
				if(!input.next().equals(input1.next()))
				{
					System.out.print("char in a word is not same");
					return;
				}
			}
			catch(Exception ex)
			{
				System.out.print("word or line Not same"); return;
			}
		}
		System.out.print("Files are same");
		input.close();
	}
}