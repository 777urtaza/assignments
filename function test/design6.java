class design6
{
	public static void main(String [] args)
	{
		int height=10;
		int width=10;
		int asterix_width=1;

		for(int h=0; h<height; h++)
		{
			for(int i=0; i<width ;i++)
			{
				System.out.print(" ");
			}	
			width--;
			
			for(int a=0; a<asterix_width ;a++)
			{
				System.out.print("*");
			}	
			asterix_width+=2;
			System.out.print("\n");
						
		}

	}


}