package SortAlgo;
public class MergeSort {
public static void merge_sort(int[] arr,int low,int mid ,int high) {
	int i,j,k;
	i=low;
	j=mid+1;
	k=low;
	int [] temp= new int [100];     
	while(i<=mid && j<= high)
	{
		if(arr[i]<arr[j])
			{
				temp[k]=arr[i];
				i++;
			
			}
		else
		{
			temp[k]=arr[j];
			j++;
			
		}
		k++;
		
	}
	while(i<=mid)
	{
		temp[k]=arr[i];
		i++;
		k++;
	}
	while(j<=high)
	{
		temp[k]=arr[j];
		k++;
		j++;
	}
	
	for (i=low;i<=high;i++)
	{
		arr[i]=temp[i];
	}
	
}

public static  void didide_merge(int[] arr,int low,int high)
{
	int mid;
	if(low<high)
	{
		mid=(low+high)/2;
		didide_merge(arr, low, mid);
		
		didide_merge(arr, mid+1, high);
		
		merge_sort(arr, low, mid, high);
		
		
	}
	
}

public static void main(String[] args) {
	int [] arr= {45, 23, 78, 10, 75, 24};
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	didide_merge(arr, 0, arr.length-1);
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
}


}
