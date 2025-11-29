

# 🔗 Linked List – Topic Wise Descriptions (Striver A2Z DSA Sheet)

## 1. Node Structure

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/implementation.java)**
A Linked List is made up of nodes.
Each node contains:

* **data** → the stored value
* **next pointer** → reference to the next node

Allows dynamic memory allocation and flexible structure.

---

## 2. Convert Array to Linked List

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/convertingarr.java)**
Creates a Linked List from an array by:

* creating a node for each element
* linking nodes one after another

---

# 3. Insertions in Linked List

## ✅ 3.1 Insert at Head

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/insertionathead.java)**
Adds a new node at the beginning of the list.
Time Complexity → **O(1)**.

---

## ✅ 3.2 Insert at Tail

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/insertionattail.java)**
Adds a node at the end of the list.
Time Complexity → **O(n)** (requires traversal to last node).

---

## ✅ 3.3 Insert at Any Position (Position K)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/insertionatanypos.java)**
Handles:

* inserting at head (pos = 1)
* inserting in the middle
* inserting at the tail

Traverses to the (K−1)th node and inserts after it.

---

## ✅ 3.4 Insert Before a Given Value

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/insertbeforevalue.java)**
Inserts a node **before the first occurrence** of the given value.

Steps:

* If head contains the value → new node becomes head
* Otherwise, find the node **whose next node** contains the value
* Insert between `current` and `current.next`

---

## ✅ 3.5 Insert After a Given Value

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/insertaftervalue.java)**
Inserts a node **after the first occurrence** of the given value.

Steps:

* Traverse list
* When `current.val == value`
* Insert the new node after `current`

---

# 4. Deletions in Linked List

## ❌ 4.1 Delete Head

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/deletionhead.java)**
Removes the first node and moves head to head.next.

---

## ❌ 4.2 Delete Last Node

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/deletionLastel.java)**
Traverses to the second-last node and removes the last node.

---

## ❌ 4.3 Delete Node at Position K

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/deletionatposititon.java)**
Handles:

* deleting head
* deleting middle nodes
* deleting last node
* invalid positions safely

---

## ❌ 4.4 Delete Node by Value

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/deletionatvalue.java)**
Deletes the **first node** that matches the given value.

Steps:

* If head has the value → move head
* Else find the previous node before the match
* Link previous → next
* Node is removed

---

# 5. Traversal Operations

## 📌 5.1 Print Linked List

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/printthewhole.java)**
Traverses the list and prints all node values.

---

## 📌 5.2 Length of Linked List

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/lengthofll.java)**
Counts the total number of nodes.
Time Complexity → **O(n)**.

---

# 6. Search an Element

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/implementation.java)**
Searches sequentially for a value.
Time Complexity → **O(n)**.

---


# 🔗 Doubly Linked List – Topic Wise Descriptions (Striver A2Z DSA Sheet)

## 1. Node Structure

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20Linked%20List/implementation.java)**
A Doubly Linked List node contains:

* **data** → the stored value
* **next pointer** → points to the next node
* **prev pointer** → points to the previous node

This structure allows **two-way traversal**.

---

# 2. Deletions in Doubly Linked List

## ❌ 2.1 Delete at Head

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20Linked%20List/deletionAtHead.java)**
Removes the first node of the list.

Steps:

* Move head to `head.next`
* Set `head.prev = null`
* Old head gets removed

Time Complexity → **O(1)**

---

## ❌ 2.2 Delete at Tail

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20Linked%20List/deletionAtTail.java)**
Removes the last node of the list.

Steps:

* Traverse to the last node
* Update previous node’s `next` to `null`
* Remove the last node

Time Complexity → **O(n)**

---




