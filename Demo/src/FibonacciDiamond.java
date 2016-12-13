import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciDiamond {

	public static void main(String argus[])

	{

	ArrayList<Integer> fib =new ArrayList<Integer>();

	int n1=0,n2=1,n3=0,k,count=11;    

	String fullString="1";

	//System.out.print(n1+" "+n2);

	for(k=0;k<count;++k) 
	{    
	  n3=n1+n2;  
	//  System.out.print(" "+n3);
	  fib.add(n3);
	  fullString=fullString+n3+"+";
	  n1=n2;
	  n2=n3;    
	}

	 // System.out.println(fullString);


	System.out.print("\n");

	      for (int i = 1; i < 9; i += 2) {
	      for (int j = 0; j < 8 - i / 2; j++)
          System.out.print(" ");

	      if(fullString.startsWith("+")){

	      fullString=fullString.substring(1);

	      }

	      for (int j = 0; j < i; j++){


	      //System.out.println(fullString);

	        System.out.print(fullString.substring(0, 1));

	        fullString=fullString.substring(1);

	      }

	      System.out.print("\n");

	    }


	    for (int i =5 ; i > 0; i -= 2) {

	      for (int j = 0; j < 8 - i / 2; j++)

	        System.out.print(" ");

	      if(fullString.startsWith("+")){

	      fullString=fullString.substring(1);

	      }

	      for (int j = 0; j < i; j++){

	        System.out.print(fullString.substring(0, 1));

	        fullString=fullString.substring(1);

	      }

	      System.out.print("\n");

	    }

	  }

	 


	}