package recursion;

public class StackUsingArray
{

		Object[] obj;
		int capacity,top=-1;
		public StackUsingArray(int cap) 
		{
			this.capacity=cap;
			obj=new Object[capacity];
			top=-1;
		}
		public boolean push(Object ele)
		{
			if(top==capacity-1)
			{
				System.out.println("STACK OVERFLOW");
				return false;
			}
			obj[++top]=ele;
			return true;
		}
		public Object pop()
		{
			if(top==-1)
			{
				System.out.println("STACK UNDERFLOW");
				return null;
			}
			return obj[top--];
		}
		public int size()
		{
			return top+1;
		}
		public Object peek()
		{
			if(top==-1)
			{
				System.out.println("STACK UNDERFLOW");
				return null;
			}
			return obj[top];
		}
		public String toString()
		{
			String s="[";
			for(int i=0;i<=top;i++)
			{
				s=s+obj[i];
				if(i<top)
					s=s+",";
			}
			return s+"]";
		}
		public static void main(String[] args) {
			StackUsingArray ms=new StackUsingArray(8);
			ms.push("amar");
			ms.push("rohit");
			ms.push("soumen");
			ms.push(95);
			System.out.println(ms);//[amar rohit soumen 95 ]
			System.out.println(ms.pop());//95
			System.out.println(ms);//[amar rohit soumen ]
			System.out.println(ms.peek());//soumen
			System.out.println(ms);//[amar rohit soumen ]
			System.out.println(ms.pop());//soumen
			System.out.println(ms.size());//2
			System.out.println(ms);//[amar rohit ]
		}

	}


