//Write a function to remove a specific element from an array

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Removingarray {
public static void main(String[] args) {
int a2[]= {12,14,21,13,48,19};
		int a3[]= new int[a2.length];
		System.out.println(Arrays.toString(a2));
		Scanner sa= new Scanner(System.in);
		System.out.println("enter the value to remove from array ");
		int inval2=sa.nextInt();
		for(int i=0;i<a2.length;i++) {
			if(a2[i]==inval2) {
				continue;}
				a3[i]=a2[i];}
				System.out.println(Arrays.toString(a3));
			}}
		
		 

