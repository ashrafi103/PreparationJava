//total of array
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TotalofArray {

	public static void main(String[] args) {
		int totalofarray=0;
		System.out.println("Enter size of array");
		Scanner sn=new Scanner(System.in);
		int input=sn.nextInt();
		int a[]=new int[input];
		System.out.println("Enter value of array");
		for(int i=0;i<a.length;i++) {
			a[i]=sn.nextInt();
			totalofarray=totalofarray+a[i];}
		System.out.println("Complete array" 
			+Arrays.toString(a));
		
		System.out.println("total array:  " +totalofarray);
		}}
