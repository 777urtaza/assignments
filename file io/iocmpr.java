import java.util.*;
import java.io.*;

class iocmpr{
	public static void main(String [] args)
	{
		// Scanner input=null;
		// FileReader fileReader=null;
		// try{
			// fileReader=new FileReader("abc.txt");
		// }
		// catch(Exception ex){}
		// input=new Scanner(fileReader);
		// while(input.hasNext())
		// {
			// System.out.println(input.next());
		// }
		
//-----------------------------------------------------------------------------------
		Scanner input=null;
		try{
			input=new Scanner(new File("abc.txt"));
		}
		catch(Exception ex){System.out.print("file input error");}
		while(input.hasNext())
		{
			System.out.print(input.next());
		}
		
//-------------------------------------------------------------------------------------		
		
		// Scanner input=null;
		// try{
			// input= new Scanner(new BufferedReader(new FileReader("abc.txt")));
		// }
		// catch(Exception ex){}
		// while(input.hasNext())
		// {
			// System.out.println(input.nextLine());
		// }
		
//-----------------------------------------------------------------------------------
		// Scanner input=null;
		// FileReader fileReader=null;
		// try
		// {
			// fileReader=new FileReader("abc.txt");
		// }
		// catch(Exception ex){}
		
		// BufferedReader bufferedReader=null;
		// bufferedReader=new BufferedReader(fileReader);
		// input=new Scanner(bufferedReader);
		
		// while(input.hasNext())
		// {
			// System.out.println(input.nextLine());
		// }
	}
}