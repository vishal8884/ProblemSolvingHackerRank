package LinkedListCustom;

import LinkedListCustom.LinkedListCutom.Node;

public class InsertIntoLinkedList {

	public static void main(String[] args) 
	{
		
		LinkedListCutom list = new LinkedListCutom();
		
		// Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
   
        // Print the LinkedList
        printList(list);

	}
	
	
	public static LinkedListCutom insert(LinkedListCutom list, int data)
	{
		Node new_node = new Node(data);
		new_node.next = null;
		
		if(list.head == null)
		{
			//System.out.println("head null :: "+data);
			list.head = new_node;
		}
		else
		{
			Node last = list.head;
			//interating to find out the last
			while(last.next !=null)
			{
				last = last.next;
			}
			
			last.next = new_node;
		}
		
		System.out.println("list :: "+list.head.data);
		return list;
	}
	
	public static void printList(LinkedListCutom list)
	{
		Node currNode = list.head;
		
		while(currNode != null)
		{
			System.out.println("currNode Data  :: "+currNode.data+" ");
			
			currNode=currNode.next;
		}
	}

}
