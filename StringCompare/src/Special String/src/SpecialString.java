import java.util.Scanner;
public class SpecialString {
	//public class PrimeExample{    
		 public static void main(String args[]){    
		  int i,m=0,flag=0,len;   
		  String s;
			  Scanner sc=new Scanner (System.in);
		  s=sc.nextLine();
	String[] a=s.split("//s");
		  int n=s.length();
		  
		  //int n=2;//it is the number to be checked    
		  m=n/2;      
		  if(n==0||n==1){  
		System.out.println(n+" not special");      
		  }else if(n%2==0){
			  String upper=s.toUpperCase();  
		  }
			  else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" not special");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" special"); }  
		  }  
		}    
		}   

