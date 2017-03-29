package arrays;


public class FindMaxDiffOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={4,3,10,2,9,1,6};

		int maxDiff=getMaxDiff(arr);
		System.out.println("Max diff is "+maxDiff);

	}

	static int getMaxDiff(int arr[]){
		int minEleSoFar=arr[0];
		int maxDiffSoFar=arr[1]-arr[0];
		int currDiff=arr[1]-arr[0];

		for(int index=1;index<arr.length;index++)
		{

			if(arr[index]<minEleSoFar)
			{
				minEleSoFar=arr[index];
			}
			else{
				currDiff=arr[index]-minEleSoFar;
				if(currDiff>maxDiffSoFar)
				{
					maxDiffSoFar=currDiff;
				}
			}
		}
		return maxDiffSoFar;
	}

}
