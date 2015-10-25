//write an algorithm to find the 'next' node(i.e in-order sucessor) of a given ode in binary search tree where each node has a link to its parent.


#include <iostream>
#include <cstring>

using namespace std;

const int maxn = 100;
struct node{
	int key;
	node *lchild,*rchild,*parent;
}

Node *p, node[maxn];
int cnt;

void init(){
	p = NULL;
	menset(node,'\0',sizeof(node));
	cnt = 0;
}

void create_minimal_tree(Node* &head, Node *parent, int a[], int start, int end){
	if(start <= end){
		int mid = (start + end) >> 1;
		node[cnt].key = a[mid];
		node[cnt].parent = parent;
		head = &node[cnt++];
		create_minial_tree(head->lchild, head, a, start, mid - 1);
		create_minial_tree(head->rchild, head, a, mid+1, end);
	}
}

node* minial(Node *no){
	if(no == NULL) return;
	while(no->lchild){
		no = no->lchild}
	return no;
}

node* successor(Node* no){
	if(no == NULL) return NULL;
	if(no->rchild) return minial(no->rchild);
	Node *y = no->parent;
	while(y && y->rchild == no){
		no = y;
		y = y->parent;
	}
	return y;
}


int main(){
	int a[] = {0,1,2,3,4,5,6,7,8,9};
	init();
	Node *head = NULL:
	create_minimal_tree(head, NULL, a, 0, 9);
	cout<<"the head is "<<head->key<<endl;
	cout << " the successor of head is:" <<(successor(head)->key << endl;
	return 0;
}



:







