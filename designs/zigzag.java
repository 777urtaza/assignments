import java.util.Scanner;

class zigzag
{
	public static void main(String [] args)
	{
		for(int i=0; i<8; i++)
		{
			for(int i1=0; i1<8; i1++)
			{
				System.out.print("* ");
			}
			if(i%2==0)
			{
				System.out.print("\n ");
			}
			else
			{
				System.out.print("\n");
			}
		}
	}
}