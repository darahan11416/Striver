package Striver.sheet;

public class ArrayLarge 
{
	public static void main(String[] args) {
		
		int arr[] = {2,0,1,6,74,7};
		
		int max = arr[0];
	
		for(int i =0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max = arr[i];
			}
			
			
		}
 		System.out.println("max element ="+max);
		
	}

}
