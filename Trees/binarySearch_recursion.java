package DataStructure;

public class binarySearch_recursion {
	
  static int usingrecursiom(int arr[],int left,int right,int temp) 
 {
	 if(left>right)
		 return -1;
	 int mid=(right+left)/2;

	 System.out.println(arr[mid]+" " +left+" "+ right);
	 if(temp==arr[mid]) 
	 {
		 return mid;
	 }
	 else if(temp<arr[mid])
	 {
		 return usingrecursiom(arr, left, mid-1, temp);  
	 }
	 else
	 {
		return usingrecursiom(arr, mid+1, right, temp);
	 }
 }
	public static void main(String[] args)
	{
		int [] arr = {10,20,30,40,41,45,48,49,55,65,77,80};
		
		System.out.println(usingrecursiom(arr, 0, arr.length-1, 65));
		

}
}
