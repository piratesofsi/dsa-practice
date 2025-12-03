

# 🔗 **Singly Linked List**

---

## **1. Node Structure**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/implementation.java)**
A singly linked list node stores:

* `data` → value
* `next` → pointer to the next node

This allows the linked list to grow dynamically without fixed size.

---

## **2. Convert Array to Linked List**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/convertingarr.java)**
Converts an array into a linked list by:

* creating a node for each array element
* connecting all nodes using `next` pointers

---

# **3. Insertions**

---

### ✅ **3.1 Insert at Head**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/insertionathead.java)**
**Description:** Adds a new node to the beginning.

**Steps:**

1. Create a new node.
2. Set `newNode.next = head`.
3. Update `head = newNode`.

**Time Complexity:** O(1)

---

### ✅ **3.2 Insert at Tail**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/insertionattail.java)**
**Description:** Adds a new node at the end.

**Steps:**

1. Traverse to the last node.
2. Set `last.next = newNode`.

**Time Complexity:** O(n)

---

### ✅ **3.3 Insert at Any Position (K)**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/insertionatanypos.java)**
**Description:** Handles all these cases:

* Insert at head (`pos == 1`)
* Insert in middle
* Insert at tail

---

### ✅ **3.4 Insert Before a Given Value**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/insertbeforevalue.java)**
**Description:**
Traverses until the target value is found and inserts a node **before** it.

* If value is at head → new node becomes the new head.

---

### ✅ **3.5 Insert After a Given Value**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/insertaftervalue.java)**
**Description:**
Inserts a new node immediately after the first node containing the given value.

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
Traverses to the second-last node and sets `next = null`.

---

### ❌ **4.3 Delete Node at Position (K)**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/deletionatposititon.java)**
**Description:**
Covers all possibilities:

* deleting head
* deleting middle node
* deleting tail
* invalid positions

---

### ❌ **4.4 Delete Node by Value**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/deletionatvalue.java)**
**Description:**
Deletes the **first node** whose value matches the given key.

---

# **5. Traversal Operations**

---

### 📌 **5.1 Print the Linked List**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/printthewhole.java)**
Prints the entire list from head to tail.

---

### 📌 **5.2 Length of Linked List**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/lengthofll.java)**
Counts total nodes in the list.

---

# **6. Search an Element**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/implementation.java)**
Searches the list sequentially for a value.

---

---

# 🔗 **Doubly Linked List**

---

## **1. Node Structure**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/implementation.java)**
A DLL node has:

* `data`
* `next` pointer
* `prev` pointer

Allows **backward + forward traversal**.

---

# **2. Insertions in Doubly Linked List**

---

### ✅ **2.1 Insert at Head**

📌 **Code:** `insertionAtHead.java`
**Description:** Inserts a new node at the beginning.

**Steps:**

1. Create `newNode`.
2. Set `newNode.next = head`.
3. If list not empty → `head.prev = newNode`.
4. Make `newNode` the new head.

---

### ✅ **2.2 Insert at Tail**

📌 **Code:** `insertionAtTail.java`
**Description:** Inserts a node at the end of the list.

**Steps:**

1. Create `newNode`.
2. Traverse to the last node.
3. Connect `last.next = newNode` and `newNode.prev = last`.

---

### ✅ **2.3 Insert Before Tail**

📌 **Code:** `insertionAtTailbefore.java`
**Description:** Inserts a node just before the last node.

**Steps:**

1. Find the second-last node.
2. Insert the new node between second-last & last.
3. Adjust `prev` and `next` pointers accordingly.

---

### ✅ **2.4 Insert at Any Position (K)**

📌 **Code:** `insertionatanypos.java`
**Description:** Inserts a node at a specific position. Handles head, middle, tail, and single-node cases.

**Steps:**

1. Traverse to the given position.
2. Identify `before = curr.prev` and `after = curr`.
3. If inserting at head → use head insertion logic.
4. Else if at tail → use tail insertion logic.
5. Else insert between them and update all 4 pointers.

---

### ✅ **2.5 Insert Before a Given Node (Given Reference)**

📌 **Code:** `insertionatvalue.java`
**Description:** Inserts a node before the node whose reference is already known.

**Steps:**

1. Create `newNode`.
2. Set `before = curr.prev`.
3. If inserting before head → adjust head.
4. Else link `before → newNode → curr`.

---

# **3. Deletions in Doubly Linked List**

---

### ❌ **3.1 Delete at Head**

📌 **Code:** `deletionAtHead.java`
**Description:**
Moves head one step forward and clears the old head’s link.

---

### ❌ **3.2 Delete at Tail**

📌 **Code:** `deletionAtTail.java`
**Description:**
Traverse to the last node and remove it by connecting its previous node’s `next` to `null`.

---

### ❌ **3.3 Delete at Any Position (K)**

📌 **Code:** `deletionatanypos.java`
**Description:**
Handles deletion of head, tail, middle, and invalid positions by patching neighbors.

---

### ❌ **3.4 Delete at Value (Given Node Reference)**

📌 **Code:** `deletionatvalue.java`
**Description:**
Deletes the given node directly (efficient because traversal isn’t required).

---

