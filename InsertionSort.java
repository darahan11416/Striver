package sorting;

public class InsertionSort 
{
	public static void insertionSort(int arr[])
	
	{
		int temp,j;
		for(int i=0;i<arr.length;i++)
		{
			temp = arr[i];
			j=i;
					while(j>0 && arr[j-1]>temp)
					{
						arr[j] = arr[j-1];
						j= j-1;
						
						
					}
						arr[j] = temp;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
		
	}
	public static void main(String[] args) {
		
		
		int arr[] = {4,2,5,1};
		
		
		insertionSort(arr);
		
		
		
		
	}

}
