public class test
{
	public static void main(String[] args) {
		fabo(0,1);
	}
	
	static void fabo(int x, int y)
	{
		if(x+y>100)
			return;
		System.out.print(x+y+", ");
		fabo(y,x+y);
	}
}