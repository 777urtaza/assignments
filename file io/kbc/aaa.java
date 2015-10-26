import java.util.*;
import java.io.*;

class aaa{
	public static void main(String []args)
	{
		File file=null;
		file=new File("a.txt");
		Scanner input=null;
		try
		{
			input=new Scanner(file);
		}catch(Exception ex){}
		input.findInLine("Q10)");
		System.out.print(input.nextLine());
	}
}