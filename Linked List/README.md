

# 🔗 Linked List – Complete Readme

# 🔵 Singly Linked List

---

## **1. Node Structure**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/implementation.java)**
A singly linked list node stores:

* `data` → value
* `next` → pointer to the next node

---

## **2. Convert Array to Linked List**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/convertingarr.java)**
Creates a linked list by creating nodes for each array element and linking them.

---

# **3. Insertions**

---

### ✅ **3.1 Insert at Head**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/insertionathead.java)**
**Description:** Inserts a new node at the beginning of the list.

**Steps:**

1. Create a new node.
2. Point `newNode.next` to current head.
3. Update `head = newNode`.

---

### ✅ **3.2 Insert at Tail**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/insertionattail.java)**
**Description:** Adds a node at the end.

**Steps:**

1. Traverse to the last node.
2. Set `last.next = newNode`.

---

### ✅ **3.3 Insert at Any Position (K)**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/insertionatanypos.java)**
**Description:** Supports insertion at head, middle, or tail.

**Steps:**

1. If `pos == 1`, use head insertion.
2. Traverse to the node before the target position.
3. Create a new node.
4. Link `newNode.next` to the next node.
5. Update current node’s `next` to `newNode`.

---

### ✅ **3.4 Insert Before a Given Value**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/insertbeforevalue.java)**
**Description:** Inserts a new node before the first occurrence of the target value.

**Steps:**

1. If head contains value → insert at head.
2. Traverse while checking `curr.next.val` for match.
3. Create a new node.
4. Insert between `curr` and `curr.next`.

---

### ✅ **3.5 Insert After a Given Value**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/insertaftervalue.java)**
**Description:** Inserts a node after the first occurrence of the target.

**Steps:**

1. Traverse until `curr.val == value`.
2. Create a new node.
3. Link `newNode.next = curr.next`.
4. Update `curr.next = newNode`.

---

# **4. Deletions**

---

### ❌ **4.1 Delete Head**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/deletionhead.java)**
**Description:** Removes the first node.

**Steps:**

1. Move head to `head.next`.

---

### ❌ **4.2 Delete Last Node**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/deletionLastel.java)**
**Description:** Removes the last node.

**Steps:**

1. Traverse to second-last node.
2. Set `secondLast.next = null`.

---

### ❌ **4.3 Delete Node at Position (K)**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/deletionatposititon.java)**
**Description:** Deletes node at given position.

**Steps:**

1. If `pos == 1`, delete head.
2. Traverse to node before target.
3. Bypass target node.

---

### ❌ **4.4 Delete Node by Value**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/deletionatvalue.java)**
**Description:** Deletes first node matching the target value.

**Steps:**

1. If head matches → delete head.
2. Traverse until `curr.next.val == value`.
3. Bypass `curr.next`.

---

# **5. Traversal Operations**

---

### 📌 **5.1 Print Linked List**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/printthewhole.java)**
Prints all nodes from head to tail.

---

### 📌 **5.2 Length of Linked List**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/lengthofll.java)**
Counts nodes by traversing.

---

# **6. Search an Element**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Linkedlist%20easy/implementation.java)**
Searches sequentially for a value.

---

# 🔵 Doubly Linked List

---

## **1. Node Structure**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/implementation.java)**
DLL node contains `data`, `next`, and `prev` pointers.

---

## **2. Insertions in Doubly Linked List**

---

### ✅ **2.1 Insert at Head**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/insertionAtHead.java)**
**Description:** Inserts a new node at the beginning.

**Steps:**

1. Create `newNode`.
2. Set `newNode.next = head`.
3. If head exists, set `head.prev = newNode`.
4. Update `head = newNode`.

---

### ✅ **2.2 Insert at Tail**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/insertionAtTail.java)**
**Description:** Adds node at the end.

**Steps:**

1. Create new node.
2. Traverse to last node.
3. Link `last.next = newNode` and `newNode.prev = last`.

