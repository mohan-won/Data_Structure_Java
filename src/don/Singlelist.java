package don;
class Node{
	int data;
	Node link;
}
class Method
{
	static Node head;
	public static void insertAtBegain(int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.link=null;
		if(head==null) //if head is null list is empty
		{
			head = newNode;
		}
		else
		{
			
		}
	}
}
public class Singlelist extends Method {
	public static void main(String[] args) {
		insertAtBegain(1);

	}

}
