package SortAlgo;

public class BubbleSort {
 
	public void sortbubble(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if(arr[j-1]>arr[j])
				{
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;							
				}
			}
		}
		for(int i:arr)
		{
			System.out.print(i+" ");
		}	
	}
	
	public static void main(String[] args) {
		
		 int[] arr= {5,6,8,7,9,3,10,11,25,45,65,45,58}; 
		 new BubbleSort().sortbubble(arr);
	}	
}
