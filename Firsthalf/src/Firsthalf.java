import java.util.*;
public class Firsthalf {
public static void main(String[]args){
	String s="CatDog";
	int len=s.length();
	if(len%2==0){
		String ss=s.substring(0,3);
		System.out.println(ss); ;
	}
	else
	{
		System.out.println("null");}
}
}
