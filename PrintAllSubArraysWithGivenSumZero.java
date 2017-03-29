package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrintAllSubArraysWithGivenSumZero {
	
	public static void  main(String args[]) {
		
	}
	
	List<Integer>  findSubArrays(int arr[]){
		List<Integer> list=new ArrayList<Integer>();
		HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			sum=sum+arr[i];
			
			if(sum==0){
				list.add(0, i);
			}
			
		}
		
		
		
		return list;
		
	}

}
