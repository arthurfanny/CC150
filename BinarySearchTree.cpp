//Binary Search Tree Algortihm

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


  



