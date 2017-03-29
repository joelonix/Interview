package arrays;


public class PushAllZerosToEndOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,9,8,4,0,0,2,7,0,6,0,9};
		pushZerosToEnd(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	static void pushZerosToEnd(int arr[]){
		int count=0;//count of non zero elements

		//Traverse the array,if the element encountered is non-zero, then replace 
		//the element at index count with this element
		for (int i = 0; i < arr.length; i++) 
		{

			if(arr[i]!=0)
			{
				arr[count++]=arr[i];
			}

		}

		while(count<arr.length)
		{
			arr[count++]=0;
		}
	}

}
