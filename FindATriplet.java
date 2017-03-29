package arrays;

import java.util.Arrays;

public class FindATriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={5,0,3,7,9,44};
		int sum=19;

		Arrays.sort(arr);
		findTripletSum(arr, sum);


	}

	static boolean findTripletSum(int arr[],int sum)
	{
		int leftIndex,rightIndex,tripletSum;
		for (int i = 0; i < arr.length-2; i++) 
		{
			leftIndex=i+1;
			rightIndex=arr.length-1;
			while (leftIndex<rightIndex) 
			{
				tripletSum=arr[i]+arr[leftIndex]+arr[rightIndex];
				if(tripletSum==sum)
				{
					System.out.println("The triplet is "+arr[i]+","+arr[leftIndex]+","+arr[rightIndex]);
					return true;
				}
				if(tripletSum<sum)
				{
					leftIndex++;
				}
				else
				{
					rightIndex--;
				}

			}

		}
		return false;
	}

}
