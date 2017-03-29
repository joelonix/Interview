package arrays;


import java.util.HashMap;
import java.util.Map;

public class SubArrayGivenSumNegative {
	
	//Negative

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]={1, 4, 20, 3, 10, 5};
		int arr[]={15, 2, 4, 8, 9, 5, 10, 23};
		//int arr[]={1,4};
		//int sum=0;
		int sum=23;

		subArraySum(arr, sum);


	}

	static int subArraySum(int arr[],int sum){
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		int currSum=0;
		for (int i = 0; i < arr.length; i++) 
		{
			currSum=currSum+arr[i];
			if(currSum==sum){
				System.out.println("Sum found between "+0+"and "+i);
			}
			else
				if(map.containsKey(currSum-sum))
				{
					System.out.println("found between "+(map.get(currSum-sum)+1)+" and "+i);
					return 1;
				}
			map.put(currSum, i);
		}

		System.out.println("Not found");
		return 0;
	}

}
