// Write a function to calculate the average value of an array of integers
package arrays;

public class Averageofarray {

	static int averageofarray(int arr[]) {
		 int sum = 0;
			int avg;
		for(int i=0;i<arr.length;i++)
		sum=sum+arr[i];
		System.out.println(sum);
		avg=sum/arr.length;
				return avg;}

	public static void main(String[] args) {
		//we calculate the average by the formula (avg = sum of numbers/total count)
		int arr[]= {1,2,6,4,5,2,};
	System.out.println(averageofarray(arr));}}
		
		