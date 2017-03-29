package strings;

public class ReverseWordsInGivenSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hi how";

		String reversed=reverseWords(str);
		System.out.println("The reversed words :"+ reversed);

	}

	static String reverseWords(String sentence){

		int start =0;
		char buf[]=sentence.toCharArray();
		int n=sentence.length();

		for (int i = 0; i < sentence.length(); i++) 
		{
			if(buf[i]==' '&&i>0)
			{
				reverse(buf, start, i-1);
				start=i+1;
			}
			else if(i==n-1)
			{
				reverse(buf, start, i);  
			}
		}

		reverse(buf,0,buf.length-1);
		return new String(buf);
	}

	static void reverse(char ch[],int begin,int end){


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
