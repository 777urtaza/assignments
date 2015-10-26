import java.util.*;
import java.io.*;

class kbc{
	static Scanner input=null;
	static Scanner input1=null;
	static String a,b;
	static int w=0; //question number
	static int []arr=new int [100];
	


	public static void main(String []args)
	{
		File file=new File("a.txt");
		input1=new Scanner(System.in);
		try{
			input=new Scanner(file);
		}catch(Exception ex){}
		
		random();
		// int i1=0;

		for(;;)
		{
			// System.out.print("\nfor repeat\n");
			
			while(input.hasNext())
			{
				// System.out.print("\nwhile repeat\n");
				a=Integer.toString(arr[w]);
				if(input.next().equals("Q"+a+")")) //e.g Q2
				{
					System.out.print("Q"+a+")");
					for(int i=0; i<6; i++)
					System.out.println(input.nextLine());
					
					b=input1.next();
					dec(b);
					
					System.out.print("\n");
					
				
				}
				if(!input.hasNext())
				{
					try{
						input=new Scanner(file);
					}catch(Exception ex){}
				}
				if(w>15) // 15 questions asked terminate the program
					return;
				
			}			
		}
		
	}
	
	static void dec(String x)
	{
		// for(;;)
		// {
			a=Integer.toString(w);
			// while(input.hasNext())
			// {
				//generating 5050
				if(x.equalsIgnoreCase("f"))
				{
					// System.out.print("Q"+a+")");
					for(int i=0; i<2; i++)
					System.out.println(input.nextLine());
					x=input1.next();
					
					// System.out.println(input.next());
					if(x.equalsIgnoreCase(input.next()))//---> from here new action
					{
						System.out.print("    Answer Correct!\n");
						System.out.println("--->"+a+"<----");
					}
					else
					{
						System.out.print("    wrong\n");
						System.out.println("--->"+a+"<----");
					}
					
						w+=1;
					// if(w==4)
					// {
						return;
					// }
				}
				
				// System.out.println(input.next());
				input.nextLine();
				input.nextLine();
				
				if(x.equalsIgnoreCase(input.next()))
				{
					System.out.print("   Answer Correct!\n");
					System.out.println("--->"+a+"<----");
				}
				else
				{
					System.out.print("   wrong\n");
					System.out.println("--->"+a+"<----");
				}
					
				w+=1;
				// if(w==4)
				// {
				// }
					return;
			// }
		// }
	}
	
	static void random()
	{
		
		int s;
		int c=0;
		for(int i=0;i<100; i++)
		{
			s=rand();
			for(int i2=0; i2<i; i2++)
			{
				if(s==arr[i2])
				{
					s=rand();
					i2=0;
				}
			}
			arr[i]=s;
			
			c+=1;
				//System.out.println(c+". "+arr[i]);
		}
	}
	
	static int rand()
	{
		Random rand=new Random();
		int a;
		a=rand.nextInt(100)+1;
		
		return a;
	}

}