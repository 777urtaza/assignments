import java.util.Scanner;

class design4{
	
	public static void main(String [] args)
	{
		one(); //first 10 asteriks
		two();  //middle 2 asteriks
		one(); //last 10 asteriks
	}
	
	//function for 1st and last 10 asteriks lines
	static void one()
	{
		System.out.print("\n");
		for(int i=0;i<9;i++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
	}
	
	//function for the middle asteriks and spaces
	static void two()
	{
		for (int i=0; i<7; i++)
		{
			System.out.print("\n*");
			for(int counter=0; counter<7; counter++)
			{
				System.out.print(" ");
			}
			System.out.print("*\n");
		}
	}
	
	
}