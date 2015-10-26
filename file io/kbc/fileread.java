import java.util.*;
import java.io.*;

class fileread{
	static Scanner input=null;
	static String a,b;

	public static void main(String []args)
	{
		File file=new File("a.txt");
		Scanner input1=new Scanner(System.in);
		try{
			input=new Scanner(file);
		}catch(Exception ex){}
		
		
		int w=2; //question number
		for(;;)
		{
			while(input.hasNext())
			{
				a=Integer.toString(w);
				if(input.next().equals("Q"+a+")")) //e.g Q2
				{
					System.out.print("Q"+a+")");
					for(int i=0; i<6; i++)
					System.out.println(input.nextLine());
					
					b=input1.next();
					
					System.out.print("\n");
					
					//generating 5050
				if(b.equalsIgnoreCase("f"))
				{
					// System.out.print("Q"+a+")");
					for(int i=0; i<2; i++)
					System.out.println(input.nextLine());
					b=input1.next();
					
					// System.out.println(input.next());
					if(b.equalsIgnoreCase(input.next()))//---> from here new action
					{
						System.out.print("Answer Correct!");
					}
					else
					{
						System.out.print("wrong");
					}
					
						w+=1;
					if(w==5)
					{
						input.close();
						return;
					}
				}
				
				// System.out.println(input.next());
				input.nextLine();
				input.nextLine();
				
				if(b.equalsIgnoreCase(input.next()))
				{
					System.out.print("Answer Correct!");
				}
					else
					{
						System.out.print("wrong");
					}
					
						w+=1;
					if(w==5)
					{
						input.close();
							return;
					}
				}
			}			
		}
		
	}
	
	// static void dec(String x)
	// {
		
	// }

}