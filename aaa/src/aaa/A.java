package aaa;
import java.util.Scanner;
public class A {
	
	//public class String {
		public static void main(String[]args){
			String s;
			//String srr[]=new String[100];
			Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
	        int upper = 0, lower = 0,number=0;
	 
	        for(int i = 0; i < s.length(); i++)
	        {
	            char ch = s.charAt(i);
	            if (ch >= 'A' && ch <= 'Z')
	                upper++;
	            else if (ch >= 'a' && ch <= 'z')
	                lower++;
	            else
	            	number++;
	        }
	        System.out.println(upper);
	        System.out.println(lower);
	        System.out.println(number);
	        }

	}

