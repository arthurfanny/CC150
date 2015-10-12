//Implement an algorithm to delete a node in the middle of a single linked list given only access to that node.

//Example: input the node 'c' from the linked list a-b-c-d-e Result: Nothing is returned but a newly looked linked list look like a-b-d-e

class question23{
	public static void nodeDeletion(LinkedListNode n){
		
		int intermedateData;
		LinkedListNode n1; //Originial Linkedlist
		LinkedListNode n2; //Current LinkedListNode starting from nth place
		if(n2 == null || n2.next == null){
			return null;
		}

		while(n2.next != null){
			n2.data = n2.next.data;
			n2.next = n2.next.next;
		}



//C Edition of Code
#include <iostream>
using namespace std;

typedef struct node{
	int data;
	node *next;
}node;

node *init(int a[], int n){
	node *head, *p;
	for (int i = 0; i < n; i++){
		node *nd = new node();
		nd->data = a[i];
		if(i == 0){
			head = p = nd;
			continue;
		}
		p->next = nd;
		p = nd;
	}
	return head; 
}


bool remove(node *c){
	if(c == NULL || c->next == NULL) return false;
	node *q = c->next;
	c->data = q->data;
	c->next = q->next;
	delete q;
	return true;
}

void print(node *head){
	while(head){
		cout<<head->data<<" ";
		head = head->next;
	}
	count<<endl;
}

int main(){
	int n = 10;
	int a[] = { 9,2,1,3,5,6,2,6,4,1};
	node *head = init(a,n);
	int cc = 3;
	node *c = head;
	for (int i = 1; i<cc ++i) c = c->next;
	print(head);
	if(remove(c))
		print(head);
	else
		count<<"failure"<<endl;
	return 0;
}

:











			
