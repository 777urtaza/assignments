class passvar{
	public static void main(String [] args)
	{
		System.out.println("total arguments passed:" +args.length);
		for(int i=0; i<args.length; i++)
		{
			System.out.print("Argument"+i+":"+args[i]);
		}
	}
}