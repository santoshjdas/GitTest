import java.util.ArrayList;
import java.util.Scanner;

public class QuickSort {

    private ArrayList<Student> array;
    private int length;
 
    public void sort(ArrayList<Student> inputArr) {
         
        if (inputArr == null || inputArr.size() == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.size();
        quickSort(0, length - 1);
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        int index = lowerIndex+(higherIndex-lowerIndex)/2;
        Student pivot = array.get(index);
        while (i <= j) {
           
            while (array.get(i).total > pivot.total) {
                i++;
            }
            while (array.get(j).total < pivot.total) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
       
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void exchangeNumbers(int i, int j) {
        Student temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }
  
    public static void main(String a[]){
        QuickSort sorter = new QuickSort();
        ArrayList <Student> students =new ArrayList<Student>();
        for(int i=0;i<3;i++)
        {
        Scanner keyboard = new Scanner(System.in);
      
        System.out.println("Enter Name:"); 
        String name = keyboard.next();
        
        System.out.println("Enter English Marks:");
        int english = keyboard.nextInt();

        System.out.println("Enter Maths Marks:");
        int maths = keyboard.nextInt();

        System.out.println("Enter Science Marks:"); 
        int science = keyboard.nextInt();
        Student studentKeyboard= new Student(name, english, maths, science);
    	

        students.add(studentKeyboard);
        }
    //	Student student1= new Student("SantoshDas",89, 90, 80);
    //	Student student2 = new Student("Simran", 50, 70, 50);
   // 	Student student3 = new Student("Raj", 40, 40, 30);
    //	Student student4 = new Student("Das", 99, 67, 10)

    	/*students.add(student1);
    	students.add(student2);
    	students.add(student3);
    	students.add(student4);
    	*/

        sorter.sort(students);
        System.out.println("Rank || Name || English || Maths || Science || Total");
        for(Student i:students){
            System.out.print(1+students.indexOf(i) +"    "+i.name+"   "+i.english+"    "+i.maths+"   "+i.science+"  "+i.total);
            System.out.println();
        }
    }
}
