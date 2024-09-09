//Write a function to test if array contains a specific value
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Specificvalue {

		public static void main(String[] args) {
			int a2[]= {12,14,21,13,48,19};

		
System.out.println(Arrays.toString(a2));
System.out.println("enter the value to find in array "
		+ "\n" + "present or not");
findingspecificvalueinarray(a2);
}
		static void findingspecificvalueinarray(int a1[]) {
			
			System.out.println(Arrays.toString(a1));
			int inval21;
			boolean n=false;
			Scanner sn= new Scanner(System.in);
			inval21=sn.nextInt();

			for(int i=0;i<a1.length;i++) {
				if(a1[i]==inval21) {
					n=true;
				}}
			if(n==true) {
				System.out.println(inval21 +"present in array");
			}
			else {
				System.out.println(inval21 +"not present in array");

			}}}