class diamond{
	public static void main(String []args)
	{
		int s=0;
		for(int i=0; i<6; i++)
		{
			for(int i2=0; i2<6-i; i2++)
			{
				System.out.print(" ");
			}
			
			System.out.print("*");
			
			for(int i3=0; i3<s; i3++)
			{
				System.out.print(" ");
			}
			if(i<1)
			{
			s+=1;
			}
			else
			{
				s+=2;
			}
			if(i!=0)
			System.out.print("*");
			System.out.print("\n");
		}
		
		int s1=0;
		int s2=0;
		for(int i=0; i<7; i++)
		{
			for(int i2=0; i2<s1; i2++)
			{
				System.out.print(" ");
			}
			
			System.out.print("*");
			
			for(int i3=0; i3<11-s2; i3++)
			{
				System.out.print(" ");
			}
			
			s2+=2;
			s1+=1;
			
			if(i!=6)
			System.out.print("*");
			System.out.print("\n");
			
		}
		
	}
}