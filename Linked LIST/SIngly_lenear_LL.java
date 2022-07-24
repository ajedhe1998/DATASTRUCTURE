package DoublyLinkedList;
class node
{
	int data;
	node next;
	node prev;
	
	public node(int data)
	{
		this.data = data;
		this.next = null;
		this.prev = null;
	}
	
	public node(int data,node next,node prev)
	{
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
}



class DoubblyLinkedList
{
	node head=null;
	node tail=null;
	
	
	public  void show() 
	{
				if(head==null)
				{
					System.out.println("empty");
				}
				else
				{
				node temp=head;
					
				while(temp.next!=null)
					{
						System.out.print(temp.data+" ");
						temp=temp.next;
					}
					System.out.print(temp.data+" ");
				}
				System.out.println("");
	}
	
	
	
	
	public void createNode_at_end(int data)
	{
		node newnode=new node(data);
		if(head==null)
		{
			head=tail=newnode;
			head.prev=null;
			tail.next=null;
		}
		else
		{
			tail.next=newnode;
			newnode.prev=tail;
			tail=newnode;
			tail.next=null;
		}
	}
	
	
	
	
	public void insert_at_begning(int data) 
	{
		node newnode=new node(data);
		if(head==null)
		{
			head=tail=newnode;
			head.prev=null;
			tail.next=null;
		}
		else
		{
			head.prev=newnode;
			newnode.next=head;
			head=newnode;
			head.prev=null;
		}
	}
	
	
	
	
	public void insert_before_node(int check,int data) 
	{
		node newnode=new node(data);
		if(head==null)
		{
			head=tail=newnode;
			head.prev=null;
			tail.next=null;
		}
		else if(check==head.data)
		{
			insert_at_begning(data);
		}
		else
		{
			node temp=head;
			while(temp.data!=check)
			{
				temp=temp.next;
			}
			newnode.prev=temp.prev;    //10 20 30 40 50 60
			temp.prev.next=newnode;
			newnode.next=temp;
			temp.prev=newnode;
		}
	}
	
	
	
	public void insert_after_node(int check,int data) 
	{
		if(check==tail.data)
		{
			createNode_at_end(data);
		}
		else
		{
			node newnode=new node(data);
			node temp=head;
			while(temp.data!=check)
			{
				temp=temp.next;
			}
			newnode.prev=temp;
			newnode.next=temp.next;
			temp.next.prev=newnode;
			temp.next=newnode;	
		}
	}
	
	

	
	public void delete_at_begning()
	{
		if(head==null)
		{
			System.out.println("List is empty!");
		}
		else
		{
			head=head.next;   //10 20 30 40 50
			head.prev=null;
		}	
	}
	
	
	
	
	public void delete_end()
	{
		if(head==null)
		{
			System.out.println("List is empty!");
		}
		else
		{
			tail=tail.prev;
			tail.next=null;
			
		}
	}
	
	
	
	
	public void delete_specific_node(int data)
	{
		if(head==null)
		{
			System.out.println("List is Empty!");
		}
		else if(head.data==data)
		{
			delete_at_begning();
		}
		else if(tail.data==data)
		{
			delete_end();
		}
		else
		{
			node temp=head;	
			while(temp.data!=data)
			{
			temp=temp.next;
			}
			temp.prev.next=temp.next;   //10 20 30 40 50 60 70
			temp.next.prev=temp.prev;
		}
	}
	
	
	
	
	public void delete_after_node(int check)
	{
		if(head==null)
		{
			System.out.println("Empty list!");
		}
		else if(tail.prev.data==check)
		{
			delete_end();
		}
		else
		{
			node temp=head;
			while(temp.data!=check)
			{
			temp=temp.next;	
			}
			node temp2=temp.next.next;
			temp.next=temp2;
			temp2.prev=temp;
			
		}
	}
	
	
	public void delete_before_node(int check) 
	{
		
		if(head==null)
		{
			System.out.println("Empty list!");
		}
		else if(head.next.data==check)
		{
			delete_at_begning();
		}
		else
		{
			node temp=head;
			while(temp.data!=check)
			{
			temp=temp.next;	
			}
			node temp2=temp.prev.prev;
			temp2.next=temp;
			temp.prev=temp2;
	}
	

}

}

public class TestDoublyLL {
		public static void main(String[] args) {
			
			DoubblyLinkedList dl =new DoubblyLinkedList();

			dl.createNode_at_end(1);
			dl.createNode_at_end(2);
			dl.createNode_at_end(3);
			dl.createNode_at_end(4);
			dl.createNode_at_end(5);
			dl.createNode_at_end(6);
			dl.createNode_at_end(7);
			dl.createNode_at_end(8);
			dl.show();
			dl.delete_after_node(3);
			dl.show();
			dl.delete_before_node(5);
			dl.show();
		}
}
