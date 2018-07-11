package aaa;
import java.util.Scanner;
public class As {
	public String withoutX(String str) {
		   
		  if(str.length() < 1) return str ;
		  if(str.length() == 1 && str.equals("x") ) return "" ;
		   
		  if( str.substring(0,1).equals("x") ){
		        if( str.substring(str.length()-1).equals("x") )
		           return str.substring(1,str.length()-1) ;
		            
		        else return str.substring(1) ;
		       
		      }
		    
		  else{ 
			  if( str.substring(str.length()-1).equals("x")) 
		        
		           return str.substring(0,str.length()-1) ;
		            
		   else return str ;
	}}
	public static void main(String[]args){
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		
		if(str.length() < 1)
			System.out.println(str) ;
		  if(str.length() == 1 && str.equals("x") ){ 
			  System.out.println( "") ;
	}
		  if( str.substring(0,1).equals("x") ){
		        if( str.substring(str.length()-1).equals("x") ){
		           System.out.println(str.substring(1,str.length()-1));
		  }
		        else {
		        	System.out.println(str.substring(1)) ;
		      }}
		  else{ if( str.substring(str.length()-1).equals("x")) 
		  {	        
		           System.out.println(str.substring(0,str.length()-1));
	}    
		   else{ 
			   System.out.println( str) ;
		  
	}}
		   
		}
}
