package strings;

public class ISuniqueChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isUniqueChars("joelnm"));

	}

	static boolean isUniqueChars(String str)
	{
		if(str.length()>128){
			return false;
		}

		boolean [] count=new boolean[128];

		for (int i = 0; i < str.length(); i++) {

			if(count[str.charAt(i)]){
				return false;
			}
			count[str.charAt(i)]=true;
		}
		
		return true;

	}
}
