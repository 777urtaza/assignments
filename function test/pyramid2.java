class right{
	public static void main(String [] args)
	{
		int s4=0;
		for(int i=0; i<10; i++)
		{
			for(int i1=0; i1<10-i; i1++)
			{
				System.out.print(" ");
			}
			for(int i2=0; i2<=s4; i2++)
			{
			System.out.print("*");
			}
			s4+=1;
			System.out.print("\n");
		}
		
		System.out.print("\n");
		
		for(int i=0; i<10; i++)
		{
			for(int i1=0; i1<=i; i1++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("");
		
		int s=0;
		for(int i=0; i<=10; i++)
		{
			for(int i1=0; i1<=10-i; i1++)
			{
				System.out.print(" ");
				
			}
			
			for(int i2=0; i2<=s; i2++)
			{
				System.out.print("*");
			}
			s+=2;
			System.out.print("\n");
		}
		
		System.out.println("");
		
		for(int i=0; i<10; i++)
		{
			for(int i1=0; i1<10-i; i1++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<10; i++)
		{
			System.out.print(" ");
			for(int i1=0; i1<10; i1++)
			{
					System.out.print("*");
			}
			System.out.println();
		}
	}
}