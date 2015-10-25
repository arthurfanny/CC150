//Design an algorithm and write code to find the first common ancestor of two nodes in a binary tree.Avoid storing additional nodes in a data strcutre. Note: this is not necessarily a binary search tree.


//This is with the aux storing space for parent info
Node first_ancestor(Node *n1, Node *n2){
	map<Node*, bool> storing;
	while(n1->parent){
		storing[n1->parent] = true;
		n1 = n1->parent;
	}

	while(n2->parent){
		if(storing[n2->parent]){
			return n2->parent;
		}

		stroing[n2->parent] = true;
	}
}



Node first_ancestor(Node *n1, Node *n2){
	if(n1 == NULL) return false;
	else if (n1==n2) return true;
	else return father(n1->lchild,n2) || father(n1->rchild,n2);
}

Node* father(Node *n1, Node *n2){
	if(n1 == NULL || n2 == NULL) return NULL;
	while(n1){
		if(first_ancestor(n1,n2)) return n1;
		n1 = n1->parent;
	}
	return NULL:
}

//What if there is no pointer to the ancestor pointer?
void first_ancestor2(Node *n1, Node *n2, Node* &ans){
	if(n1 == NULL || n2 == NULL) return NULL:
	n1 = n1->head;
	n2 = n2->head;
	while(n1){
		if(head && father(head, n1)) && father(head, n2)){
		ans = head;
		first_ancestor2(head->lchild, n1, n2, ans);
		first_ancestor2(head->rchild, n1, n2, ans);
}
}









