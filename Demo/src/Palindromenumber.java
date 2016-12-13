import java.util.Scanner;

public class Palindromenumber {

	public static void main (String[] args)
	   {		
	    int n;   
		int i =0;
	       int num =0;
	       //Empty String
	       String  primeNumbers = "";
Scanner scan=new Scanner(System.in);
System.out.println("enter the number");
n=scan.nextInt();

	       for (i = 1; i <= n; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.println(primeNumbers);
	   }
	}