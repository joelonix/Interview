package strings;

public class MaxOccCharOfGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "JoJ";
		Character c=maxOccCharacter(str);
		System.out.println("The max occuring character is "+c);

	}

	static Character maxOccCharacter(String str){

		char [] charArray=str.toCharArray();

		int [] count=new int[128];

		for (int i=0; i<str.length(); i++)
		{
			count[charArray[i]]++;
		}
		
		int max=-1;
		char result = 0;
		for (int i = 0; i < str.length(); i++) {
	        if (max < count[charArray[i]]) {
	            max = count[charArray[i]];
	            result = charArray[i];
	        }
	    }
		return result;
	}
	
}
