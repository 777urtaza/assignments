class hanoi{
	public static void main(String [] args)
	{
		System.out.println("hello");
		int m=-2147483648;
		System.out.print(m);
		
	}
	
	static void h(int a)
	{
		a+=a;
		System.out.print(a+", ");
		h(a);
		
	}
}