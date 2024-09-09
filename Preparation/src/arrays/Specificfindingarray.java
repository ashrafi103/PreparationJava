package arrays;

import java.util.Scanner;

public class Specificfindingarray {
public static void main(String[] args) {
			int a2[]= {12,14,21,13,48,19};
			int inval2;
			boolean n1=false;
			Scanner sn= new Scanner(System.in);
			System.out.println("enter the value to find in array "
					+ "\n" + "present or not");
			 inval2=sn.nextInt();
	for(int i=0;i<a2.length;i++) {
		if(a2[i]==inval2) {
			n1=true;}
	}
	if(n1==true) {
			System.out.println(inval2 +"present in array");
		}
		else {
			System.out.println(inval2 +"not present in array");
		}}}


