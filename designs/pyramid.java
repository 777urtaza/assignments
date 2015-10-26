class pyramid
{
	public static void main(String args[])
	{
	for(int a=0;a<10;++a)
		{
			for(int b=0;b<=10+a;++b)	
			{
				if(b<=9-a)
				{
				System.out.print(" ");
				}
				else
				{
				System.out.print("*");
				}
	
			}

			System.out.print("\n");
		}


	}

}