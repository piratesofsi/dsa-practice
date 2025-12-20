# 🔴 Hard Problems of Linked List

---

## 📊 Hard Problems of Linked List – Overview Table

| # | Problem Name                                     | Approaches | Difficulty | Jump To |
| - | ------------------------------------------------ | ---------- | ---------- | ------- |
| 1 | Reverse Linked List in Group of Size K           | 1          | ⭐ Hard     | [Go](#1-reverse-linked-list-in-group-of-size-k) |
| 2 | Rotate a Linked List                             | 1          | ⭐ Hard     | [Go](#2-rotate-a-linked-list) |
| 3 | Clone a Linked List with Random and Next Pointer | 2          | ⭐ Hard     | [Go](#3-clone-a-linked-list-with-random-and-next-pointer) |
| 4 | Flattening of Linked List                        | —          | ⭐ Hard     | [Go](#flattening-of-linked-list) |

---

## 1. Reverse Linked List in Group of Size K

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/hard%20problems%20on%20LL/ReverseLinkedListInKGroup_Custom.java)**

**Description:**  
Reverse nodes of a linked list in groups of size `k`.  
If the remaining nodes are less than `k`, they are left unchanged.

**Approach Used:**

- Find the `k`th node
- Detach the group
- Reverse the group
- Reconnect with previous and next parts

**Key Concepts:**

- Pointer manipulation
- Group-wise reversal
- Careful reconnection

**Difficulty:** ⭐ Hard

---

## 2. Rotate a Linked List

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/hard%20problems%20on%20LL/RotateLL.java)**

**Description:**  
Rotate the linked list to the right by `k` places.

**Approach Used:**

- Find length of the list
- Optimize `k` using modulo
- Convert list into circular
- Break at the correct position

**Key Concepts:**

- Circular linked list
- Length calculation
- Pointer breaking

**Difficulty:** ⭐ Hard

---

## 3. Clone a Linked List with Random and Next Pointer

### 🔹 Approach 1: Brute Force (Using HashMap)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/hard%20problems%20on%20LL/CloneaLinkedListwithrandomandnextpointerbrute.java)**

**Description:**  
Creates a deep copy using extra space.

**Steps:**

1. Create a copy of each node and store mapping in a HashMap
2. Assign `next` pointers using the map
3. Assign `random` pointers using the map

**Complexity:**

- Time: `O(n)`
- Space: `O(n)`

---

### 🔹 Approach 2: Optimal (O(1) Extra Space)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/hard%20problems%20on%20LL/CloneaLinkedListwithrandomandnextpointeroptimal.java)**

**Description:**  
Clones the list without using extra space.

**Steps:**

1. Insert copy nodes between original nodes
2. Assign random pointers using `original.random.next`
3. Detach the copied list from the original

**Complexity:**

- Time: `O(n)`
- Space: `O(1)`

**Key Concepts:**

- In-place modification
- Node interleaving
- Deep copy without HashMap

**Difficulty:** ⭐ Hard

---

## Flattening of Linked List

⏳ *Not implemented yet.*

---


