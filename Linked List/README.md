

# 🔗 **Singly Linked List**

---

## **1. Node Structure**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/implementation.java)**
A singly linked list node stores:

* `data` → value
* `next` → pointer to the next node

---

## **2. Convert Array to Linked List**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/convertingarr.java)**
Converts an array into a linked list by creating nodes and linking them.

---

# **3. Insertions**

---

### ✅ **3.1 Insert at Head**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/insertionathead.java)**
**Description:** Adds a new node to the beginning.

**Steps:**

1. Create a new node
2. `newNode.next = head`
3. `head = newNode`

---

### ✅ **3.2 Insert at Tail**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/insertionattail.java)**
**Description:** Adds a new node at the end.

**Steps:**

1. Traverse to the last node
2. Set `last.next = newNode`

---

### ✅ **3.3 Insert at Any Position (K)**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/insertionatanypos.java)**
**Description:** Supports inserting at head, middle, or tail.

---

### ✅ **3.4 Insert Before a Given Value**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/insertbeforevalue.java)**
**Description:** Inserts a new node before a target value.
If value is at head → new node becomes head.

---

### ✅ **3.5 Insert After a Given Value**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/insertaftervalue.java)**
**Description:** Inserts a node after the first occurrence of the target.

---

# **4. Deletions**

---

### ❌ **4.1 Delete Head**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/deletionhead.java)**
**Description:** Move head to `head.next`.

---

### ❌ **4.2 Delete Last Node**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/deletionLastel.java)**
**Description:** Traverses to the second-last node and removes the last.

---

### ❌ **4.3 Delete Node at Position (K)**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/deletionatposititon.java)**
**Description:** Handles deleting head, middle, tail, and invalid positions.

---

### ❌ **4.4 Delete Node by Value**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/deletionatvalue.java)**
**Description:** Deletes first node matching the given value.

---

# **5. Traversal Operations**

---

### 📌 **5.1 Print Linked List**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/printthewhole.java)**
Prints the entire list.

---

### 📌 **5.2 Length of Linked List**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/lengthofll.java)**
Traverses list and counts nodes.

---

# **6. Search an Element**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/implementation.java)**
Searches the list sequentially.

---

---

# 🔗 **Doubly Linked List**

---

## **1. Node Structure**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/implementation.java)**
A DLL node has:

* `data`
* `next`
* `prev`

Supports forward + backward traversal.

---

# **2. Insertions in Doubly Linked List**

---

### ✅ **2.1 Insert at Head**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/insertionAtHead.java)**
**Description:** Inserts a new node at the beginning.

**Steps:**

1. Create `newNode`
2. `newNode.next = head`
3. If list not empty: `head.prev = newNode`
4. Update head

---

### ✅ **2.2 Insert at Tail**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/insertionAtTail.java)**
**Description:** Adds node at the end.

**Steps:**

1. Create new node
2. Traverse to last
3. Link `last.next = newNode`, `newNode.prev = last`

---

### ✅ **2.3 Insert Before Tail**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/insertionAtTailbefore.java)**
**Description:** Inserts a node just before the last node.

**Steps:**

1. Traverse to second-last
2. Insert between second-last and last
3. Update 4 pointers

---

### ✅ **2.4 Insert at Any Position (K)**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/insertionatanypos.java)**
**Description:** Handles inserting at head, middle, tail, or in a single-node list.

**Steps:**

1. Reach target position
2. Identify `before` and `after` nodes
3. Handle head / tail / middle cases
4. Patch 4 pointers accordingly

---

### ✅ **2.5 Insert Before a Given Node**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/insertionatvalue.java)**
**Description:** Inserts before a node when its reference `curr` is already known.

**Steps:**

1. Create new node
2. `before = curr.prev`
3. If before is null → inserting at head
4. Else connect `before → newNode → curr`

---

# **3. Deletions in Doubly Linked List**

---

### ❌ **3.1 Delete at Head**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/deletionAtHead.java)**
Moves head forward and clears old head.

---

### ❌ **3.2 Delete at Tail**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/deletionAtTail.java)**
Removes the last node by updating its previous node.

---

### ❌ **3.3 Delete at Any Position**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/deletionatanypos.java)**
Deletes head, tail, or middle node based on position.

---

### ❌ **3.4 Delete at Value (Given Node Reference)**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/deletionatvalue.java)**
Deletes a node directly when its reference is provided.

---
