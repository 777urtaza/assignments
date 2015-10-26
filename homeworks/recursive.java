class recursive{
	public static void main(String [] args)
	{
		int a,b,c;
		a=4;
	
		recur(a);
	}
	
	static void recur(int x)
	{
		if( x<=0)
		return ;
		
		System.out.print("");
		x-=1;
		recur(x);
		System.out.println(x);
		// return;
		
		
	}
	
}