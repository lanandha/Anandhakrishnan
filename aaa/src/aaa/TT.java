package aaa;
import java.util.*;
public class TT {
	
	
	    public static void main(String[]args){
	        String s;
	        int i;
	        Scanner sc=new Scanner(System.in);
	        s=sc.nextLine();
	      //  int len[]=s.length();
	        String ss[]=s.split(" ");
	        for(i=0;i<ss.length;i++){
	            //int c=0,p=0;
	            int q=ss[i].length();
	            if(q%2==0){
	                char[]ch=ss[i].toCharArray();
	                int c=0,p=0;
	                for(int j=0;j<ch.length;j++){
	                    if(ch[j]>='a'&& ch[j]<='z'||ch[j]>='A'&&ch[j]<='Z')
	                {
	                if(ch[j]>='A'&&ch[j]<='Z'){
	                    c++;
	                }
	                else if(ch[j]>='a'&&ch[j]<='z'){
	                    p++;
	                }
	                    
	                }}
	                if(c==p){
	                    
	        //for(String w:ss){
	                  
	        System.out.print(ss[i] );
	                    
	                }}}
	            }
	        }




