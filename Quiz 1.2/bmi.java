import java.util.Scanner;

class bmi{

	public static void main(String [] args)
	{
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter your height(in meters):");
		float h= input.nextFloat();

		System.out.print("Enter your weight(in kg):");
		float w= input.nextFloat();

		
		if(h>1.40 && h<1.50)
		{
			if(w<40)
			System.out.println("You are underweight");
			
			if(w>40 && w<50)
			System.out.println("You are normal");

			if(w>=50 && w<60)
			System.out.println("You are overweight");

			if(w>=60 && w<70)
			System.out.println("You are obese");

			if(w>=70)
			System.out.println("You are clinically obese");

		}

		else if(h>=1.50 && h<1.60)
		{
			if(w<45)
			System.out.println("You are underweight");

			if(w>45 && w<55)
			System.out.println("You are normal");

			if(w>=55 && w<65)
			System.out.println("You are overweight");

			if(w>=65 && w<75)
			System.out.println("You are obese");

			if(w>=75)
			System.out.println("You are clinically obese");

		}

		else if(h>=1.60 && h<1.70)
		{
			if(w<50)
			System.out.println("You are underweight");

			if(w>50 && w<60)
			System.out.println("You are normal");

			if(w>=60 && w<70)
			System.out.println("You are overweight");

			if(w>=70 && w<80)
			System.out.println("You are obese");

			if(w>=80)
			System.out.println("You are clinically obese");

		}

		else if(h>=1.70 && h<1.80)
		{
			if(w<55)
			System.out.println("You are underweight");

			if(w>55 && w<65)
			System.out.println("You are normal");

			if(w>=65 && w<75)
			System.out.println("You are overweight");

			if(w>=75 && w<85)
			System.out.println("You are obese");

			if(w>=85)
			System.out.println("You are clinically obese");

		}

		else if(h>=1.80 && h<1.90)
		{
			if(w<60)
			System.out.println("You are underweight");

			if(w>60 && w<70)
			System.out.println("You are normal");

			if(w>=70 && w<80)
			System.out.println("You are overweight");

			if(w>=80 && w<90)
			System.out.println("You are obese");

			if(w>=90)
			System.out.println("You are clinically obese");

		}

		else if(h>=1.90 && h<2.00)
		{
			if(w<65)
			System.out.println("You are underweight");

			if(w>65 && w<75)
			System.out.println("You are normal");

			if(w>=75 && w<85)
			System.out.println("You are overweight");

			if(w>=85 && w<95)
			System.out.println("You are obese");

			if(w>=95)
			System.out.println("You are clinically obese");

		}
	}

}