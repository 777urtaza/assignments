import java.util.*;
import java.io.*;

class filegen{
	public static void main(String [] args)
	{
		File file=new File("a.txt");
		PrintWriter printWriter=null;
		try{
			printWriter=new PrintWriter(file);
		}catch(Exception ex){System.out.println("at pw.write");}
		
		char ch=64;
		char an=65;
		//printing questions and answers
		for(int i=1,count=1;i<=100;i++,count++)
		{
			ch=64;
			printWriter.write("Q"+count+") this is question"+i+"? \r\n");
			for(int i1=1; i1<=4;i1++)
			{
				ch+=1;
				printWriter.write(ch+") This is option "+ch+".\r\n");//e.g A) This is option A.
			}
			printWriter.write("Press f for fifty-fifty\r\n");
			
			//generating options for answers
			
			
			
			//generating options for fifty fifty
			ch=64;
			for(int ifi=0; ifi<2; ifi++)
			{
				an+=1;
				if(an>68)
					an=65;
				printWriter.write(an+") This is option "+an+".\r\n");
				// ch+=1;
				// if(ch<=an || ch>=an)
					// printWriter.write(ch+") This is option "+ch+".\r\n");
				// else
					// ifi--;
			}
			if(an>68)
				an=65;
			printWriter.write(an+"\r\n");
			an+=1;
		}
		printWriter.close();
	}
}