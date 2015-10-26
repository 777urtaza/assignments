class design6{
	public static void main(String []args)
	{
			int st=1;
			int sp=3;
		for(int i1=0; i1<3; i1++)
		{

			for(int i2=1; i2<sp;i2++)
			{
				System.out.print(" ");
			}
			sp--;
			for(int i3=0; i3<st;i3++)
			{
				System.out.print("*");
			}
			st+=2;
			System.out.print("\n");
		}
		for(int i=0; i<6; i++)
		{
			System.out.print("  *\n");
		}
	}
}