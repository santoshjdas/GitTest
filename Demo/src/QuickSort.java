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
        // calculate pivot number, I am taking pivot as middle index number
        int index = lowerIndex+(higherIndex-lowerIndex)/2;
        Student pivot = array.get(index);
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which 
             * is greater then the pivot value, and also we will identify a number 
             * from right side which is less then the pivot value. Once the search 
             * is done, then we exchange both numbers.
             */
            while (array.get(i).total > pivot.total) {
                i++;
            }
            while (array.get(j).total < pivot.total) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
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
    //	Student student1= new Student("Raj",30, 50, 40);
    //	Student student2 = new Student("Simran", 50, 70, 50);
   // 	Student student3 = new Student("Raj", 40, 40, 30);
    //	Student student4 = new Student("Das", 99, 98, 100);
    //	Student student5 = new Student("Sandy", 80, 20, 10);
   // 	Student student6 = new Student("Balu", 35, 35, 35);

    	/*students.add(student1);
    	students.add(student2);
    	students.add(student3);
    	students.add(student4);
    	students.add(student5);
    	students.add(student6);*/

        sorter.sort(students);
        System.out.println("Rank || Name || English || Maths || Science || Total");
        for(Student i:students){
            System.out.print(1+students.indexOf(i) +"    "+i.name+"   "+i.english+"    "+i.maths+"   "+i.science+"  "+i.total);
            System.out.println();
        }
    }
}
