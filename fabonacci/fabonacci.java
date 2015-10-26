class fabonacci
{

	public static void main(String [] args)
	{
		int a=1;
		int b=0;
		int c=0;
	
		for(int i=0;i<=11; i++)
		{
			if(c%2==0)
			{
			System.out.print(c+"e, ");
			}
			else
			{
			System.out.print(c+"o, ");
			}
			b=a;
			a=c;
			c=(a+b);

		}

	}

}

