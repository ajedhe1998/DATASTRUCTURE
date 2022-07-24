package circularLinkedList;
class Node
	{	
		int data;
		Node next;
		
		
		public Node(int data) 
		{
		this.data=data;
		next=null;
		}
		
		public Node(int data,Node next) 
		{
			this.data=data;
			this.next=next;
		}
		
	}




class circular_linked_list
{
		
		Node head=null;
		
		
		
		public  void show() 
		{
					if(head==null)
					{
						System.out.println("empty");
					}
					else
					{
						Node temp=head.next;	
						while(temp!=head)
						{
							System.out.print(temp.data+" ");
							temp=temp.next;
						}
						System.out.println(temp.data);	
					}	
		}
		
		
		
		
		public void insert_at_end(int data)
		{
			Node newnode=new Node(data);
			if(head==null)
			{
				head=newnode;
				head.next=newnode;
				
			}
			else
			{	
				newnode.next=head.next;
				head.next=newnode;
				head=newnode;	
			}
		}
		
		
		
		
		public void insert_at_beginng(int data)
		{
			Node newnode=new Node(data);
			if(head==null)
			{
				head=newnode;
				head.next=newnode;
				
			}
			else
			{	
				newnode.next=head.next;
				head.next=newnode;	
			}
		}
		
		
		
		
		public void insert_after_node(int check,int data) 
		{
			Node newnode=new Node(data);
			if(head==null)
			{
				newnode=head;
				head.next=newnode;
			}
			else
			{
				if(head.data==check)
				{
					insert_at_end(data);
				}
				else
				{
					Node temp=head.next;
					while(temp.data!=check)
					{
						temp=temp.next;	
					}
					newnode.next=temp.next;
					temp.next=newnode;
				}
			}
		}
		
		
		
		
		public void insert_before(int check,int data)
		{
			
			Node newnode=new Node(data);
			Node prev=previousNode(check);   
			if(head==null)
			{
				newnode=head;
				head.next=newnode;
			}
			else
			{
				if(check==head.next.data)
				{
					insert_at_beginng(data);
				}
				else
				{
					newnode.next=prev.next;
					prev.next=newnode;
				}
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
				head.next=head.next.next;
			}
		}
		
		
		
		
		
		public void delete_at_end()
		{	
			if(head==null)
			{
			System.out.println("List is empty!");	
			}
			else
			{
				Node prev=previousNode(head.data);
//				Node temp=head.next;
//				head=prev;
//				head.next=temp;
				prev.next=head.next;
				head=prev;
			}	
		}
		
		
		
		
		public void delete_after(int check) 
		{
			if(head==null)
			{
			System.out.println("List is empty!");
			}
			else
			{
				Node temp=head.next;
				while(temp.data!=check) 
				{
					temp=temp.next;
				}
				if(temp==head) 
				{
					delete_at_begning();	
				}
				else if (temp.next==head)
				{
					delete_at_end();
				}
				else
				{
					
				}
			}
		}
		
		
		
		
		public void delete_before(int check)
		{
			if(head==null)
			{
			System.out.println("List is empty!");	
			}
			else
			{	Node temp=head.next;
				Node prev=previousNode(check);
				Node prev2=previousNode(prev.data);
				while(temp.data!=check) 
				{
					temp=temp.next;
				}
		
				if(head.next==temp)
				{
					delete_at_end();
				}
				else
				{
				prev2.next=temp;
				}
			}
		}
		
		
		
		
		public void delete_specific_node(int data) 
		{
			if(head==null)
			{
				System.out.println("List is empty!");
			}
			else
			{
				Node temp=head.next;
				while(temp.data!=data)
				{
					temp=temp.next;
				}
				if(temp==head)
				{
					delete_at_end();
				}
				else if(temp==head.next)
				{
					delete_at_begning();
				}
				else
				{
				Node prev =previousNode(temp.data);
				prev.next=temp.next;
				}
			}
			
		}
		
		
		
		
		public Node previousNode(int data)
		{
			Node temp = head.next;
			Node prev = head;
			if(head != null)
			{
				while(temp!= head)
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

}

	
public class TestCircular {
			public static void main(String[] args) {
				
				circular_linked_list cl=new circular_linked_list();
				cl.insert_at_end(10);
				cl.insert_at_end(20);
				cl.insert_at_end(30);
				cl.insert_at_end(40);
				cl.insert_at_beginng(50);
				cl.show();
				cl.delete_after(10);
				cl.show();	
				cl.insert_after_node(20, 25);
				cl.show();
				cl.insert_after_node(40, 45);
				cl.show();
				cl.insert_after_node(50, 55);
				cl.show();
				cl.insert_before(25, 24);
				cl.show();
				cl.insert_before(50, 49);
				cl.show();
				cl.delete_at_begning();
				cl.show();
				cl.delete_at_end();
				cl.show();
				cl.delete_after(30);
				cl.show();
				cl.delete_before(55);
				cl.show();
				cl.delete_specific_node(24);
				cl.show();
	}

}
