 package Office;

import java.util.Arrays;

public class String_Method {

	public static void main(String[] args) {
		
		
//		
		String s="sharma";
//		String s1="jeeva";
//		String s2="Arunji";
//		String s3="joker";
//		System.out.println(s.charAt(4));
//		System.out.println(s.length());
//		System.out.println(s.contains("sharma"));//print true or false
		System.out.println(s.codePointAt(5));
		System.out.println	(s.codePointBefore(1));
		System.out.println(s.codePointCount(1,4));
//		System.out.println(s1.equals(s2));//print true or false
//		System.out.println(s.equalsIgnoreCase(s2));//print true or false
//		System.out.println(s.compareTo(s3));
//		System.out.println(s.compareToIgnoreCase(s2));
//		System.out.println(s.replace('r', 'v'));
//		
//		System.out.println(s.substring(3));
//		System.out.println(s.substring(4,6));
//		System.out.println(s.trim( ));
//		System.out.println(s.indexOf("a"));	
//		System.out.println(s.lastIndexOf("a"));	
//		System.out.println(s1.endsWith("a"));	
//		System.out.println(s1.startsWith("i"));
		
//		String str = "banana";
//		String replaced = str.replace('a', 'o'); // "bonono"
//		String regex = "banana";
//
//		String regexReplace = str.replaceAll(regex, "apple"); // Example usage
//		
//		System.out.println(regexReplace);
		
		String str = "apple,banana,cherry";
		String[] fruits= str.split(",");
	    System.out.println(Arrays.toString(fruits)); // ["apple", "banana", "cherry"]
	    
	    
	    String str1 = "Java";
	    char[] chars = str1.toCharArray(); // ['J', 'a', 'v', 'a']
         System.out.println(Arrays.toString(chars));
         
         String str2 = "java";
         String str3 =  new String("java");
         String str4 = str2.intern();  
         System.out.println(str4.equals(str3));
         
         int a = 10;
         System.out.println(String.valueOf(a));



	}

}
