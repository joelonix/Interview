package arrays;

import java.util.Arrays;

public class PairClosestToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={0,59,-9,69,-79,84};
		//After sorting {-79,-9,0,59,69,84}
		
		Arrays.sort(arr);
		sumClosestToZero(arr);
		
	}
	
	static void sumClosestToZero(int arr[])
	{
	
		int leftIndex=0,rightIndex=arr.length-1;
		int minLeftIndex=leftIndex,minRightIndex=rightIndex;
		int currSum,closestSum=9999;
		
		while(leftIndex<rightIndex)
		{
			currSum=arr[leftIndex]+arr[rightIndex];
			if(Math.abs(currSum)<Math.abs(closestSum))
			{
				closestSum=currSum;
				minLeftIndex=leftIndex;
				minRightIndex=rightIndex;
				
			}
			if(currSum<0){
				leftIndex++;
			}
			else{
				rightIndex--;
			}
		}
		
		System.out.println("The two elements whose sum is closest to zero are"+arr[minLeftIndex]+" and "+arr[minRightIndex]);
	}

}
