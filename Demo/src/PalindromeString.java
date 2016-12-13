import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String org,rev="";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string to be checked");
		org=scan.nextLine();
		int length=org.length();
		for(int i=length-1;i>=0;i--){
			rev=rev+org.charAt(i);
		}
System.out.println(rev);
if(rev.equals(org)){
	System.out.println("string is palindrome");
}
else{
	System.out.println("string is not a palindrome");	
}
	}

}
