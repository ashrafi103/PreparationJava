//3. Write a program to find the index of an array element

package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class IndexofArray {
	static void indexofvalue(int a1[],int inputval) {
		for(int i=0;i<a1.length;i++) {
		
			if(a1[i]==inputval) {
				System.out.println(inputval +" "+" "+ "from array is at index:" +i);
			} }
	}				
			public static void main(String[] args, int[] a1) {
		 //int a1[]= {10,20,30,40,48,75,47,49};
		//System.out.println(Arrays.toString(a1));
		System.out.println("Enter number from array to"+ "\n "
		+" find index");
		Scanner sn=new Scanner(System.in);
		int inputval=sn.nextInt();
		indexofvalue(a1,inputval);
		}}
	

