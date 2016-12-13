public class Diamondprac {

public static void main(String[] args) {

// TODO Auto-generated method stub


System.out.print("\n");

String fullString="";

for (int i = 1; i < 9; i += 2) {

 

      for (int j = 0; j < 8 - i / 2; j++)

        System.out.print(" ");

     

      int number=0;

      for (int j = 0; j < i; j++){

      fullString="UNICOIN";


      number++;

      //System.out.println(fullString);

      }

        System.out.print(fullString.substring(0,number));


      System.out.print("\n");

    }


    for (int i =5 ; i > 0; i -= 2) {

      for (int j = 0; j < 8 - i / 2; j++)

        System.out.print(" ");

      int number=0;

      for (int j = 0; j < i; j++){

      fullString="UNICOIN";

      number++;

      }

        System.out.print(fullString.substring(0,number));


      System.out.print("\n");

    }


  } 

 

}