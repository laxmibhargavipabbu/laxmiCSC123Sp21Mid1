package laxmiCSC123Sp21Mid1;
import java.io.*;
import java.util.*;

public class DigitsAndWrappers 
{
	public static void addDigitsToArrayList(String str,  ArrayList<Integer> arrListInt )
	{
			char tempChar;
		
		for (int i = 0; i < str.length(); i++)
		{
			tempChar = str.charAt(i);
			if (Character.isDigit(tempChar))
			{
				int num = Character.getNumericValue(tempChar);
				arrListInt.add(num);
			}
		}
	}
	
	public static void outputResults(String lines,  ArrayList<Integer> arrListInt, PrintWriter outputWriter)
	{
		outputWriter.printf("%s %s\n", lines,arrListInt.toString());
	}
	public static void main(String [] args) throws IOException
	{
		ArrayList<Integer> arrListInt = new ArrayList<Integer>();
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Please enter the input file name ");
		String input = keyboard.next();
		
		File inputFile = new File(input);
		
		if(!inputFile.exists())
		{
			System.out.printf("Input File %s was not found.\n", inputFile);
			System.exit(0);
		}
		Scanner inputReader = new Scanner(inputFile);
		System.out.printf("Please enter the output file name ");
		String output = keyboard.next();
		
		File outputFile = new File (output);
		PrintWriter outputWriter = new PrintWriter(outputFile);
		
		while (inputReader.hasNextLine())
        {
        	String lines = inputReader.nextLine();
        	addDigitsToArrayList(lines, arrListInt);
        	outputResults(lines, arrListInt, outputWriter);
        	arrListInt.removeAll(arrListInt);
		}
		keyboard.close();
		outputWriter.close();
		inputReader.close();
	}
}