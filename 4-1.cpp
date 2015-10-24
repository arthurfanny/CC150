//Implement a function to check if a tree is balanced. For the purposes of this question, a balanced tree is defined to be a tree that no two leaf nodes differ in distance from the root by more than one

//Using middle traversal to traverse the whole tree the check the difference of the longest tree path and the shortest tree path that whether it is below one using recursion.

/*

int d = 0, num = 0, dep[maxn];
void getDepth(Node *head)}{
	if(head == null) return 1;
	++d;
	getDepth(head->lchild);
	if(head->lchild == null&&head ->rchild == null){
		dep[num++] = d;
	getDepth(head->rchild);
	--d;
} 

*/

#include<iostream>
#include<cstring>
#include<cmath>

using namespace std;

const int maxn = 100;
struct Node{
	int key;
	node *lchild, *rchild, *parent;
};

Node *head, *p, node[maxn];

int cnt;

void init(){
	head = p = NULL;
	memset(node, '\0', sizeof(node));
	cnt = 0;
}

void insert(Node* &head, int x){
	if(head == NULL){
		node[cnt].key = x;
		node[cnt].parent = p;
		head = &node[cnt++];
		return;
	}
	p = head;
	if(x < head->key){
		insert(head->lchild,x);
	else
		insert(head->rchild,x);
}

int d = 0; num = 0; dep[maxn];

void getDepth(Node *head){

	if(head == NULL) return;
	++d;
	getDepth(head->lchild);
	if(head->lchild == NULL && head->rchild == NULL)
		dep[num++] = d;
	getDepth(head->rchild);
	--d;

}

bool isBalance(Node *head){
	if(head ==NULL) return true;
	getDepth(head);
	int max=dep[0], min = dep[0];
	for(int i = 0; i<num; i++){
		if(dep[i]>max) max = dep[i];
		if(dep[i]<min) min = dep[i];
	}
	if(max-min>1) return false;
	else return true;
}

int main(){
	init();
	int a[] = { 5,3,8,1,4,7,10,2,6,9,11,12};
	for(int i = 0; i<12; i++){
		insert(head, a[i]);
	}
	cout << isBalance(head) << endl;
	return 0;
}





