#include<stdio.h>
#include<stdlib.h>

struct node
{
	struct node *left;
	struct node *right;
	int data;
};
struct node *root;

struct node* newNode(int value)
{
	struct node *newnode = malloc(sizeof(struct node));
	newnode->data = value;
	newnode->left=NULL;
	newnode->right=NULL;
	return newnode;
}

struct node* insert(struct node* root,int value) 
{
  if(root == NULL){
  	return newNode(value);
  }
  else if(value == root->data)
{
  	printf("Same data can't be stored");
  }
  else if(value>root->data)
{
  	root->right = insert(root->right,value);
  }
  else if(value<root->data)
{
  	root->left = insert(root->left,value);
  }
  return root;
}



void preorderTraversal(struct node* root)
 {
  if (root == NULL) return;
  printf("%d ->", root->data);
  preorderTraversal(root->left);
  preorderTraversal(root->right);
}


struct node* search(struct node* root, int key)
 { 
  if (root == NULL) 
    printf("\nNot FOUND!\n"); 
  else if (root->data == key)
    printf("\nFOUND!\n");
  else
 {
  	if (root->data < key) 
    return search(root->right, key); 
  return search(root->left, key);
  } 
}

struct node* minValueNode(struct node* node)
{
    struct node* current = node;
 

    while (current && current->left != NULL)
        current = current->left;
 
    return current;
}

struct node* deleteNode(struct node* root, int key)
{
    if (root == NULL)
        return root;
 
    if (key < root->data)
        root->left = deleteNode(root->left, key);
    else if (key > root->data)
        root->right = deleteNode(root->right, key);
    else {
      
        if (root->left == NULL) {
            struct node* temp = root->right;
            free(root);
            return temp;
        }
        else if (root->right == NULL)
 {
            struct node* temp = root->left;
            free(root);
            return temp;
        }
       
        struct node* temp = minValueNode(root->right);
 
      
        root->data = temp->data;
 
      
        root->right = deleteNode(root->right, temp->data);
    }
    return root;
}

void main()
{
	int opt;
	int value,searchv,key;
	do{
		printf("\n1)Create Root Node \n2)Insert Node\n3)Search\n");
		printf("4)preorderTraversal \n5)Delete \n6)Quiet \n");
		printf("Choose Option :: ");
		scanf("%d",&opt);
		switch(opt)
           {
			case 1:
				printf("\nEnter a number : ");
				scanf("%d",&value);
				root = newNode(value);
				break;
			case 2:
				printf("\nEnter a number : ");
				scanf("%d",&value);
				root = insert(root,value);
				break;
			case 3:
				printf("\nEnter a number : ");
				scanf("%d",&searchv);
				search(root,searchv);
				break;
			case 4:
				printf("\n..................................\n");
				preorderTraversal(root);
				printf("\n..................................\n");
				break;

			case 5:
				printf("\nEnter a number to be deleted : ");
				scanf("%d",&key);
				deleteNode(root,key);
				break;
			defualt:
				printf("Invalid option!");
		}
	}while(opt!=6);
}

