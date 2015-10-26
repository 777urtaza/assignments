class mda{
	public static void main(String [] args)
	{
		int arr[][]= new int[3][3];
		
		int a=1;
		int b=0;
		int c=0;
		for(int i=0; i<3; i++)
		{
			for(int i1=0; i1<3; i1++)
			{
				
				arr[i][i1]=c;
				if(c%2==0)
				{
					System.out.print(c+"e ,");
				}
				else
				System.out.print(c+"o, ");
				
				b=a;
				a=c;
				c=a+b;
			}
		}
	}
}
