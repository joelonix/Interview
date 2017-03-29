package strings;

public class ReverseGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="RAVI IS GENIUS";
		//reverse(str,0,str.length()-1);
		
		String s=reverseWords(str);
		System.out.println(s);




	}

	static void reverse(String str,int begin,int end){

		char ch []=str.toCharArray();
		char temp;
		while(begin<end){
			temp=ch[begin];
			ch[begin]=ch[end];
			ch[end]=temp;
			begin++;
			end--;
		}

		for (char c : ch) {
			System.out.print(c);
		}

	}

	static String reverseWords(String sentence){

		int start =0;
		char buf[]=sentence.toCharArray();
		int n=sentence.length();
		
		for (int i = 0; i < sentence.length(); i++) 
		{
		  if(buf[i]==' '&&i>0)
		  {
			  reverse1(buf, start, i-1);
			  start=i+1;
		  }
		  else if(i==n-1){
			 reverse1(buf, start, i);  
		  }
		}

		//reverse1(buf,0,buf.length-1);
		return new String(buf);
	}

	static void reverse1(char ch[],int begin,int end){


		char temp;
		while(begin<end){
			temp=ch[begin];
			ch[begin]=ch[end];
			ch[end]=temp;
			begin++;
			end--;
		}
	}
}
