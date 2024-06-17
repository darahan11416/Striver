package sorting;

public class Selection_sort 
{
	public static void selectionSort(int arr[]) 
	{
		for(int i=0;i<arr.length;i++)
		{
			
			int min = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[min]>arr[j]) {
					
					min = j;
					
					
				}
				
			}
		//swap operation
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
			
			
		}
		
		
		for(int k=0;k<arr.length;k++)
			
		{
			System.out.print(arr[k]+" ");
			
			
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {8,23,1,3,5};
		
		selectionSort(arr);
		
		
		
		
		
		
	}
	
	

}
