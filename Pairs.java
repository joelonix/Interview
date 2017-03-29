package arrays;


import java.util.Hashtable;

public class Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1,4,3,3,5,2,6};
		int sum=6;
		Hashtable<Integer, Integer> map=new Hashtable<Integer,Integer>();
		
		findPairs(arr,sum,map);

	}
	
	static void findPairs(int arr[],int sum,Hashtable<Integer, Integer> map){
		
		for(int index=0;index<arr.length;index++){
			int temp=sum-arr[index];
			
			if(temp>=0&&map.containsKey(temp)){
				System.out.println("The pair whose sum is "+sum+"is "+arr[index]+","+temp);
			
			}
			map.put(arr[index],1);
	}

	}
	
}
