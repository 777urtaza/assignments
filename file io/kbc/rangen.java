import java.util.*;
import java.io.*;

class rangen{
	public static void main(String []args)
	{
		int []arr=new int [100];
		int s;
		int c=0;
		for(int i=0;i<100; i++)
		{
			s=rand();
			for(int i2=0; i2<i; i2++)
			{
				if(s==arr[i2])
				{
					s=rand();
					i2=0;
				}
			}
			arr[i]=s;
			
			c+=1;
				System.out.println(c+". "+arr[i]);
		}
		for(int i=0;i<100; i++)
		{
			for(int i1=0; i1<100; i1++)
			{
				if(c!=c)
				{
					if(arr[i]==arr[i1])
					System.out.print("same");
				}
			}
		}	
	}
	
	static int rand()
	{
		Random rand=new Random();
		int a;
		a=rand.nextInt(100)+1;
		
		return a;
	}
}