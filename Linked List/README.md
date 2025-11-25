# Linked List – Topic Wise Descriptions (Striver A2Z DSA Sheet)

## 1. Node Structure
Defines how each node in a linked list is represented.  
Every node contains data and a pointer/reference to the next node.

## 2. Convert Array to Linked List
Creates a linked list by converting each element of an array into a node and linking them one after another.

## 3. Insertions in Linked List

### Insert at Head
Adds a new node at the beginning of the linked list.  
This operation makes the new node the first element.

### Insert at Tail
Appends a new node at the end of the linked list.  
Requires traversal from the head until the last node.

### Insert at Position K
Inserts a new node at a given 1-indexed position.  
Handles inserting at the head, middle, or invalid positions.

## 4. Deletions in Linked List

### Delete Head
Removes the first node of the linked list and updates the head to the next node.

### Delete Last Node
Removes the last node by traversing to the second-last node and breaking the link.

### Delete Node at Position K
Deletes the node at a given position.  
Handles:
- deleting the first node  
- deleting the last node  
- deleting a middle node  
- invalid positions  

## 5. Traversal Operations

### Print Linked List
Traverses the linked list from head to end and displays each node’s value.

### Find Length of Linked List
Counts the total number of nodes using a simple traversal from start to end.

## 6. Search an Element
Searches for a specific value inside the linked list by checking each node one by one.  
Returns whether the element is present or not.
