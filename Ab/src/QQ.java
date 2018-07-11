import java.util.*;
public class QQ {
	public static void main(String[]args){
		int a,r,sum=0,temp;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
	temp=a;;
		while(a>0){
			r=a%10;
			sum=(sum*10)+r;
			a=a/10;
		}
		if(temp==sum){
			System.out.println("palindrome");
		}else{
			System.out.println("not palindrome");
		}
	}

}
