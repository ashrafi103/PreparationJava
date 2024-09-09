//program for string functions
package stringRelated;

public class progi1 {

	public static void main(String[] args) {
//1. Different way of creating string
		String s1 = "Ashrafifirdos";
        // Creating a string literal and placed in memory "string constant pool"
        System.out.println(s1);
        
  //2) new instance is created (SCP and Heap) along with one reference.
        String s2 = new String("Creating a string object and placed that in memory \"Heap\"");
        System.out.println(s2);



// 2. Concatenating two strings using + operator
		String s3="Shaikh";
        String S3=s1+" "+s3;
		System.out.println(S3);
		
	//another way
        String S4=s1.concat(" ").concat(s3);
        String S5=s1.concat(s3);
        System.out.println("another way:" +S4);
        System.out.println("another way:" +S5);
        
//3. Finding the length of the string
        System.out.println(s1.length());
        //The length() method returns the value of string length including white spaces
        int  S2=s3.length();
        ;
//4. Extract a string using System.out.println(S2)Substring
      //extracting a substring using substring() method
        String sub=s1.substring(3);
        System.out.println(sub);
//pass the start and end indexes
        String sub1=s1.substring(0,6);
        System.out.println(sub1);
//5.Searching in strings using indexOf()
      //The indexOf() method returns the position of first occurrence of character
        int id=s1.indexOf("rafi");
        System.out.println(id);
        
        //first occurrence of the letter "h", start from index 3
        int i2 = s1.indexOf("f", 6);
        System.out.println("At Index : " + i2);
 //6. Matching a String Against a Regular Expression With matches()
       boolean mat=s1.matches(s2);
       System.out.println(mat);
       boolean mat1=s1.matches("Ashrafifirdos");
       System.out.println(mat1);
 //7. checking  string contains value or not 
       boolean mat2=s1.contains("rdos");
       System.out.println(mat2);
       
  // 8. Comparing strings using the methods equals()
       System.out.println("Compariing and executing  method");
 boolean cs1=s1==s1;
 boolean cs=s1==s2;
       boolean c1=s1.equals(s2);
       boolean c2=s2.equals("Shaikh");
       boolean c3=s1.equals("ashrafifirdos");
       boolean c4=s1.equalsIgnoreCase("ashrafifirdos");
       System.out.println(cs);
       System.out.println(cs1);
       System.out.println(c1);
       System.out.println(c2);
       System.out.println(c3);
       System.out.println(c4);
       //another patter
       
       System.out.println("Compariing and executing  method  for another way of srring");
       String stg1 = new String("Creating a string object 1");
       String stg2 = new String("Creating a string object 2");
       String stg3 = new String("Creating a string Object 1");
       System.out.println(stg1==stg2);
       System.out.println(stg1==stg3);
       System.out.println(stg1.equals(stg3));
       System.out.println(stg1.equalsIgnoreCase(stg3));
       System.out.println(stg1.equals(stg2));


	}}