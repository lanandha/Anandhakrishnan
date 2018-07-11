import java.util.*;
import java.math.*;
public class Practice {
public static void main(String[]args){
	String a,b;
	String reverse="",rev="";
	Scanner sc=new Scanner (System.in);
	a=sc.next();
	b=sc.next();
	
	for(int i=a.length()-1;i>=0;i--){
		reverse=reverse+a.charAt(i);
	}
	System.out.println(reverse);
	BigInteger c=new BigInteger(b);
	for(int j=b.length()-1;j>=0;j--){
		rev=rev+b.charAt(j);
		//c=new BigInteger(rev);
	}
	System.out.println(rev+reverse);
}
}
