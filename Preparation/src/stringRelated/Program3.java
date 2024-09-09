//Print "I love my friends " in vertical & Horizontal  fashion 
package stringRelated;

public class Program3 {

	public static void main(String[] args) {
		String s1="I love my friends";
		String S=" ";
		for(int i=s1.length()-1;i>0;i--) {
			//in vertical
			char c1= s1.charAt(i);
			//Horizontal
			S=S+s1.charAt(i);
		System.out.println(c1);
		
		}
		System.out.println(S);
	}

}
