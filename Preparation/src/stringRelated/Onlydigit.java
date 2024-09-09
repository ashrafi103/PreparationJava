//Check if a string contains only digits
package stringRelated;

public class Onlydigit {

	public static void main(String[] args) {
String val="Ashrafi@5728041998";

for(int i=0;i<val.length();i++) {
	char res=val.charAt(i);
	String res2=res;
if(res2==Character.isDigit(res)) {
	System.out.println(res2);
		
	}
}

}
}
