package DataStructure;
class node
{
			int data;
			node next;
		
			public node(int data) 
			{
				this.data=data;
				next = null;
			}
}



class  linkedlist
{
			node head=null;
			node tail=null;
			
	public void createnode_at_end(int data)
	{
				node newnode=new node(data);
				if(head==null) 
				{
					tail=head=newnode;
				}
				else
				{
					node temp=head;
					while(temp.next!=null)
						{
							temp=temp.next;
						}
					temp.next=newnode;
					tail=newnode;
					tail.next=null;
				}
	}	




	
	public void insert_begning(int data,Character  ch) 
	{
				node newnode=new node(data);
				if(head==null)
				{
					tail=head=newnode;
				}
				else 
				{
					newnode.next=head;
					head=newnode;
				}
	}

	

	
	
	public void after_insert(int data,int check,Character  ch) 
	{
				if(head==null)
				{
					System.out.println("Empty");
				}
				else
				{
					node prev=null;
					node newnode=new node(data);
					node temp=head;
					try {
					while(temp.data!=check)
					{
						temp=temp.next;
					}
					prev=temp.next;
					temp.next=newnode;
					newnode.next=prev;
					}catch (NullPointerException e) {
						System.out.println("element not found");
					}
				}	
	}
	
	
	public void insert_before(int data,int check,Character  ch)
	{
		node newnode=new node(data);
		node prev=previousNode(check);
		node temp;
		temp=prev.next;
		prev.next=newnode;
		newnode.next=temp;
	
	}
	
	
	public void delete_specific_pos(int data) 
	{
		node prev=previousNode(data);
		if(prev==null)
		{
			delete_begining();
		}
		else 
		{
			node temp=prev.next.next; 
			prev.next=temp;		
		}
	}
	
	
	
	public void delete_after_node(int data)
	{
		if(head.data==data)
		{
			delete_begining();
		}
		else
		{
			node temp = head;
			while(temp.data!=data) 
			{
				temp=temp.next;
			}
			temp.next=temp.next.next;	
		}
	} 
	
	

	public void delete_begining() 
	{
		if(head==null)
		{
			System.out.println("empty");
		}
		else 
		{
			node temp=head.next;  
			head=temp;
		}	
	}
	
	
	
	public void deleteFromEnd() 
	{  
        	if(head == null) 
        	{  
        		System.out.println("List is empty");   
        	}  
        	else 
        	{  
        			if(head != tail ) 
        			{  
        				node current = head;   
        				while(current.next != tail) 
        				{  
        					current = current.next;  
        				}          
        				current.next=null;
        				tail=current;
        			}  
        			else 
        			{  
        				head = tail = null;  
        			}  
        	}  
    }
	
	
	public node previousNode(int data)
	{
		node temp = head;
		node prev = null;
		if(head != null)
		{
			while(temp.next!= null)
			{
				
				if(temp.next.data == data)
				{	
					prev = temp;
				} 
				temp = temp.next;
			}
		}
		return prev;
	}


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

}



public class mainlinkedlist 
{
	public static void main(String[] args) 
	{
		linkedlist ll = new linkedlist();
		ll.createnode_at_end(1);
		ll.createnode_at_end(2);
		ll.createnode_at_end(3);
		ll.show();
		
	}
}




