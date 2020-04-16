
public class Runner {

	public static void main(String[] args) {
		ClinkList list = new ClinkList();
		list.insert(1);
		list.insert(12);
		list.insert(13);
		list.insertInMiddle(20, 3);
		list.insertAtFront(100);
		list.insertAtEnd(67);
		list.deleteLast();
		list.deleteFirst();
		list.show();
		System.out.println("Total Elemenet in list" +list.count());

	}

}
