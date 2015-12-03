import java.util.*;
import java.io.*;

class iofabonaci{
	
	
	static int [] arc=new int [10];
	static int counter=0;
	
	
	public static void main(String [] args)
	{
		recursion(0,1);
		
		String s="";
		//converting int array to string, so it could be printed in file
		for(int i=0; i<arc.length; i++)
			s=s+arc[i]+",";
		
		try{
			File file=new File("abc.txt");
			PrintWriter pw=new PrintWriter(new File("abc.txt"));
			pw.write(s);
			pw.close();
		}
		catch(Exception ex){}
	}
	
	static void recursion(int a, int b)
	{
		
		if (a>36)
			return;
		
		arc[counter]=a;
		//System.out.print(a+",");
		counter++;
		recursion(b,b+a);
	}
}