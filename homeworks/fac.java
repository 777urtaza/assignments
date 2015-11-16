import java.util.*;
import java.io.*;
class fac{
		static int a=1;
	public static void main(String [] args)
	{
		int a=9;
		fac(a);
	}
	
	static void fac(int f)
	{
		if(f<=0)
			return;

		fac(f-1);
		a*=f;
		System.out.print(a+" ");
		
	}
}