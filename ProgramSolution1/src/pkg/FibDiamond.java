package pkg;

import java.util.ArrayList;

public class FibDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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


		    for (int a =5 ; a > 0; a -= 2) {

		      for (int b = 0; b < 8 - a / 2; b++)

		        System.out.print(" ");

		      if(fullString.startsWith("+")){

		      fullString=fullString.substring(1);

		      }

		      for (int b = 0; b < a; b++){

		        System.out.print(fullString.substring(0, 1));

		        fullString=fullString.substring(1);

		      }

		      System.out.print("\n");

		    }

		
		
		
		
		System.out.print("\n");

		String fullString1="";

		for (int a = 1; a < 9; a += 2) {

		 

		      for (int b = 0; b < 8 - a / 2; b++)

		        System.out.print(" ");

		     

		      int number=0;

		      for (int b = 0; b < a; b++){

		      fullString1="UNOCOIN";


		      number++;

		      //System.out.println(fullString);

		      }

		        System.out.print(fullString1.substring(0,number));


		      System.out.print("\n");

		    }


		    for (int a =5 ; a > 0; a -= 2) {

		      for (int b = 0; b < 8 - a / 2; b++)

		        System.out.print(" ");

		      int number=0;

		      for (int b = 0; b < a; b++){

		      fullString1="UNOCOIN";

		      number++;

		      }

		        System.out.print(fullString1.substring(0,number));


		      System.out.print("\n");

		    }

	}
	}


