//1. Write a function to add integer values of an array
package arrays;

public class Valueintoarrya {
	
	static int addingvalueofarray(int arr[]) {
		int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];
        return sum;}
	public static void main(String[] args) {
        //declaration, instantiation and initialization
        int[] arr = {10, 20, 30, 40, 50,70,80};
       for (int i : arr)
           System.out.print(i + " + ");
        System.out.print(" =  " + 
           addingvalueofarray(arr));
    }
}