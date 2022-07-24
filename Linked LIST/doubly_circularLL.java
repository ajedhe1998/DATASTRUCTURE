package SortAlgo;

import DataStructure.stack;

class node
{
	int data;
	node next;
	node prev;
	
	public node(int data) 
	{
	this.data=data;
	next=null;
	prev=null;
	}
	
	public node(int data,node next,node prev) 
	{
		this.data=data;
		this.next=next;
		this.prev=prev;
	}
}

class create_dcl
{
	node head=null;
	
	public  void show() 
	{
		if(head==null)
			{
			System.out.println("empty");
			}
		else
		{
			node temp=head.next;	
			while(temp!=head)
			{
			System.out.print(temp.data+" ");
			temp=temp.next;
			}
			System.out.println(temp.data);
		}	
	}
	
	
	public void create_at_end(int data) 
	{
		node newnode=new node(data);
		if(head==null)
		{
			head=newnode;
			head.next=newnode;
			newnode.prev=head;
		}	
		else
		{
			newnode.prev=head;
			newnode.next=head.next;
			head.next.prev=newnode;
			head.next=newnode;
			head=newnode;
		}
	}	
		
	
	public void create_at_begning(int data) 
	{
			node newnode=new node(data);
			if(head==null)
			{
				head=newnode;
				head.next=newnode;
				newnode.prev=head;
			}	
			else
			{
				newnode.prev=head;
				newnode.next=head.next;
				head.next.prev=newnode;
				head.next=newnode;
			}
	}
	
	
	public void insert_after_node(int check,int data) 
	{
		node newnode=new node(data);
		if(head==null)
		{
			head=newnode;
			head.next=newnode;
			newnode.prev=head;
		}
		else
		{
			if(head.data==check)
			{
				create_at_end(data);
			}
			else
			{
				node temp=head.next;
				while(temp.data!=check)
				{
					temp=temp.next;	
				}
				newnode.next=temp.next;
				temp.next.prev=newnode;
				temp.next=newnode;
				newnode.prev=temp;
			}
		}
	}
	
	
	
	
	public void insert_before_node(int check,int data) 
	{
		node newnode=new node(data);
		if(head==null)
		{
			head=newnode;
			head.next=newnode;
			newnode.prev=head;
		}
		else
		{
			if(head.next.data==check)
			{
				create_at_begning(data);
			}
			else
			{
				node temp=head.next;
				while(temp.data!=check)
				{
					temp=temp.next;	
				}
				newnode.next=temp;
				newnode.prev=temp.prev;
				temp.prev.next=newnode;
				temp.prev=newnode;
			}
		}
	}
	
	public void delete_begining()
	{
		if(head==null)
		{
			System.out.println("Empty!");
		}
		else
		{
			node temp=head.next.next;
			head.next=temp;
			temp.prev=head;
		}
	}
	
	
	
	public void delete_end()
	{
		if(head==null)
		{
			System.out.println("Empty!");
		}
		else
		{
			head.prev.next=head.next;
			head.next.prev=head.prev;
			head=head.prev;
		}
	}
	
	
	public void delete_after(int check) 
	{
		if(head==null)
		{
			System.out.println("Empty!");
		}
		else
		{
			node temp=head.next;
			while(temp.data!=check) 
			{
				temp=temp.next;
			}
			if(temp==head) 
			{
				delete_begining();	
			}
			else if (temp.next==head)
			{
				delete_end();
			}
			else
			{
				node temp2=temp.next.next;
				temp.next=temp2;
				temp2.prev=temp;	
			}
		}
		
	}
	
	
	
	public void delete_before(int check) 
	{
		if(head==null)
		{
			System.out.println("Empty!");
		}
		else
		{
			node temp=head.next;
			while(temp.data!=check) 
			{
				temp=temp.next;
			} 
	
			if(head.next==temp)
			{
				delete_end();
			}
			else
			{
				node temp2=temp.prev.prev;
				temp2.next=temp;
				temp.prev=temp2;		
			}
		}
		
	}
	
	
	
	public void delete_specificnode(int data)
	{
		if(head==null)
		{
			System.out.println("List is empty!");
		}
		else
		{
			node temp=head.next;
			while(temp.data!=data)
			{
				temp=temp.next;
			}
			if(temp==head)
			{
				delete_end();
			}
			else if(temp==head.next)
			{
				delete_begining();
			}
			else
			{
				   temp.prev.next=temp.next;
				   temp.next.prev=temp.prev;
			}
		}
	}
}

public class doubly_circular
{
	public static void main(String[] args) 
	{
		create_dcl dcl=new create_dcl();
		dcl.create_at_end(10);
		dcl.create_at_end(20);
		dcl.create_at_end(30);
		dcl.create_at_end(40);
		dcl.create_at_end(50);
		dcl.show();
		dcl.create_at_begning(5);
		dcl.show();
		dcl.insert_after_node(30,35);
		dcl.insert_after_node(35,37);
		dcl.show();
		dcl.insert_before_node(35, 34);
		dcl.insert_before_node(34, 33);
		dcl.show();
		dcl.delete_begining();
		dcl.delete_begining();
		dcl.show();
		dcl.delete_end();
		dcl.delete_end();
		dcl.show();
		dcl.delete_after(33);
		dcl.show();
		dcl.delete_before(35);
		dcl.show();
		dcl.delete_specificnode(35);
		dcl.show();
	}
}
