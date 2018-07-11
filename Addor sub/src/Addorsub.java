import java.util.Scanner;
public class Addorsub {
public static void main(String[]args){
	int a,b,c;
	String e;
	Scanner s=new Scanner(System.in);
	do {
		System.out.println("Enter the integer");
		c=s.nextInt();
		a=s.nextInt();
		b=s.nextInt();
		switch(c){
		case 1:
		{
			System.out.println((a+b));
			break;
		}
		case 2:
		{
			System.out.println((a-b));
			break;
		}
		default:
		
		System.out.println("invalid input");
		}
		System.out.println("continue");
		e=s.next();
	}while(e.equalsIgnoreCase("y"));
		System.out.println("terminated");
}
}
