package stringdemos;

public class stringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s=new String("hELLo");
System.out.println(s);
char c[]=s.toCharArray();
for (int i=0;i<c.length;i++)
	System.out.println(c[i]);
String s1="";
String s2=null;

System.out.println(s.isEmpty());
System.out.println(s1.isEmpty());
System.out.println(s2.isEmpty());



		/*
		 * String s1="hello"; String s2="cse"; String s3="HELLO"; String s4=s1;
		 */
		/*
		 * System.out.println(s1==s4); System.out.println(s1.equals(s4));
		 * 
		 * System.out.println(s.equals(s1)); System.out.println(s.equals(s2));
		 * System.out.println(s1.equalsIgnoreCase(s3));
		 */
		/*
		 * System.out.println(s.startsWith("he"));
		 * System.out.println(s.endsWith("llo")); System.out.println(s.contains("el"));
		 * System.out.println(s.toLowerCase()); System.out.println(s.toUpperCase());
		 * System.out.println(s.charAt(2)); byte b[]=s.getBytes(); for(int i:b) {
		 * System.out.println(i); }
		 */
		
	}

}
