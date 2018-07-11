package aaa;
import java.util.*;
public class QQ {
	public static void main(String[]args){
		int i,d,sum=0;int arr[]=new int[3];
		Scanner sc=new Scanner (System.in);
		for(i=0;i<3;i++){
			arr[i]=sc.nextInt();
			if(arr[i]>=10&&arr[i]<100){
				arr[i]=200+arr[i];
			}if(arr[i]<10){
				arr[i]=210+arr[i];
			}}
			d=sc.nextInt();
			switch(d){
			case 0:{
				sum=((arr[0]%10)+(arr[1]%10)+(arr[2]%10));
				System.out.println(sum);
				break;
			}case 1:{
				sum=(((arr[0]/10)%10)+((arr[1]/10)%10)+((arr[2]/10)%10));
				System.out.println(sum);
				break;
			}case 2:{
				sum=((arr[0]/100)+(arr[1]/100)+(arr[2]/100));
				System.out.println(sum);
				break;
			}
			
			}
		}
}