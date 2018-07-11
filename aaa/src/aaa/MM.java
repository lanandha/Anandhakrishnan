package aaa;
import java.util.*;
public class MM {
	public String remove(String a,String b){
		if(a.length()>b.length()){
			return(b+a+b);
		}else
			return(a+b+a);
		
	}
	public static void main(String[]args){
		String a,b;
		Scanner sc=new Scanner (System.in);
		a=sc.nextLine();
		b=sc.nextLine();
		if(a.length()>b.length()){
			System.out.println(b+a+b);
		}else
		System.out.print(a+b+a);
	}

}
