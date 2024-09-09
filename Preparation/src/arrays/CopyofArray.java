package arrays;

import java.util.Arrays;

public class CopyofArray {

	public static void main(String[] args) {
		int a[]= {10,40,60,70,15,19,47,15,25};
		System.out.println(Arrays.toString(a));
//using array method		
		int a1[]=Arrays.copyOfRange(a, 0, 4);
	System.out.println(Arrays.toString(a1));
//using iterator method(loop)	
	int a3[]=new int[a1.length];
	for (int i=0;i<a1.length;i++) {
	a3[i]=a1[i];
}
System.out.println(Arrays.toString(a3));

}
}
