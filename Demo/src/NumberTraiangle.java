import java.util.Scanner;

public class NumberTraiangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter the number of rows");
int noOfRows=scan.nextInt();
int rowcount=1;

for(int i=noOfRows;i>0;i--){
	//space for each i
	for(int j=1;j<=i;j++){
		System.out.print("");
	}
for(int j=1;j<=rowcount;j++){
	System.out.print(rowcount+"");
	
}
System.out.println();
rowcount++;
}

	}

}
