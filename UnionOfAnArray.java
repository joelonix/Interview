package arrays;

public class UnionOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={1,2,4,5,6};
        int arr2[]={2,3,5,7};
        
        
        printUnion(arr1,arr2, arr1.length, arr2.length);
        
        
	}
	
	static void printUnion(int [] a1,int [] a2,int m,int n){
		int i=0,j=0;
		
		while(i<m&&j<n)
		{
			if(a1[i]<a2[j])
			{
				System.out.print(a1[i++]+" ");
			}
			else if(a2[j]<a1[i]){
				System.out.print(a2[j++]+" ");
			}
			else{
				System.out.print(a2[j++]+" ");
				i++;
			}
			
			
			
		}
		
		//print remaining elements of the larger array
		while(i<m){
			System.out.print(a1[i++]+" ");

		}
		
		while(j<n){
			System.out.print(a2[j++]+" ");

		}

	}

}
