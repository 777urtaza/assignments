package murtaza;
import java.io.*;
import java.util.*;

class qa{
	String question;
	String answer1, answer2,answer3,answer4;
	String correctanswer;
	String option;		//String added in class to store option
}

class mykbc{
	final static int noques=25;
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String a=null;
		try{
			RandomAccessFile raf=new RandomAccessFile("kbcdata.txt","r");
			ArrayList<Integer> al=new ArrayList<Integer>();
			TreeMap<Integer,qa> tm=new TreeMap<Integer,qa>();
			long filelenght=raf.length();
			for(int loop=0; loop<15; ++loop)
			{
				int currentques;
				do{
					currentques=(int)(Math.random()*noques);
					if(!al.contains(currentques))
					{
						al.add(currentques);
						break;
					}
				}while(true);
				raf.seek(0);
				int track=0;
				qa cqa=new qa();
				while(raf.getFilePointer()<filelenght)
				{
					
					cqa.question=raf.readLine();

					cqa.answer1=raf.readLine();
					if(cqa.answer1.charAt(0)=='$')
					{
						cqa.answer1=cqa.answer1.substring(1,cqa.answer1.length());
						cqa.correctanswer=cqa.answer1;
						cqa.option="A"; 		//if this option is correct A is added with this option in option string 
					}
					
					cqa.answer2=raf.readLine();
					if(cqa.answer2.charAt(0)=='$')
					{
						cqa.answer2=cqa.answer2.substring(1,cqa.answer2.length());
						cqa.correctanswer=cqa.answer2;
						cqa.option="B";		//if this option is correct B is added with the option in option string 
					}
					
					cqa.answer3=raf.readLine();
					if(cqa.answer3.charAt(0)=='$')
					{
						cqa.answer3=cqa.answer3.substring(1,cqa.answer3.length());
						cqa.correctanswer=cqa.answer3;
						cqa.option="C";			//if this option is correct C is added with this option in option string 
					}
					
					cqa.answer4=raf.readLine();
					if(cqa.answer4.charAt(0)=='$')
					{
						cqa.answer4=cqa.answer4.substring(1,cqa.answer4.length());
						cqa.correctanswer=cqa.answer4;
						cqa.option="D";			//if this option is correct D is added with this option in option string 
					}
					if(++track==currentques)
					{
						tm.put(loop+1,cqa);
						break;
					}
				}
			}
			
			String m;
			System.out.println("Welcome to KBC");
			Set myset=tm.entrySet();
			Iterator itr=myset.iterator();
			int x[]=new int[15];		//for winning prize
			for(int i=0; i<15; i++) 
			{
				x[i]=100*i;
			}
			int count=1;
			while(itr.hasNext())
			{
				Map.Entry me=(Map.Entry)itr.next();
				System.out.println("Question No:"+me.getKey());
				qa temp=(qa)me.getValue();
				System.out.println(temp.question);
				System.out.println("A:"+temp.answer1);
				System.out.println("B:"+temp.answer2);
				System.out.println("C:"+temp.answer3);
				System.out.println("D:"+temp.answer4);
				//System.out.println("Correct answer is"+temp.correctanswer);
				//System.out.println("aaaaaaaaaaaaaaaaaa");
				m=input.next();			//take input from user for option
				if(m.equals(temp.option))	//compare the input with option in the class
				{
					 System.out.println("correct answer, you won "+x[count]);
					 ++count;				//just for prize
				 }
				 else{
					 System.out.println("wrong!");
					 return;
				 }
			}
			
			raf.close();
		}
		catch(Exception ex){}
		input.close();
	}
}