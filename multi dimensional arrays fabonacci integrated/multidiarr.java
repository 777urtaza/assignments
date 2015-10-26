class multidiarr{
	public static void main(String []args)
	{
		int multi[][]=new int[3][3];
	
		int a=1;
		int b=0;
		int c=0;

		for (int i1=0;i1<3;i1++)
		{
			for (int i2=0; i2<3;i2++)
			{

						multi[i1][i2]=c;
						
						System.out.print(multi[i1][i2]+",   ");
			
						b=a;
						a=c;
						c=(a+b);				
				
			}
			
			System.out.print("\n");
		} 
			
	}
		
}

