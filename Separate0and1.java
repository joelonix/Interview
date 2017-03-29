package arrays;

import java.util.Arrays;

public class Separate0and1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={0,1,0,0,1,1,0,0,1};
		seperateZeroAndOne(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	static void seperateZeroAndOne(int arr[]){
		
		int leftIndex=0,rightIndex=arr.length-1;
		
		while (leftIndex<rightIndex) 
		{
			
			while (arr[leftIndex]==0&&leftIndex<rightIndex) 
			{
				leftIndex++;
			}
			while (arr[rightIndex]==1&&rightIndex>leftIndex) 
			{
				rightIndex--;
			}
			if(leftIndex<rightIndex)
			{
				arr[leftIndex]=0;
				leftIndex++;
				arr[rightIndex]=1;
				rightIndex--;
			}
			
		}
		
	}

}
