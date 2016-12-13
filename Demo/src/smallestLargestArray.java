
public class smallestLargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numbers[]=new int[]{34,39,1};
int smallest= numbers[0];
int biggest= numbers[0];

for(int i=1;i<numbers.length;i++){
	if(numbers[i]>biggest){
		biggest=numbers[i];
		}
	else if(numbers[i]<smallest){
		smallest=numbers[i];
		
	}
	
	
}
System.out.println("bigest number"+biggest);
System.out.println("smallest number is"+smallest);
	}

}