---

### ✅ **2.3 Insert Before Tail**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/insertionAtTailbefore.java)**
**Description:** Inserts a node before the last node.

**Steps:**

1. Traverse to second-last node.
2. Insert between second-last and last.
3. Update all pointers.

---

### ✅ **2.4 Insert at Any Position (K)**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/insertionatanypos.java)**
**Description:** Handles inserting at head, middle, tail.

**Steps:**

1. Reach target position.
2. Identify `before` and `after`.
3. If head/tail case → handle separately.
4. Else patch pointers normally.

---

### ✅ **2.5 Insert Before a Given Node**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/insertionatvalue.java)**
**Description:** Inserts before a node when its reference `curr` is already known.

**Steps:**

1. Create `newNode` with the value to insert.
2. Let `before = curr.prev`.
3. If `before == null` → inserting at head: set `newNode.next = curr`, `curr.prev = newNode`, and update `head = newNode`.
4. Else link `before.next = newNode`, `newNode.prev = before`, `newNode.next = curr`, and `curr.prev = newNode`.

---

## **3. Deletions in Doubly Linked List**

---

### ❌ **3.1 Delete at Head**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/deletionAtHead.java)**
**Description:** Removes the first node by moving head to `head.next` and clearing the new head's `prev`.

**Steps:**

1. If `head == null` return.
2. Move `head = head.next`.
3. If `head != null` set `head.prev = null`.

---

### ❌ **3.2 Delete at Tail**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/deletionAtTail.java)**
**Description:** Removes the last node and updates the previous node's `next` to `null`.

**Steps:**

1. If `head == null` return.
2. Traverse to last node `temp`.
3. If `temp.prev == null` (single node) set `head = null`.
4. Else set `temp.prev.next = null`.

---

### ❌ **3.3 Delete at Any Position**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/deletionatanypos.java)**
**Description:** Deletes a node at a given position (handles head, middle, tail, invalid positions).

**Steps:**

1. If `pos == 1` delete head.
2. Traverse to the node at `pos`.
3. Let `before = curr.prev` and `after = curr.next`.
4. If `before != null` set `before.next = after`.
5. If `after != null` set `after.prev = before`.
6. Clear `curr.prev` and `curr.next` if needed.

---

### ❌ **3.4 Delete at Value (Given Node Reference)**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/deletionatvalue.java)**
**Description:** Deletes the given node directly (efficient since no traversal is required if you already have the reference).

**Steps:**

1. If `curr == null` return.
2. If `curr.prev != null` set `curr.prev.next = curr.next` else `head = curr.next`.
3. If `curr.next != null` set `curr.next.prev = curr.prev`.
4. Clear `curr.prev` and `curr.next`.

---

## **4. Reverse a Doubly Linked List (Brute – Using Data Array)**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/reversingDLL.java)**
**Description:** Reverses the DLL by **storing data in an array/list** and then writing it back in reverse order. Links (`next`, `prev`) remain the same; only node values are swapped.

**Steps:**

1. Traverse the DLL and push all `node.data` into an array/list.
2. Reset a pointer `curr` to `head`.
3. Traverse again from `head`, and for each node assign data from the array in reverse order.
4. Stop when you reach the end → list appears reversed by data.

---

## **5. Reverse a Doubly Linked List (Optimal – In-Place Pointer Swap)**

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/Doubly%20LInkedList/reversingDLLoptimal.java)**
**Description:** Reverses the DLL **in-place** by swapping `next` and `prev` pointers of every node and then fixing the head. No extra array is used.

**Steps:**

1. Take a pointer `curr = head`.
2. For each node:

   * Temporarily store `curr.prev`.
   * Swap `curr.prev` and `curr.next`.
   * Move `curr` to the “new next” (which is old `prev`).
3. While traversing, keep track of the last processed node – that becomes the new `head`.
4. After the loop, update `head` to that last node (the original tail).

---

