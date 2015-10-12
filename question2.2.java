//Implement an algorithm to find the nth to last element of a signly linked list

class question2.2 {
	LinkedListNode nthToLast(LinkedListNode head, int n){
		if(head == null || n<1){
			return null;
		}
	
	LinkedListNode p1 = head;
	LinkedListNode p2 = head;

	// The key to this algorithm is to set p1 and p2 apart by n-1 nodes initially so we want p2 to point to the (n-1) node from the start of the list then we move p2 till it reaches the last node of the list. Once p2 reaches the end of the list p1 will be pointing to the nth node form the end of the list

	//loop to move p2
	for (int j = 0; j < n - 1; j++){
		//while moving p2 to check if it becomes null, that is if it reaches end of the list. That would mean that the list has less than n nodes, so its not possible to find nth from last so return null.
	if(p2 == null){
		return null;
	}

	// move p2 forward.
	p2 = p2.next;
	}

	//at this point p2 is on th position of (n-1) node adhead of p1. Now keep moving both forward till p2 reaches the last node in the list.

	while(p2.next = ! null)
		{
			p1 = p1.next;
			p2 = p2.next;
	}

	// at this point p2 has reached the last node in the list and p1 will be pointing to the nth node from the last.... so return it.

	return p1;

}



	 
