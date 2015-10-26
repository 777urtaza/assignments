class all{
	public static void main(String []args)
	{
		int s=0;
		for (int i=0; i<10; i++)
		{
			for (int i2=0; i2<10-i; i2++)
			{
				System.out.print(" ");
			}
			
			for(int i3=0; i3<=s; i3++)
			{
				System.out.print("*");
			}
			s+=2;
			
			System.out.print("\n");
		}
		
		for(int i=0;i<10; i++)
		{
			for(int i2=0; i2<6; i2++)
			{
				System.out.print(" ");
			}
			
			for(int i3=0; i3<9 ; i3++)
			{
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
		
		
		System.out.print("\n\n");
	// ***********************************************************************************	
		
		for(int i=0; i<10; ++i)
		{
		System.out.print("* ");
		}

		
		System.out.print("\n\n");
		
		
		for(int i=0; i<10; ++i)
		{
			System.out.print("* \n");

		}
		
		
		System.out.print("\n\n");
	// ***********************************************************************************	
		
		for(int i=0; i<10; ++i)
		{
			System.out.print("\n* ");

			for(int i2=0; i2<2; ++i2)
			{
				System.out.print("* ");
			}

		}

		
		System.out.print("\n\n");
		// ***********************************************************************************	
		
		one(); //first 10 asteriks
		two();  //middle 2 asteriks
		one(); //last 10 asteriks
		
		
		System.out.print("\n\n");
	// ***********************************************************************************		
		
		onem();	//first 3 asteriks
		three();
		twom();	//middle 2 asteriks
		three();
		onem(); 	//last 3 asteriks
		
		
		System.out.print("\n\n");
	// ***********************************************************************************		
		
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
		
		
		System.out.print("\n\n");
	// ***********************************************************************************		
		
		int sf=0;
		for(int i=0; i<6; i++)
		{
			for(int i2=0; i2<6-i; i2++)
			{
				System.out.print(" ");
			}
			
			System.out.print("*");
			
			for(int i3=0; i3<sf; i3++)
			{
				System.out.print(" ");
			}
			if(i<1)
			{
			sf+=1;
			}
			else
			{
				sf+=2;
			}
			if(i!=0)
			System.out.print("*");
			System.out.print("\n");
		}
		
		int s1=0;
		int s2=0;
		for(int i=0; i<7; i++)
		{
			for(int i2=0; i2<s1; i2++)
			{
				System.out.print(" ");
			}
			
			System.out.print("*");
			
			for(int i3=0; i3<11-s2; i3++)
			{
				System.out.print(" ");
			}
			
			s2+=2;
			s1+=1;
			
			if(i!=6)
			System.out.print("*");
			System.out.print("\n");
			
		}
		
		
		System.out.print("\n\n");
	// ***********************************************************************************		
		
		int ss=1;
		for(int i1=0; i1<5; i1++)
		{
			System.out.print("\n");	
			
			for(int i2=0; i2<4-i1; i2++)
			{
				System.out.print(" ");
			}
			for(int i3=0; i3<ss; i3++)
			{
				System.out.print("*");
			}
			ss+=2;	
		}
		
		int s1f=7;
		for(int i1=0; i1<4; i1++)
		{
			System.out.print("\n");
			
			for(int i2=0; i2<i1+1; i2++)
			{
				System.out.print(" ");
			}
			
			for(int i3=0; i3<s1f; i3++)
			{
				System.out.print("*");
			}
			s1f-=2;
		}
		
		
		
		System.out.print("\n\n");
	// ***********************************************************************************		
		
		
		for(int i1=0; i1<10; i1++)
		{
			System.out.print("\n");
			
			for(int i3=0; i3<i1; i3++)
			{
				System.out.print(" ");
			}
			for(int i2=0; i2<10-i1;i2++)
			{
				System.out.print("*");
			}


		}
		
		
		
		System.out.print("\n\n");
	// ***********************************************************************************		
		
		
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
		
		
		System.out.print("\n\n");
	// ***********************************************************************************		
		
		
		for(int i1=0;i1<10;i1++)
		{
			System.out.print("\n");
			for(int i2=0;i2<10-i1;i2++)
			{
				System.out.print("*");
			}

		}
		
		
		System.out.print("\n\n");
	// ***********************************************************************************		
		
		for(int i1=0;i1<10;i1++)
		{
			System.out.print("\n");
			for(int i2=0;i2<=i1;i2++)
			{
				System.out.print("*");
			}

		}
		
		
		System.out.print("\n\n");
	// ***********************************************************************************		
		
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
		
		
		System.out.print("\n\n");
	// ***********************************************************************************		
		
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
		
		
		System.out.print("\n\n");
	// ***********************************************************************************		
	// ***********************************************************************************		
	// ***********************************************************************************		
		
		
	}
	
		//function for 1st and last 10 asteriks lines
	static void one()
	{
		System.out.print("\n");
		for(int i=0;i<9;i++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
	}
	
	//function for the middle asteriks and spaces
	static void two()
	{
		for (int i=0; i<7; i++)
		{
			System.out.print("\n*");
			for(int counter=0; counter<7; counter++)
			{
				System.out.print(" ");
			}
			System.out.print("*\n");
		}
	}
	
	
	
	
	//function for 1st and last 3 asteriks lines
	static void onem()
	{
		System.out.print("\n     ");
		for(int i=0;i<3;i++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
	}
	
	//function for the middle asteriks and spaces
	static void twom()
	{
		for (int i=0; i<5; i++)
		{
			System.out.print("\n*");
			for(int counter=0; counter<11; counter++)
			{
				System.out.print(" ");
			}
			System.out.print("*\n");
		}
	}
	
	//function for the second first and second last asteriks
	static void three()
	{
		for (int i=0; i<1; i++)
		{
			System.out.print("\n  *");
			for(int counter=0; counter<7; counter++)
			{
				System.out.print(" ");
			}
			System.out.print("*\n");
		}
	}
}