class filleddiamond{
	public static void main(String []args)
	{
		int s=1;
		for(int i1=0; i1<5; i1++)
		{
			System.out.print("\n");	
			
			for(int i2=0; i2<4-i1; i2++)
			{
				System.out.print(" ");
			}
			for(int i3=0; i3<s; i3++)
			{
				System.out.print("*");
			}
			s+=2;	
		}
		
		int s1=7;
		for(int i1=0; i1<4; i1++)
		{
			System.out.print("\n");
			
			for(int i2=0; i2<i1+1; i2++)
			{
				System.out.print(" ");
			}
			
			for(int i3=0; i3<s1; i3++)
			{
				System.out.print("*");
			}
			s1-=2;
		}
	}
}