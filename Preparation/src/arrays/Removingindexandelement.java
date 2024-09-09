package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Removingindexandelement {

	public static void main(String[] args) {
		int a2[]= {12,14,21,13,48,19};
		//int a3[]= new int[a2.length-1];
		System.out.println(Arrays.toString(a2));
		removelement(a2);}
		/*Scanner sa= new Scanner(System.in);
		System.out.println("enter the index to remove element from array ");
		int inval=sa.nextInt();
		int k=0;
		for(int i=0;i<a2.length;i++) {
			if((i==inval)){
			continue;}
			a3[k]=a2[i];
		k++;}
				
	System.out.println(Arrays.toString(a3));
	}
}*/
		//using method creation
	static void removelement(int a3[]) {
			
			int a4[]= new int[a3.length-1];

			Scanner sa= new Scanner(System.in);
			System.out.println("enter the index to remove element from array ");
			int inval=sa.nextInt();
			int k=0;
			for(int i=0;i<a3.length;i++) {
				if((i==inval)){
				continue;}
				a4[k]=a3[i];
			k++;}
					
		System.out.println(Arrays.toString(a4));
		}
		}

	
		
	


