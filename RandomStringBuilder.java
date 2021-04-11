package Exams;
import java.util.*;

public class RandomStringBuilder
{
	public static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String [] args)
	{
		
		System.out.printf("Please enter the number of StringBuilder Objects to create: ");
		int lengthStrBuldr = keyboard.nextInt();
		StringBuilder[] arrSb = new StringBuilder[lengthStrBuldr];
		Random randy = new Random(5);
		//int numToFill = randy.nextInt(11) + 5;
		for(int i=0; i<arrSb.length;i++)
		{
			StringBuilder sb = new StringBuilder();
			char c = (char)(randy.nextInt(26) + 'a');
			sb.append(c);
			for (int j = 0; i < sb.length(); j++)
			{  
				int num = randy.nextInt(88) + 35;
				char ch=(char)num;  
				sb.append(ch) ;
				
			}
		}
		/*for(String s : sb)
		{
			System.out.printf("%s", sb);
		}*/

				
	}
}
