
public class ClinkList {
	Node head;
	Node tail;
	public void insert(int data)
	{
		Node n = new Node();
		n.data = data;
		if(head==null)
		{
			head = n;
			tail = n;
			n.next = head;
		}
		else
		{
			tail.next = n;
			tail = n;
			tail.next = head;
			
		}
	}
	public void insertAtEnd(int data)
	{
		Node temp = head;
		Node n = new Node();
		n.data = data;
		while(temp.next!=head)
		{
			temp = temp.next;
			
		}
		temp.next = n;
		n.next = head;
	}
	public void insertInMiddle(int data,int pos)
	{
		Node n = new Node();
		n.data = data;
		Node temp =head;
		for(int i=0;i<pos-2;i++)
		{
			temp=temp.next;
		}
		n.next = temp.next;
		temp.next = n;
	}
	public void insertAtFront(int data)
	{
		Node n = new Node();
		n.data = data;
		n.next = head;
		head = n;
		tail.next = head;
	}
	public void deleteLast()
	{
		 Node temp = head;
		 int total = count();
		 for(int i=0;i<total-2;i++)
		 {
			 temp = temp.next;
			 
		 }
		 tail=temp;
		 temp.next = head;
		 
	}
	public void deleteFirst()
	{
		tail.next = head.next;
		head = head.next;
	}
	public void show()
	{
//		Node temp = head;
//		do
//		{
//			System.out.println("Node is "+ temp.data);
//			temp = temp.next;
//		}while(temp!=head);
		Node temp = head;
		while(temp.next!=head)
		{
			System.out.println("Node is "+ temp.data);
			temp = temp.next;
		}
		System.out.println("Node is "+ temp.data);
	}
	public int count()
	{
		Node temp = head;
		int count = 0;
		while(temp.next!=head)
		{
			count++;
			temp = temp.next;
		}
		count++;
		return count;
	}
	
}
