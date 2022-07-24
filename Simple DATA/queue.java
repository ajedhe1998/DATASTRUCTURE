package DataStructure;


class create_queue{
	static int[] arr1=new int[10];
	static int size=arr1.length;
	int front;
	int rear;
	
	
	
	
	public create_queue() {
		super();
		this.front = 0;
		this.rear = arr1.length-1;
		
	}
	
	
	public boolean isfull1() {
		
		if(rear==size)
		{
			return true;
		}
		else
		{
		return false;	
		}
		
	}
	
	
	public boolean isempty1() {
		
		if(rear==front)
		{
			return true;
		}
		else
		{
			return false;	
		}
		
	}
	
	
	
	public void enqueue(int data) 
	{
		if(isfull1())
		{
			System.out.println("Queue is full!");
		}
		else
		{
			arr1[rear++]=data;
			
		}
	}
	
	
	
	public void denqueue() 
	{
		if(isempty1())
		{
			System.out.println("Queue is Empty!");
		}
		else
		{
			front++;
			
		}
	}
	
	
	
	
	public void display() {
		
		for(int i=front;i<=rear;i++)
		{
			
			System.out.print(arr1[i]+" ");
			
		}
		
		
		
		
	}
	
	
	
	

	
	
}


public class queue {

	public static void main(String[] args) {
		
	create_queue q =new create_queue();
	
	q.enqueue(10);
	q.enqueue(20);
	q.enqueue(30);
	q.enqueue(40);
	q.display();
	q.denqueue();
	q.denqueue();
	System.out.println("\r");
	q.display();
		
		
		
		
		
		
	}
}
