//Write a  Java program  to display the cube of the number upto given  integer.

import java.util.Scanner;
 class cube {                                 //main class

   public static void main(String[] args)

{
    int i,no,cube;
    System.out.println("Enter a No :- ");
    Scanner sc = new Scanner(System.in);     //Taking the value from the user
		    no = sc.nextInt();

     for(i=1;i<=no;i++)                       //Moving a loop
     {
         
         cube = i*i*i;                		//syntax of cube
         System.out.println("no is " +i+ " cube of no :-" +i+" is "  +cube );
         // System.out.println("\n");

    }

 }
}