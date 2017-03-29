package strings;

public class CheckAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isAnagram("listen", "enlist"));

	}
	
	static boolean isAnagram(String s1,String s2){
		
		char[] charArray1=s1.toLowerCase().toCharArray();
		char[] charArray2=s2.toLowerCase().toCharArray();
		
		int count[]=new int[128];
		
		if(s1.length()!=s2.length()){
			return false;
		}
		
		for (int i = 0; i < s1.length(); i++) {
			
			count[charArray1[i]]++;
			count[charArray2[i]]--;
			
		}
		
		for (int i = 0; i < count.length; i++) {
			
			if(count[i]!=0){
				return false;
			}
			
		}
		
		return true;
		
	}

}
