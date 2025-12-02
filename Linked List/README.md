

# 🔗 **Singly Linked List**

---

## **1. Node Structure**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/implementation.java)**
A singly linked list node stores:

* `data` → the value
* `next` → pointer to the next node

This allows the linked list to grow dynamically without fixed size.

---

## **2. Convert Array to Linked List**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/convertingarr.java)**
Creates a linked list by:

* creating a node for each array element
* linking each node to the next

Useful when you want to build a list from given input data.

---

# **3. Insertions**

---

### ✅ **3.1 Insert at Head**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/insertionathead.java)**
**Description:**
Adds a new node at the beginning.
Steps:

1. Create a new node
2. Set `newNode.next = head`
3. Update `head = newNode`

**Time Complexity:** O(1)

---

### ✅ **3.2 Insert at Tail**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/insertionattail.java)**
**Description:**
Adds a node at the end of the list.
Steps:

1. Traverse to last node
2. Set `last.next = newNode`

**Time Complexity:** O(n)

---

### ✅ **3.3 Insert at Any Position (K)**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/insertionatanypos.java)**
**Description:**
Handles all cases:

* Insert at head (`pos == 1`)
* Insert in middle (after `pos-1` node)
* Insert at tail

---

### ✅ **3.4 Insert Before a Given Value**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/insertbeforevalue.java)**
**Description:**
Traverses until it finds the value and inserts **before** it.
If value is at head → new node becomes head.

---

### ✅ **3.5 Insert After a Given Value**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/insertaftervalue.java)**
**Description:**
Inserts a new node after the first node containing the given value.

---

# **4. Deletions**

---

### ❌ **4.1 Delete Head**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/deletionhead.java)**
**Description:**
Moves head to `head.next` and removes the first node.
**Time Complexity:** O(1)

---

### ❌ **4.2 Delete Last Node**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/deletionLastel.java)**
**Description:**
Traverses to second-last node and sets `next = null`.

---

### ❌ **4.3 Delete Node at Position K**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/deletionatposititon.java)**
**Description:**
Covers:

* deleting head
* deleting middle
* deleting tail
* invalid positions

---

### ❌ **4.4 Delete Node by Value**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/deletionatvalue.java)**
**Description:**
Deletes the **first** node whose value matches the given value.

---

# **5. Traversal Operations**

---

### 📌 **5.1 Print the Linked List**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/printthewhole.java)**
Prints each node from head to tail.

---

### 📌 **5.2 Length of Linked List**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/lengthofll.java)**
Counts number of nodes by traversal.

---

# **6. Search an Element**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/implementation.java)**
Searches sequentially for a key.
**Time Complexity:** O(n)

---

---

# 🔗 **Doubly Linked List**

---

## **1. Node Structure**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/implementation.java)**
Each node contains:

* `data`
* `next` pointer
* `prev` pointer

Allows **bidirectional traversal**.

---

# **2. Deletions in Doubly Linked List**

---

### ❌ **2.1 Delete at Head**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/deletionAtHead.java)**
**Description:**
Move head to `head.next`, then set `head.prev = null`.

---

### ❌ **2.2 Delete at Tail**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/deletionAtTail.java)**
**Description:**
Traverse to last node → `prev.next = null`.

---

### ❌ **2.3 Delete at Any Position (K)**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/deletionatanypos.java)**
**Description:**
A complete delete-at-position function that handles:

* deleting head (`pos == 1`)
* deleting tail (`after == null`)
* deleting middle
* invalid positions

Logic involves:

1. Traverse to node at `pos`
2. Isolate `before = curr.prev`, `after = curr.next`
3. Patch both ends
4. Clean the removed node’s pointers

---

### ❌ **2.4 Delete at Value (Given Node Reference)**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/deletionatvalue.java)**
**Description:**
Deletes the node **when the node itself (curr) is given**, not the value.
Covers:

* deleting head
* deleting tail
* deleting middle
* deleting single node

---
