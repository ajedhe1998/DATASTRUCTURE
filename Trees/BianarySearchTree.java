package DataStructure;
class bnode{
	
	int data;
	bnode left;
	bnode right;

	public bnode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

}

public class BianarySearchTree {
	
	static	 bnode root;
	
	public static bnode   insert_BT(bnode root,int data) 
	{
		bnode newnode=new bnode(data);
		if(root==null)
		{
			root=newnode;
			return root;
		}
		if(data<root.data)
		{
			root.left=insert_BT(root.left, data);
		}
		else if(data>root.data)
		{
			root.right=insert_BT(root.right, data);
		}
		
		return root;
		
		
	}
	
	
	
	public static void print(bnode root) {
		
		
		if(root!=null)\
		{
			print(root.left);
			System.out.println(root.data);
			print(root.right);

		}
	}
	
	public static void print_preorder(bnode root) {
			if(root!=null)
			{
				System.out.println(root.data);
				print(root.left);
				print(root.right);
				
			}
		}
			
		
	public static void print_post(bnode root) {
				if(root!=null)
				{
					print(root.left);
					print(root.right);
					System.out.println(root.data);
				}
			}\
	
	public static bnode  search(bnode s,int data) 
	{
		if(s!=null)
		{
			if(s.data>data)
			{
				s=search(s.left, data);
			}
			else if (s.data<data) 
			{
				s=search(s.right, data);
			}
			else
			{
				return s;
			}
			
		}
		return s;
	}

	
	public static bnode find_prev(bnode root,bnode f) 
	{
		bnode parent=null;
		int rv=f.data;
		int rh;
		while(root!=f)
		{
			parent=root;
			rh=root.data;
			if(rv<rh)
			{
				root=root.left;
			}
			else
			{
				root=root.right;
			}
			
		}
		return parent;
		
		
	}
	
	
	public static void delete_bt(bnode k,int data) 
	{
		
		bnode node=search(k, data);
		bnode prev=find_prev(k, node);
		if(node.left==null&&node.right==null)
		{
					if(prev!=null)
					{
							if(node.data<prev.data)
							{
								prev.left=null;
							}
							else
							{
								prev.right=null;
							}
					}
					else 
					{
						k=null;
					}
		}
		else if(node.left==null || node.right==null)
		{
			if(prev!=null) 
			{
				if(node.right==null)
				{
					if(prev.data>node.data)
					{
						prev.left=node.left;
					}
					else
					{
						prev.right=node.left;
					}
				}
				else 
				{
					if(prev.data>node.data)
					{
						prev.left=node.right;
					}
					else
					{
						prev.right=node.right;
					}
				}
			}
			else
			{
				if(node.left==null)
				{
					k=node.right;
				}
				else
				{
				k=node.left;	
				}
			}
		
		}
		else if(node.left!=null&&node.right!=null)
		{
			bnode z=node.left;
			
			
				while(z.right!=null)
				{
					z=z.right;
				}
				
				z.right=node.right;
				if(prev!=null) {
					if(prev.right==node)
					{
						prev.right=node.left;
					}
					else
					{
						prev.left=node.left;
					}
			}
				else
				{
					root=k.left;
				}	
		}
		
		
		

		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		BianarySearchTree b1=new BianarySearchTree(); 
		
		insert_BT(b1.root, 10);
		insert_BT(b1.root, 9);
		insert_BT(b1.root, 25);
		insert_BT(b1.root, 8);
		insert_BT(b1.root, 11);
		insert_BT(b1.root, 26);
		insert_BT(b1.root, 12);
		print(b1.root);
		delete_bt(b1.root, 10);
		System.out.println();
		print(b1.root);
		
		
		
		
	}
	
	
	
	
	

}
