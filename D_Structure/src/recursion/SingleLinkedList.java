package recursion;

public class SingleLinkedList 
{
		class Node
		{
			Object data;
			Node next;
			Node(Object data)
			{
				this.data=data;
			}
		}
		static Node head;
		public boolean add(Object data)
		{
			Node n=new Node(data);
			if(head==null)
			{
				head=n;
				return true;
			}
			Node t=head;
			while(t.next!=null)
			{
				t=t.next;
			}
			t.next=n;
			return true;
		}
		public boolean addFirst(Object data)
		{
			Node n=new Node(data);
			n.next=head;
			head=n;
			return true;
		}
		public boolean addAny(Object data,int in)
		{
			Node n=new Node(data);
			if(in==0)
			{
				n.next=head.next;
				head=n;
				return true;
			}
			Node obj=new Node(data);
			Node t=head;
			for(int i=0;i<in-1;i++)
			{
				t=t.next;
			}
			obj.next=t.next;
			t.next=obj;
			return true;
		}
		public String toString()
		{
			String s="";
			Node t=head;
			while(t!=null)
			{
				s=s+t.data+" ";
				t=t.next;
			}
			return s;
		}
		public boolean deleteFirst()
		{
			if(head==null)
			{
				return false;
			}
			Node t=head;
			t=t.next;
			head=t;
			return true;
		}
		public boolean deleteLast()
		{
			Node temp=head;
			while(temp.next.next != null)
			{
				temp = temp.next;
			}
			temp.next=null;
			return true;
		}
		public boolean deleteAny(Object ob)
		{
			Node t=head;
			Node prev=null;
			if(t.data==ob)
			{
				head=t.next;
				return true;
			}
			while(t!=null && t.data!=ob)
			{
				prev=t;
				t=t.next;
			}
			if(t==null)
			{
				return false;
			}
			else
			{
			prev.next=t.next;
			}
			return true;
		}
		public static void main(String[] args) 
		{
			SingleLinkedList l=new SingleLinkedList();
			l.add(7);
			l.add("BD");
			l.add("JSpider");
			l.add("QSpider");
			l.add("Termi");
			l.addAny("raja",0);
			l.deleteLast();
			System.out.println(l);
		}
	}


