class arrow{
	public static void main(String []args)
	{
		int s=0;
		for (int i=0; i<10; i++)
		{
			for (int i2=0; i2<10-i; i2++)
			{
				System.out.print(" ");
			}
			
			for(int i3=0; i3<=s; i3++)
			{
				System.out.print("*");
			}
			s+=2;
			
			System.out.print("\n");
		}
		
		for(int i=0;i<10; i++)
		{
			for(int i2=0; i2<6; i2++)
			{
				System.out.print(" ");
			}
			
			for(int i3=0; i3<9 ; i3++)
			{
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}
}