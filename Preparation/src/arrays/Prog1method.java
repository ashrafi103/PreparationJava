package arrays;

import java.util.Arrays;
import java.util.List;

public class Prog1method {

	public static void main(String[] args) {
int a[]= {10,40,60,70,15,19,47,15,25};
//Via asList() method
	List<int[]> a1=Arrays.asList(a);
	System.out.println("output of asList:" + a1);
//2. sorting of array
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
//3.	binarySearch
	//in case of binary search, array elements must be in ascending order
	int key=70;
	int key2=15;
	int res1=Arrays.binarySearch(a,key);
	int res2=Arrays.binarySearch(a,key2);
	System.out.println("key1 value index:" +res1);
	System.out.println("key2 value index:" +res2);
//4.Comparing 2 arrays
	int ary2[]= {10,48,45,15};
	Arrays.sort(ary2  );

	//int a3=Arrays.compare(a, ary2); 
	System.out.println("result of comparing array:" + Arrays.compare(a, ary2));
//5.copying  array with truncating default length
	int arry3[]=Arrays.copyOf(a, 15);
	System.out.println("result of copying array:" + Arrays.toString(arry3));
//6.copies array element of specific range into new array.
	System.out.println("result of copying array:" 
+ Arrays.toString(Arrays.copyOfRange(arry3, 1, 5)));
//equals method
	System.out.println("result of equals array:" + a.equals(arry3));
// Arrays.fill() method 
	 int filvalu =999; 
	 int arry4[]=Arrays.copyOfRange(arry3, 0, 8);
	 
			 Arrays.fill(arry4, filvalu);
	 System.out.println("filling method result" +Arrays.toString(arry4)); 
// Arrays.mismatch() method 
	 System.out.println("The element mismatched at index: "
             + Arrays.mismatch(a, ary2));
	

	}
	

}
