//Binary Search Tree Algortihm

//Public way of expressing the binary search

struct node{
	int val;
	node *lchild,*rchild,*parent；
	Node(int v = 0, Node *l = NULL, Node *r = NULL) : val(v), left(l), right(r) {} }

void preorder(Node *root){
	if(root == NULL) return;
	printf("%d", root->val);
	preorder(root->left);
	preorder(root->right);
}

void inorder(Node *root){
	if(root == NULL) return;
	inorder(root->right);
	printf("%d",root->val);
	inorder(root->left);
}


void postorder(Node *node){
	if(root == NULL) return;
	postorder(root->left);
	postorder(root->right);
	printf("d%",root->val);
}


//using stack to simulate the preorder of BST
void preorder(Node *root){
	if(root == NULL) return;
	stack<*Node> stk;
	while(!stk.empty()){
		Node *p = stk.top();
		stk.pop();
		printf(%d",p->val);
		if(p->right) stk.push(p->right);
		if(p->left) stk.push(p-left);
	}
}

#include <iostream>
#include <cstdlib>
using namespace std;

class BinarySearchTree{
	private:
		struct tree_node{
			tree_node* left;
			tree_node* right;
			int data;
		};
		tree_node* root;

	public:	
		BinarysearchTree(){
			root = NULL;
		}

		bool isEmpty() const { return root == NULL; }
		void print_inorder();
		void inorder(tree_node*);
		void print_preorder();
		void preorder(tree_node*);
		void print_postorder();
		void postorder(tree_node*);
		void insert(int);
		void remove(int);

};

void BinarySearchTree::insert(int d){
	tree_node* t = new tree_node;
	tree_node* parent;
	t->data = d;
	t->left = NULL;
	t->right = NULL;
	parent = NULL;

	//check if it is a new tree

	if(isEmpty()) root = t;
	else{

		//All the following insertions are as leaf nodes
		tree_node* curr;
		curr = root;
		//Find the Node's parent
		while(curr){
			parent = curr;
			if(t->data > curr->data) curr = curr->right;
			else curr = curr->left;
		}

		if(t->data < parent->data){
			parent->left = t;
		}
		else 
			parent->right = t;
	}
}

void BinarySearchTree::remove(int d){
	bool found = false;
	if(isEmpty()){
		cout << "The tree is empty" << endl;
		return;
	}

	tree_node* curr;
	tree_node * parent;
	curr = root;

	while(curr != NULL){
		if(curr->data ==d){
			found = true;
			break;
		}

		else{
			parent = curr;
			if(d > curr->data) {curr = curr->right;}
			else curr = curr->left;
		}

	}
	
	if(!found){
		cout<<"Data not found! " << endl;
		reutrn;
	}

void BinarySearchTree:print_inorder(){
	inorder(root);
}

void BinarysearchTree:preorder(tree_node *p){
	if(p != NULL){
		cout << " " << p->data << " ";
		if(p->left) preorder(p->left);
		if(p->right) preorder(p->right);
	}
	else
		return;
}


  



