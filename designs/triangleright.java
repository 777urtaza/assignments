class triangleright{
	public static void main(String []args)
	{
		for(int i1=1; i1<11; i1++)
		{
			System.out.print("\n");
			for(int i2=0; i2<10-i1;i2++)
			{
				System.out.print(" ");
			}
			for(int i3=0; i3<i1; i3++)
			{
				System.out.print("*");
			}

		}
	}
}