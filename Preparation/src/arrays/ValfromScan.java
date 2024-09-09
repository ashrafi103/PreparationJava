//1)value of array from scanner class
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ValfromScan {
public static void main(String[] args) {
System.out.println("Enter size of array");
Scanner sn=new Scanner(System.in);
int input=sn.nextInt();
int a[]=new int[input];
System.out.println("Enter value of array");
for(int i=0;i<a.length;i++) {
	a[i]=sn.nextInt();
	System.out.println("array: "+a);
	System.out.println("array:" 
	+Arrays.toString(a));
}}}
