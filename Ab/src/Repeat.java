import java.util.*;
public class Repeat {
public static void main(String[]args){
	String s;
int i,b=0,k,j;
System.out.println("Enter the String");
	Scanner sc=new Scanner(System.in);
	s=sc.nextLine();
	String []ss=s.split(" ");
	char bb[]=new char[50];
	for(i=0;i<ss.length;i++){
		bb=ss[i].toCharArray();
		for(k=0;k<bb.length;k++){
			for(j=k+1;j<bb.length;j++){
				if(bb[k]==bb[j]){
					bb[j]=0;
				}}
				if(bb[k]!=0){
					System.out.print(bb[k]);
				}}
				System.out.print(" ");
			
		}
	}
}

