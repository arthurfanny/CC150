//write code to remove duplicates from an unsorted linked list;

public class Q1{

//with a hashSet as the temporary place for data storage
	
	public static void removeDuplicate(LinkedListNode n){
		HashSet<Integer> set = new HashSet<Integer>;
		LinkedListNode prev = null;
		while (n != null){
			if(set.contains(n.data)){
				prev.next = n.next;
			}
			else{
				set.add(n.data);
				prev = n;
			}

		n = n.next;
		}
	}


//without extra space
	static void removeDuplicates2(LinkedListNode n){
		if ( n==null) return null;
		while(n != null){
			LinkedListNode runner = n;
			while(runner.next != null){
				if(runner.next.data = n.data){
					runner.next = runner.next.next;
				}
					else{
						runner=runner.next;
					}
				}
			n = n.next;
		}
}

				
	






