package pkg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FibDiamond {

	public static void main(String[] args) {
		//List is the interface for all the list types
		//ArrayList is the implementation of the List type.
		//Only ArrayList objects can be instantiated
		List<Integer> fib = new ArrayList<Integer>();
		List<String> outputLines = new ArrayList<String>();
		int n1 = 0, n2 = 1, n3 = 0, k, count = 11;
		String fullString = "1";
		
		//Preparation of the fibonacci series.  
		// Count is 11 because the triangle has 11 fibonacci numbers.
		// Full string will have the 11 fibonacci numbers with + in between them
		for (k = 0; k < count; ++k) {
			n3 = n1 + n2;
			fib.add(n3);
			fullString = fullString + n3 + "+";
			n1 = n2;
			n2 = n3;
		}
		System.out.print("\n");
		//Genrating the first 4 lines. Sine first four lies have commmon behavior.
		//i will be 1,3,5,7 - this is the number of characters.
		for (int i = 1; i < 9; i += 2) {
			String tempLine = "";
			
			//This for loop is for generating only spaces.
			//Spaces will be generated till 8-i/2 so that gradually they reduce.
			for (int j = 0; j < 8 - i / 2; j++)
				tempLine = tempLine + " ";
			
			//The beginning of the string part of a line should not have +
			if (fullString.startsWith("+")) {
				fullString = fullString.substring(1);
			}
			
			//Generating the text part of the line. 
			//i number of characters are displayed. 1,3,5,7 numbers in each row.
			for (int j = 0; j < i; j++) {
				tempLine = tempLine + (fullString.substring(0, 1));
				fullString = fullString.substring(1);
			}
			for (int l = tempLine.length(); l < 12; l++) {
				tempLine = tempLine + " ";
			}
			outputLines.add(tempLine);
		}

		for (int a = 5; a > 0; a -= 2) {
			String tempLine = "";
			for (int b = 0; b < 8 - a / 2; b++)
				tempLine = tempLine + " ";
			if (fullString.startsWith("+")) {
				fullString = fullString.substring(1);
			}
			for (int b = 0; b < a; b++) {
				tempLine = tempLine + fullString.substring(0, 1);
				fullString = fullString.substring(1);
			}
			for (int l = tempLine.length(); l < 12; l++) {
				tempLine = tempLine + " ";
			}
			outputLines.add(tempLine);
		}
		System.out.print("\n");
		String fullString1 = "";
		Iterator<String> iterator = outputLines.iterator();
		for (int a = 1; a < 9; a += 2) {
			if (iterator.hasNext()) {
				System.out.print(iterator.next());
			}
			for (int b = 0; b < 8 - a / 2; b++)
				System.out.print(" ");
			int number = 0;
			for (int b = 0; b < a; b++) {
				fullString1 = "UNOCOIN";
				number++;
				// System.out.println(fullString);
			}
			System.out.print(fullString1.substring(0, number));
			System.out.print("\n");
		}
		for (int a = 5; a > 0; a -= 2) {
			if (iterator.hasNext()) {
				System.out.print(iterator.next());
			}
			for (int b = 0; b < 8 - a / 2; b++)
				System.out.print(" ");
			int number = 0;
			for (int b = 0; b < a; b++) {
				fullString1 = "UNOCOIN";
				number++;
			}
			System.out.print(fullString1.substring(0, number));
			System.out.print("\n");
		}
	}
	}


