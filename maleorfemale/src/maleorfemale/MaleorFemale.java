package maleorfemale;
import java.util.*;
public class MaleorFemale {
public static void main(String[]args){
	int a=Integer.parseInt(args[1]);
	String b=args[0];
	if(b.equalsIgnoreCase("male")){
	if(a>=1 && a<=60)
	{
		System.out.println("Interest == 9.2% " );}
		else if(a>=61 && a<=120)
		{
			System.out.println("Interest == 8.3% ");
		}
		else
		{
			System.out.println("not in range");
		}
	}
	else{                                        
		if(a>=1 && a<=58)
		{
			System.out.println("Interest == 8.2% " );}
			else if(a>=59 && a<=120)
			{
				System.out.println("Interest == 7.9% ");
			}
			else
			{
				System.out.println("not in range");
			}}
	}
	
}


