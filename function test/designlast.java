class designlast
{

	public static void main(String [] args)
	{
		for(int counter1=0; counter1<3; ++counter1)
		{
			for(int counter2=0; counter2<3; ++counter2)
			{
				if(counter2>=2-counter1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.println();
		}	
	}
}
		