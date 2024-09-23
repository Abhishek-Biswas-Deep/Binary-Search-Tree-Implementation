<img src="https://github.com/user-attachments/assets/2ad86f70-12b4-4500-997d-9f8c1874a9b5" alt="Dal logo" width="80"/>
<h1>Associated with Dalhousie University</h1>

### CSCI2110

### Binary Search Tree Implementation
This repository contains a Java implementation of a Binary Search Tree (BST) along with a generic Binary Tree class and a demo program. The implementation provides various operations such as insertion, deletion, searching, and traversal of the BST.

#### Files in this Repository

1. BinarySearchTree.java: Implementation of the Binary Search Tree
2. BinaryTree.java: Implementation of a generic Binary Tree
3. Exercise1.java: Demo program to showcase the BST functionality

#### Features
##### BinarySearchTree.java

- Generic implementation of BST
- Insertion of elements
- Deletion of elements
- Searching for elements (iterative and recursive)
- Finding maximum and minimum elements
- Size and empty checks

##### BinaryTree.java

- Generic implementation of Binary Tree
- Attachment and detachment of left and right subtrees
- Tree traversals (preorder, inorder, postorder)
- Root finding

##### Exercise1.java

- Demo program to create a BST of integers
- User input for inserting elements
- Finding and displaying maximum and minimum values
- Searching for a user-specified key

#### How to Use

1. Compile all Java files.
2. Run the demo program.
3. Follow the prompts:

#### Notes
- The BST implementation uses a generic type T that extends Comparable<T>, ensuring that elements can be compared and ordered.
- The demo program (Exercise1.java) is set up to work with integers, but the BST implementation can work with any comparable type.
- The recursive search method is implemented in addition to the iterative search method.

#### Sample input and output
```
Enter int or '0': 1
Enter int or '0': 2
Enter int or '0': 3
Enter int or '0': 4
Enter int or '0': 5
Enter int or '0': 6
Enter int or '0': 7
Enter int or '0': 8
Enter int or '0': 9
Enter int or '0': 0
The max data value in the BST is: 9
The min data value in the BST is: 1
What key would you like to search for? 3
Found!

Process finished with exit code 0

Enter int or '0': 1
Enter int or '0': 2
Enter int or '0': 3
Enter int or '0': 0
The max data value in the BST is: 3
The min data value in the BST is: 1
What key would you like to search for? 4
Sorry not found.

Process finished with exit code 0

Enter int or '0': 1
Enter int or '0': 2
Enter int or '0': 3
Enter int or '0': 4
Enter int or '0': 0
The max data value in the BST is: 4
The min data value in the BST is: 1
What key would you like to search for? 4
Found!

Process finished with exit code 0
```
