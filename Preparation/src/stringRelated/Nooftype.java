package stringRelated;

import java.util.Arrays;

public class Nooftype {

	public static void main(String[] args) {
String s="Ashrafifirdos5466";
char a1[]=s.toCharArray();
//System.out.println(a1);
//System.out.println(Arrays.toString(a1));
for(int i=0;i<a1.length;i++)
{
	boolean answer=Character.isAlphabetic(a1[i]);
	int noofchar=0;
	if(answer==true) {
		
		noofchar++;

	}
	System.out.println(noofchar);
	
}
	}
}


