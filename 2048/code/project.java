
import java.util.*;

public class project {

	static int[][] matrix=new int [4][4];
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		for(int i=0; i<4; i++)
		{
			for(int ii=0; ii<4; ii++)
			{
				matrix[i][ii]=0;
				if(i==0)
					matrix[i][ii]=2;
				System.out.print(matrix[i][ii]+"        ");
			}
			System.out.println("\n\n");
		}
		
		String op;
		
		for(;;){
		op=input.next();
		switch(op){
			case "w": w();
			break;
			case "a": a();
			break;
			case "s": s();
			break;
			case "d": d();
			break;
			default: System.out.println("invalid");
		}
	}
		
		//input.close();
	}
	//---------------------------------------------------
	static void w()
	{
		//for adjusting arrays
		for(int loop=0; loop<4; loop++)//just to confirm no 0 between two values
		{
		
			for(int i=0; i<4; i++)
			{
				for(int ii=0; ii<4; ii++)
				{
					if(i<3&&matrix[i][ii]==0)
					{
						matrix[i][ii]=matrix[i+1][ii];
						matrix[i+1][ii]=0;
					}
					//if(loop==3)
					//System.out.print(matrix[i][ii]+" ");
				}
				//System.out.println("");
			}
		}
		
		
		//for modifying arrays
		for(int i=0; i<4; i++)
		{
			for(int ii=0; ii<4; ii++)
			{
				if(i>0&&matrix[i][ii]==matrix[i-1][ii])
				{
					matrix[i][ii]=matrix[i][ii]+matrix[i-1][ii];
					matrix[i-1][ii]= 0;
					
				}
				//System.out.print(matrix[i][ii]+" "); //test
			}
			System.out.println("");
		}
		
		//testing
		/*for(int i=0; i<4; i++)
		{
			for(int ii=0; ii<4; ii++)
			{
				System.out.print(matrix[i][ii]+" ");
			}
			System.out.println("");
		}*/
		
		//for adjusting arrays
		for(int loop=0; loop<4; loop++)//just to confirm no 0 between two values
		{
		
			for(int i=0; i<4; i++)
			{
				for(int ii=0; ii<4; ii++)
				{
					if(i<3&&matrix[i][ii]==0)
					{
						matrix[i][ii]=matrix[i+1][ii];
						matrix[i+1][ii]=0;
					}
					//if(loop==3)
					//System.out.print(matrix[i][ii]+" ");
				}
				//System.out.println("");
			}
		}
		
		//for generating random(2,4) in random array at opposite site of move
		for(;;){
			if(matrix[3][randarr()]==0){
				matrix[3][randarr()]=random();
				break;
			}
			else
				continue;
			}
		
		//for printing arrays
		for(int i=0; i<4; i++)
		{
			for(int ii=0; ii<4; ii++)
			{
				System.out.print(matrix[i][ii]+"        ");
			}
			System.out.println("\n\n");
		}
		gameover();
	}

	//------------------------------------------------------
	static void a()
	{
		//for adjusting arrays
				for(int loop=0; loop<4; loop++)//just to confirm no 0 between two values
				{
					for(int i=0; i<4; i++)
					{
						for(int ii=0; ii<4; ii++)
						{
							if(ii<3&&matrix[i][ii]==0)
							{
								matrix[i][ii]=matrix[i][ii+1];
								matrix[i][ii+1]=0;
							}
							//if(loop==3)
							//System.out.print(matrix[i][ii]+" ");
						}
						//System.out.println("");
					}
				}
		
		
		//for modifying arrays
		for(int i=0; i<4; i++)
		{
			for(int ii=0; ii<4; ii++)
			{
				if(ii<3&&matrix[i][ii]==matrix[i][ii+1])
				{
					matrix[i][ii]=matrix[i][ii]+matrix[i][ii+1];
					matrix[i][ii+1]= 0;
					
				}
			}
			//System.out.println("");
		}
		//for adjusting arrays
		for(int loop=0; loop<4; loop++)//just to confirm no 0 between two values
		{
			for(int i=0; i<4; i++)
			{
				for(int ii=0; ii<4; ii++)
				{
					if(ii<3&&matrix[i][ii]==0)
					{
						matrix[i][ii]=matrix[i][ii+1];
						matrix[i][ii+1]=0;
					}
					//if(loop==3)
					//System.out.print(matrix[i][ii]+" ");
				}
				//System.out.println("");
			}
		}
		
		//for generating random(2,4) in random array at opposite site of move
		for(;;)
		{
			if(matrix[randarr()][3]==0){
				matrix[randarr()][3]=random();
				break;
			}
			else
				continue;
		}
		
		//for printing arrays
		for(int i=0; i<4; i++)
		{
			for(int ii=0; ii<4; ii++)
			{
				System.out.print(matrix[i][ii]+"        ");
			}
			System.out.println("\n\n");
		}
		
		gameover();
	}
	
	//--------------------------------------------------
	
	static void s()
	{
		//adjusting values
		for(int loop=0; loop<4; loop++)//just to confirm no 0 between two values
		{
			for(int i=3; i>=0; i--)
			{
				for(int ii=0; ii<4; ii++)
				{
					if(i>0&&matrix[i][ii]==0)
					{
						matrix[i][ii]=matrix[i-1][ii];
						matrix[i-1][ii]=0;
					}
					//System.out.print(matrix[i][ii]+" ");
				}
				//System.out.println("");
			}
		}
		
		
		//modifying values
		for(int i=3; i>=0; i--)
		{
			for(int ii=0; ii<4; ii++)
			{
				if(i>0&&matrix[i][ii]==matrix[i-1][ii])
				{
					matrix[i][ii]=matrix[i][ii]+matrix[i-1][ii];
					matrix[i-1][ii]= 0;
					
				}
				//System.out.print(matrix[i][ii]+" "); //test
			}
			//System.out.println("");
		}
		
		//testing
		/*for(int i=0; i<4; i++)
		{
			for(int ii=0; ii<4; ii++)
			{
				//System.out.print(matrix[i][ii]+" ");
			}
			System.out.println("");
		}*/
		
		
		//adjusting values
		for(int loop=0; loop<4; loop++)//just to confirm no 0 between two values
		{
			for(int i=3; i>=0; i--)
			{
				for(int ii=0; ii<4; ii++)
				{
					if(i>0&&matrix[i][ii]==0)
					{
						matrix[i][ii]=matrix[i-1][ii];
						matrix[i-1][ii]=0;
					}
					//System.out.print(matrix[i][ii]+" ");
				}
				//System.out.println("");
			}
		}
		
		//for generating random(2,4) in random array at opposite site of move
		for(;;)
		{
			if(matrix[0][randarr()]==0)
			{
				matrix[0][randarr()]=random();
				break;
			}
			else
				continue;
		}
		//for printing values
		for(int i=0; i<4; i++)
		{
			for(int ii=0; ii<4; ii++)
			{
				
				System.out.print(matrix[i][ii]+"        ");
			}
			System.out.println("\n\n");
		}
		gameover();
	}
	//--------------------------------------------------
	static void d()
	{
		//for adjusting values
		for(int loop=0; loop<4; loop++)//just to confirm no 0 between two values
		{
			for(int i=0; i<4; i++)
			{
				for(int ii=3; ii>=0; ii--)
				{
					if(ii>0&&matrix[i][ii]==0)
					{
						matrix[i][ii]=matrix[i][ii-1];
						matrix[i][ii-1]=0;
					}
					
					//System.out.print(matrix[i][ii]+" ");
				}
				//System.out.println("");
			}
		}
		
		
		
		//for modifying values
		for(int i=0; i<4; i++)
		{
			for(int ii=3; ii>=0; ii--)
			{
				if(ii>0&&matrix[i][ii]==matrix[i][ii-1])
				{
					matrix[i][ii]=matrix[i][ii]+matrix[i][ii-1];
					matrix[i][ii-1]= 0;
					
				}
			}
			//System.out.println("");
		}
		
		
		//for adjusting values
		for(int loop=0; loop<4; loop++)//just to confirm no 0 between two values
		{
			for(int i=0; i<4; i++)
			{
				for(int ii=3; ii>=0; ii--)
				{
					if(ii>0&&matrix[i][ii]==0)
					{
						matrix[i][ii]=matrix[i][ii-1];
						matrix[i][ii-1]=0;
					}
					
					//System.out.print(matrix[i][ii]+" ");
				}
				//System.out.println("");
			}
		}
		//for generating random(2,4) in random array at opposite site of move
		for(;;)
		{
			if(matrix[randarr()][0]==0){
				matrix[randarr()][0]=random();
				break;
			}
			else
				continue;
		}
		//for printing values
		for(int i=0; i<4; i++)
		{
			for(int ii=0; ii<4; ii++)
			{
				System.out.print(matrix[i][ii]+"        ");
			}
			System.out.println("\n\n");
		}
		
		gameover();
	}

	//-------------------------------------------------
	static int random()
	{
		Random rand=new Random();
		int a;
		for(;;)
		{
			a=rand.nextInt(3)*2;
			if(a==0)
				continue;
			else
				return a;
		}

	}

	//-------------------------------------------------
	static int randarr()
	{
		Random rand=new Random();
		int a;
		a=rand.nextInt(4);
		return a;

	}

	//--------------------------------------------------
	static void gameover()
	{
		int flag=0;
		for(int i=0; i<4; i++)
		{
			for(int ii=0; ii<4; ii++)
			{
				if(matrix[i][ii]==0)
				{
					flag=1;
				}
			}
		}
		if(flag==0)
		{
			System.out.println("GameOver!");
		}
			
	}
	
}
