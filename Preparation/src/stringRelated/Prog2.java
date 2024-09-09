package stringRelated;

public class Prog2 {

	public static void main(String[] args) {
String v1="Khubra thasin";
String v2="Ashrafi khubra thasin";
//9.Contains or not value checking
	boolean b1=v1.contains("thasin");
	boolean b2=v2.contains("shrafi");
	boolean b3=v2.equalsIgnoreCase("ashrafi khubra thasin");
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
//10.startsWith(), endsWith() and compareTo()
	boolean b4=v1.startsWith("Khubra");
	System.out.println(b4);
	boolean b5=v2.endsWith("thasin");
	System.out.println(b5);
    //compareTo() method returns 0 if both are equal
    int ct = v1.compareTo(v1);
	System.out.println(ct);
//11 . Trimming strings with trim()
    //trim method() Removes leading and trailing spaces
    String trm = ("Ashrafi").trim().concat("khubra").trim().concat("thasin");;
    System.out.println("Trimmed : " + trm);
//12 . Converting to uppercase and lowercase
    System.out.println(v1.toLowerCase());
    System.out.println(v2.toUpperCase());
// 13. Splitting strings with split()
    String a="ashrafifirdos54@gmail.com";
    //split() method breaks a given string around matches
    String sv[]=a.split("@");
    System.out.println(sv[0]);
    System.out.println(sv[1]);
    //Anothey way
    String sv1="[.]";
    String sa1[]=a.split(sv1);
    for(String res:sa1) {
    	System.out.println(res);
    	
//14. fetching  letter from string using index
    	System.out.println(a.charAt(11));
    	
//15.replacing 
    	String rpl = a.replace("firdos", "sou");
    	System.out.println(rpl);
//16.Converting Numbers to Strings with valueOf()
    	//valueOf() method converts different types of values into string.
    	int a1=14;
    	//Before converting
    	System.out.println(a1+20);
    	System.out.println(String.valueOf(14)+20);
    }
    		}
}