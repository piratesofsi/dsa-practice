

# Linked List – Topic Wise Descriptions (Striver A2Z DSA Sheet)

## 1. Node Structure

A Linked List is made up of nodes.
Each node contains:

* data: the stored value
* next pointer: reference to the next node

Nodes are connected like a chain, allowing dynamic memory allocation.

---

## 2. Convert Array to Linked List

Converts an array into a Linked List by:

* creating a node for each element
* linking each new node to the previous one

This helps easily build and visualize Linked Lists.

---

## 3. Insertions in Linked List

### Insert at Head

Adds a new node at the beginning of the list.
The new node becomes the first element.
Useful for quick O(1) insertions.

### Insert at Tail

Adds a new node at the end of the list.
Requires traversal to the last node unless a tail pointer is used.

### Insert at Position K

Inserts a node at a specific 1-indexed position.
Handles insertions at the head, middle, or end.
Safely ignores invalid positions.

---

## 4. Deletions in Linked List

### Delete Head

Removes the first node and updates the head to the next node.

### Delete Last Node

Removes the last node by stopping at the second-last node and breaking its link.
Requires traversal.

### Delete Node at Position K

Deletes a node at a given position.
Handles:

* deleting the first node
* deleting a middle node
* deleting the last node
* invalid positions

---

## 5. Traversal Operations

### Print Linked List

Traverses from head to end and prints all node values.
Useful for debugging and verifying operations.

### Find Length of Linked List

Counts the number of nodes in the Linked List using a simple traversal.

---

## 6. Search an Element

Searches for a specific value by checking each node one by one.
Uses linear search (O(n)).
Returns true or false based on whether the value is found.

---

If you want, I can convert your **Medium** and **Hard** Linked List topics into this same clean format too!
