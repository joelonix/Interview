package strings;

public class CanFormPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(canFormPalindrome("tact coa"));

	}
	
	static boolean canFormPalindrome(String str){
		
		char[] charArray=str.toCharArray();
		
		int [] count=new int[128];
		
		int oddCount=0;
		for (int i = 0; i < str.length(); i++) {
			
			count[charArray[i]]++;
			
		}
		
		for (int i = 0; i < str.length(); i++) {
			if(count[charArray[i]]%2!=0){
				oddCount++;
			}
		}
		
		if(oddCount==1){
			return true;
		}
		
		return false;
	}

}
