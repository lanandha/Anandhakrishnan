package wifi;
import java.util.*;
public class Wifi {
	public static void main(String[]args){
		int a,b,c,sum=0,name;
		String s,l;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		s=sc.nextLine();
		System.out.println("Enter the room no and name :"+a+ s);
	char sp[]=new char[10];
 int temp=a;	
	while(a!=0)
		{
			b=a%10;
			a/=10;
			sum=sum+b;
		//	a=a/10;
		}
	if(a==0 && sum>=10){
		a=sum;
		sum=0;
	}
	sp[0]=Character.forDigit(sum, 10);
	int t=temp;
	c=t%10;
	switch(c){
	//sp[1]=character.forDigit(a);
	
	case 1:
        sp[1] = '!';
        break;
    case 2:
        sp[1] = '@';
        break;
    case 3:
        sp[1] = '#';
        break;
    case 4:
        sp[1] = '$';
        break;
    case 5:
        sp[1] = '^';
        break;
    case 6:
       sp[1] = '&';
        break;
    case 7:
        sp[1] = '*';  
        case 8:
            sp[1] = '(';
            break;
        case 9:
            sp[1] = ')';
	break;
	default:
	}
	int q=s.length();
	l=s.substring((q-1),q);
	sp[2]=l.charAt(0);
	int m=t/10;
	m=m%10;
	sp[3]=Character.forDigit(m,10);

	String d=new String(sp);
	System.out.println(d);
}

}
