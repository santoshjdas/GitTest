import java.util.Scanner;

public class Facto {

	public static void main(String[] args) {
		int num, result=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter");
		 num =scan.nextInt();
		 for(int i=1;i<=num;i++){
			 result=result*i;
			 
			 
		 }
		 System.out.println(result);
	}

}
