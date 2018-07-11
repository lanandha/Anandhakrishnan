package aaa;
import java.util.*;
public class StableandUnstable {
public static void main(String[]args){
	int i,j,a,b,c=0,l = 0,min=0,max=0,y=0,d=0;
	String sum;
	String s;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	String[]arr=new String[a];
	int bc[]=new int[100];
	char ch[]=new char[100];
	for(i=0;i<a;i++){
		arr[i]=sc.nextLine();
	}
	
	for(i=0;i<a;i++){
		Arrays.sort(arr);
		
	for(j=i+1;j<a;j++){
		l=arr[i].charAt(i);
		if(arr[i].charAt(i)==arr[i].charAt(j)){
			c++;
		}}
	}
	if(c==0||l/2==c||l==c){
		System.out.println("stable");
	}else
	{
		System.out.println("unstable");
	}
	sum=arr[0]+arr[a-1];
	System.out.println(sum);
}}

