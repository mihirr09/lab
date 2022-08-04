//Write a Java program to test the equality of two arrays.

import java.util.Arrays;
class Equalityoftwoarray
{
		public static void main( String args[] )
		{
			int [] arr1 = {10,20,30,40,80};
			int [] arr2 = {10,20,30,40,80};
			System.out.println("Equality of two array is :- "	//use equal method.
				+Arrays.equals(arr1, arr2));
 	    }
}