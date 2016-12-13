import java.util.Scanner;

public class Primenumbereasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		n=scan.nextInt();
		
		for(int i=2;i<=n;i++){
			System.out.println("before for j");
		for(int j=2;j<=i;j++){
			System.out.println("before if");
		if(i==j){
			System.out.print(i);
			
		}	
		else if(i%j==0){
			
			System.out.println("test");
			break;
		}
		 
			
			
		}		
		}
	}

}
