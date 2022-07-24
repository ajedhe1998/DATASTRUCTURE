package SortAlgo;

public class InsertationSOrt {
	
	public static void printArray(int[] arr)
	{
	    for (int i = 0; i < arr.length; i++)
	    {
	    System.out.print(arr[i]+" ");	
	    }
	}

	public static void insertionSort(int [] arr){
	    int key, j;

	    for (int i = 1; i < arr.length; i++)
	    {
	        key = arr[i];
	        j = i-1;
	      
	        while(j>=0 && arr[j] > key)
	        {
	            arr[j+1] = arr[j];
	            j--;
	        }
	        arr[j+1] = key;
	    }
	}
	
	public static void main(String[] args) 
	{   
	    int A[] = {10,2,5,7,3,6,9};
	   
	    printArray(A);
	    insertionSort(A);
	    System.out.println();
	    printArray(A);
	 
	}


}
