package recursion;

public class QueueUsingArray 
{
		int front=-1,rear=-1,cap;
		Object[] obj;
		public QueueUsingArray(int cap) 
		{
			this.cap=cap;
			obj=new Object[cap];
		}
		public boolean enqueue(Object ele)
		{
			if(rear==cap-1)
			{
				System.out.println("QUEUE OVERFLOW");
				return false;
			}
			if(front==-1)
			{
				front++;
			}
			obj[++rear]=ele;
			return true;
		}
		public Object dequeue()
		{
			if(front==-1 || front>rear)
			{
				System.out.println("QUEUE UNDERFLOW");
				rear=front=-1;
				return null;
			}
			return obj[front++];	
		}
		public int size()
		{
			if(front==-1)
			{
				return 0;
			}
			if(rear==-1)
			{
				return 0;
			}
			return rear-front+1;
		}
		public String toString()
		{
			String st="[";
			for(int i=front;i<=rear;i++)
			{
				st=st+obj[i];
				if(i<rear)
					st=st+",";
			}
			return st+"]";
		}
		public static void main(String[] args) 
		{
			QueueUsingArray q=new QueueUsingArray(5);
			q.enqueue("amar");
			q.enqueue("rohit");
			q.enqueue("soumen");
			q.enqueue(95);
			System.out.println(q);//[amar rohit soumen 95 ]
			System.out.println(q.dequeue());//amar
			System.out.println(q);//[rohit soumen 95 ]

			System.out.println(q.dequeue());//rohit
			System.out.println(q.size());//2
			System.out.println(q);//[soumen 95 ]
		}
}
