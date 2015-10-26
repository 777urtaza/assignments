import java.util.Scanner;

class myfop1
{
	public static void main(String []args)
		{
		    Scanner input;
		    input = new Scanner (System.in);

		    System.out.print("Please enter you name 1st and last:");
		    String firstname=input.nextLine();
		    String lastname=input.nextLine();


			System.out.print("Your First name is"+" "+ firstname +" "+ "and last name is"+" "+lastname);

		}
}
