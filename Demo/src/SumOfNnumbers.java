import java.util.Scanner;

public class SumOfNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n;
    int temp=0;
    Scanner scan = new Scanner(System.in);
    System.out.println("enter n numbers to be added");
    n=scan.nextInt();
    for(int i=0;i<=n;i++){
    temp=temp+i;
    
    System.out.println("sum of n mumbers is "+temp);
    }
	}

}
