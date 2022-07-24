package DataStructure;
class createstack
{
	static int[] arr = new int[5];
	static int size=5;
	static int top=-1;
	
	
	
	
	public static boolean isempty() 
	{
		if (top == -1) 
		{
			return true;
		}
		else 
		{
			return false;
		}

	}

	public static boolean isfull()
	{

		if (top == size-1) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}

	
	
	public static void push(int ele) 
	{
		if(isfull())
		{
		System.out.println("STack full");	
		}
		else 
		{
			top=top+1;
			arr[top]=ele;
		}	
	}
	
	
	
	public static int pop()
	{
		if(isempty())
		{
			System.out.println("Stack empty");	
			return 0;
		}
		else 
		{
			int x=arr[top--];
			return x;
		}
		
	}
	
	
	
	public static void dispaly_stack() 
	{
		int i;
		if(isempty())
		{
			System.out.println("STack empty");	
			
		}
		else 
		{
			
			for( i=0;i<=top;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}	
	
	public class stack 
{
	public static void main(String[] args) 
	{
		
		createstack s=new createstack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.dispaly_stack();
		System.out.println("\r");
		s.pop();
		s.dispaly_stack();
//  	System.out.println("\r");
//		s.pop();
//		s.dispaly_stack();
//		System.out.println("\r");
//		s.pop();
//		s.dispaly_stack();
//		
		
	}
}
