import java.util.Scanner;

class design5{
	
	public static void main(String [] args)
	{
		one();	//first 3 asteriks
		three();
		two();	//middle 2 asteriks
		three();
		one(); 	//last 3 asteriks
	}
	
	//function for 1st and last 3 asteriks lines
	static void one()
	{
		System.out.print("\n     ");
		for(int i=0;i<3;i++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
	}
	
	//function for the middle asteriks and spaces
	static void two()
	{
		for (int i=0; i<5; i++)
		{
			System.out.print("\n*");
			for(int counter=0; counter<11; counter++)
			{
				System.out.print(" ");
			}
			System.out.print("*\n");
		}
	}
	
	//function for the second first and second last asteriks
	static void three()
	{
		for (int i=0; i<1; i++)
		{
			System.out.print("\n  *");
			for(int counter=0; counter<7; counter++)
			{
				System.out.print(" ");
			}
			System.out.print("*\n");
		}
	}
	
	
}