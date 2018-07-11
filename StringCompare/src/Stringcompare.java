
public class Stringcompare {
	public static void main(String[]args){
	String str1 ="matak";
	String str2 = "kate";
	if(str1.substring( str1.length()-1).equalsIgnoreCase( str2.substring(0,1)) )
	                    System.out.println(  str1.concat( str2.substring(1, str2.length())).toLowerCase() );
	                else
	                    System.out.println(  str1.concat( str2) );

}}
