package arrays;

public class FindTheNumberOccuringOddNumberOfTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,1,2,3,4,3,4,1};
		int oddNumber=getOddOccurenceNumber(arr);
		System.out.println("the number that is occuring odd no of times is "+oddNumber);
		

	}
	
	static int getOddOccurenceNumber(int arr[]){
		int result=0;
		for(int index=0;index<arr.length;index++){
			result=result^arr[index];
		}
		return result;
	}

}
