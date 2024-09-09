//Input String:RamMohan
//Output :MohanRam 

package stringRelated;
public class Prog4 {
public static void main(String[] args) {
String val="RamMohan";
String res=val.substring(3).concat(val.substring(0,3));
System.out.println(res);
	}

}
