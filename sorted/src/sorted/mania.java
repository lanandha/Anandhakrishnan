package sorted;
import java.util.Scanner;
public class mania {
  public static void main(String[] args){
	  String str;
	  System.out.println("enter the word:");
	  Scanner cc=new Scanner(System.in);
	  str=cc.nextLine();
	  int i,j,length;
	  String ss;
	  length=str.length();
	  for(i=0;i<=length-2;i++){
		  for(j=i+2;j<=length;j++){
			  ss=str.substring(i,j);
			  System.out.print(ss+" ");
		  }
		  System.out.println( );
		  }
	  }
  }

