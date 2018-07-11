
public class Pratice {
	public static void main(String[] args) {  

		//public String processWords(String input1,int input2){
			// Read only region end
			// Write code here...
			String input1="Today is a nice day";
		int input2=41;
			String[] s=input1.split(" ");
			int a[]=new int[2];
			a[0]=input2/10;
			a[1]=input2%10;
			String t,t2,str="";
			int i,j,c=0;
			for(i=0;i<2;i++){
				int h=a[i]-1;
				int l=s[h].length();
				t=s[h].substring(l/2);
				if(l%2!=0){
				    t2=s[h].substring(0,l/2+1);
				}
				else{
					t2=s[h].substring(0,l/2);
				}
				t+=new StringBuffer(t2).reverse().toString();
				if(c==0){
					str+=t;
					c=1;
				}
				else{
					str+=" "+t;
				}
			}
			//return str;
			System.out.println(str);
		}
	}