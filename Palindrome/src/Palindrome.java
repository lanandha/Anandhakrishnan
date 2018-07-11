
public class Palindrome {
	public static void main(String[] args)
	{
	String str1= new String("madam");
	StringBuffer str2= new StringBuffer(str1);
	StringBuffer str3= new StringBuffer(str2);
	str2.reverse();

	System.out.println("First String:"+str2+ " Length:"+str3.length());
	System.out.println("Second String:"+str3+ " Length:"+str2.length());
	if(String.valueOf(str2).compareTo(String.valueOf(str3))==0)
	System.out.println("Was a palindrome");
	else
	System.out.println("Was not a palindrome");
	}
}
