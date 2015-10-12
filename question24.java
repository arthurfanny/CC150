//You have two numbers representated by a linked List, where each node contains a single digit. The digits are stored in reversed order, such that the 1's digit is at head of the list. Write a function that adds the two numbers and returns the sum as a linked list.

class question24{
	public static void arrayAdd(LinkedListNode n1; LinkedListNode n2){
		// if n1 or n2 is null, return null;
		LinkedListNode head1;
		LinkedListNode head2;
		LinkedListNode sum;

		head1 = n1.head;
		head2 = n2.head;
		int jingwei = 0;
	
		if(n1 == null || n2 == null){
			return null;
		}

		// if n1 or n2 is equal in length
		while(n1.next != null  && n2.next !=null){
			sum.data = head1.data + head2.data;
			if(sum.data >=10){									jingwei = 1;
				sum.data = sum.data/10;
			}
                        sum.data = head1.data + head2.data + jingwei;
			sum = sum.next;
			head1 = head1.next;
			head2 = head2.next;
			jingwei = 0;
		}

		
}
			

//C Edition Writing Style
#include <iostream>
using namespace std;

typedef struct node{
	int data;
	node *node;
}node;

node* init(int a[], int n){
	node *head = NULL, *p
	for ( int i = 0;  i<n; i++){
		node *nd = new node();
		nd->data = a[i];
		if(i == 0){
			head = p = ned;
			continue;
		}
		p->next = nd;
		p = nd;
	}
	return head;
}

node *addlink(node *p, node *q){
	if(p == null) reutrn q;
	if(q == null) return p;
	node *res, *pre = null;
	int c = 0;
	while(p &&q){
		int t = p->data + c->data + c;
		node *r = new node();
		r->data = t%10;
		if(pre){
		pre->next = r;
		pre = r;
		}
		else pre = res = r;
		c = t/10;
		p = p->next ; q = q->next;
}


while(p){
	int t = p->data + c;
	node *r = new node();
	r->data = t%10;
	pre->next = r;
	pre = r;
	c = t/10;
	p = p->next;
}

while(q){
	int t = q->data + c;
	node *r = new node();
	r -> data = t%10;
	pre->next = r;
	pre = r;
	c = t/10;
	q = q->next;
}

if(c>0){
	node *r = new node();
	r -> data = c;
	pre ->next = r;
}
return res;
}



	



		
