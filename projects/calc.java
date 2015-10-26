import java.util.*;
import java.lang.*;

class calc{
	
	static Scanner input=new Scanner (System.in);
	
	public static void main(String [] args)
	{
		
		
		System.out.println("Press + to sum");
		System.out.println("Press - to subtract");
		System.out.println("Press / to divide");
		System.out.println("Press * to multiply");
		System.out.println("Press sqr for square root");
		System.out.println("Press % to percentage");
		
		System.out.print("\n   ");
		String s=input.next();
		
		double sum=0;
		double subt=0;
		double mult=0;
		double divi=0;
		double perc=0;
		double sqrtt=0;

		if(s.equalsIgnoreCase("+"))
		{
			sum=add();
			System.out.println("\n------>Your sum is: " + sum);
		}
		if(s.equalsIgnoreCase("-"))
		{
			subt=sub();
			System.out.println("-------->Answer is: "+ subt);
		}
		if(s.equalsIgnoreCase("*"))
		{
			mult=mul();
			System.out.println("-------->Answer is: "+ mult);
		}
		if(s.equalsIgnoreCase("/"))
		{
			divi=div();
			System.out.println("-------->Answer is: "+ divi);
		}
		if(s.equalsIgnoreCase("%"))
		{
			perc=per();
			System.out.println("-------->Answer is: "+ perc);
		}
		if(s.equalsIgnoreCase("sqr"))
		{
			sqrtt=sqrt();
			System.out.println("-------->Answer is: "+ sqrtt);
		}
		
		
	}
	
	static double add()
	{
		System.out.print("How many numbers you want to ADD?  ");
		int a=input.nextInt();
		System.out.print("\n");
		
		double b=0;
		double arr[]= new double[a];
		for(int i=0; i<a; i++)
		{
			if(i==0)
				System.out.print("\nEnter the FIRST number please: ");
			
			if(i>0 && i<a-1)
			System.out.print("\nEnter your NEXT number: ");
			
			if(i==a-1)
				System.out.print("\nEnter LAST number please: ");
			
			arr[i]=input.nextDouble();
			b=b+arr[i];
		}
		return b;
	}
	
	static double sub()
	{
		System.out.print("The number you want to SUBTRACT from?  ");
		double a=input.nextDouble();
		String s;
		do
		{		
			System.out.print("   "+a+" - " );
			double b=input.nextDouble();
			a=a-b;
			System.out.print("  = "+a+"\n");
			
			System.out.print("Do you want to subtract more? (y/n) \n");
			s= input.next();
			
		}while (s.equalsIgnoreCase("y"));
		return a;
	}
	
	static double mul()
	{
		System.out.print("Enter any number:  ");
		double a=input.nextDouble();
		String s;
		do
		{		
			System.out.print("   "+a+" x " );
			double b=input.nextDouble();
			a=a*b;
			System.out.print("  = "+a+"\n\n");
			
			System.out.print("Do you want to multiply more? (y/n) \n");
			s= input.next();
			
		}while (s.equalsIgnoreCase("y"));
		return a;
	}
	
	static double div()
	{
		System.out.print("Enter any number:  ");
		double a=input.nextDouble();
		String s;
		do
		{		
			System.out.print("   "+a+" ÷ " );
			double b=input.nextDouble();
			a=a/b;
			System.out.print("  = "+a+"\n\n");
			
			System.out.print("Do you want to multiply more? (y/n) \n");
			s= input.next();
			
		}while (s.equalsIgnoreCase("y"));
		return a;
	}
	
	static double per()
	{
		double a;
		String s;
		do
		{	
			System.out.print("Enter percentage:  ");
			a=input.nextDouble();		
			System.out.print(" "+a+" percent of: " );
			double b=input.nextDouble();
			a=(a/100.00)*b;
			System.out.print("  = "+a+"\n\n");
			
			System.out.print("Do you want to multiply more? (y/n) \n");
			s= input.next();
			
		}while (s.equalsIgnoreCase("y"));
		return a;
	}
	static double sqrt()
	{
		double a;
		String s;
		do
		{	
			System.out.print("Sqare root of:  ");
			a=input.nextDouble();		
			
			System.out.print("  = "+Math.sqrt(a)+"\n\n");
			
			System.out.print("again ? (y/n) \n");
			s= input.next();
			
		}while (s.equalsIgnoreCase("y"));
		return a;
	}
	
	
}