

---

# 🔗 Doubly Linked List – Medium Problems (with Multiple Approaches)

| # | Problem Name                            | Approaches | Difficulty | Jump To                                                  |
| - | --------------------------------------- | ---------- | ---------- | -------------------------------------------------------- |
| 1 | Delete All Occurrences of X in DLL      | 1          | ⭐ Medium   | [Go](#-1-delete-all-occurrences-of-a-given-value-in-dll) |
| 2 | Find Pairs with Given Sum in Sorted DLL | 2          | ⭐ Medium   | [Go](#-2-find-pairs-with-given-sum-in-sorted-dll)        |
| 3 | Remove Duplicates from Sorted DLL       | 2          | ⭐ Medium   | [Go](#-3-remove-duplicates-from-sorted-dll)              |

---

## 🔵 1. Delete All Occurrences of a Given Value in DLL

📌 **Problem Statement**
Given a doubly linked list and an integer `x`, delete **all nodes** whose value is equal to `x`.

📌 **File:**
`deleteAllOccurOfXinDLL.java`

📌 **Code:**
[https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems%20on%20DLL/deleteAllOccurOfXinDLL.java](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems%20on%20DLL/deleteAllOccurOfXinDLL.java)

---

### 💡 Approach: Single Traversal (Optimal)

* Traverse the DLL once
* For every node with value `x`:

  * Fix `prev.next`
  * Fix `next.prev`
* Handle deletion of the head separately

**Time Complexity:** `O(n)`
**Space Complexity:** `O(1)`

---

## 🔵 2. Find Pairs with Given Sum in Sorted DLL

📌 **Problem Statement**
Given a **sorted doubly linked list**, find all pairs whose sum is equal to a given value `k`.

---

### 🔹 Approach 1: Brute Force

📌 **File:**
`PairSumDLL_BruteForce.java`

📌 **Code:**
[https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems%20on%20DLL/PairSumDLL_BruteForce.java](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems%20on%20DLL/PairSumDLL_BruteForce.java)

#### 💡 Idea

* Fix one pointer (`temp1`)
* Traverse remaining list using another pointer (`temp2`)
* Check sum for every possible pair
* Since list is sorted, stop early when sum exceeds `k`

**Time Complexity:** `O(n²)`
**Space Complexity:** `O(1)` (excluding output)

#### 📌 When to use

* For understanding the problem
* When constraints are small

---

### 🔹 Approach 2: Two Pointers (Optimal)

📌 **File:**
`PairSumDLL_TwoPointers.java`

📌 **Code:**
[https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems%20on%20DLL/PairSumDLL_TwoPointers.java](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems%20on%20DLL/PairSumDLL_TwoPointers.java)

#### 💡 Idea

* Use DLL’s `prev` pointer advantage
* `left` starts from head
* `right` starts from tail
* Move pointers based on sum comparison

#### 🔁 Loop Condition

```java
while (left != right && right.next != left)
```

**Time Complexity:** `O(n)`
**Space Complexity:** `O(1)`

---

## 🔵 3. Remove Duplicates from Sorted DLL

📌 **Problem Statement**
Given a **sorted doubly linked list**, remove all duplicate nodes such that each element appears only once.
The relative order of elements must be maintained.

---

### 🔹 Approach 1: Using Extra Space

📌 **File:**
`remove_duplicates_dll_hashset.java`

📌 **Code:**
[https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems%20on%20DLL/remove_duplicates_dll_hashset.java](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems%20on%20DLL/remove_duplicates_dll_hashset.java)

#### 💡 Idea

* Traverse the linked list
* Store visited values in a HashSet
* If a duplicate value is found:

  * Remove the node by reconnecting its `prev` and `next` nodes

**Key Concepts:**

* HashSet for duplicate detection
* Extra space usage
* DLL pointer adjustment

**Time Complexity:** `O(n)`
**Space Complexity:** `O(n)`

**Difficulty:** ⭐ Easy

---

### 🔹 Approach 2: In-Place Pointer Manipulation (Optimized)

📌 **File:**
`removeDuplicatesinDLLoptimal.java`

📌 **Code:**
[https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems%20on%20DLL/removeDuplicatesinDLLoptimal.java](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems%20on%20DLL/removeDuplicatesinDLLoptimal.java)

#### 💡 Idea

* Traverse the doubly linked list using a single pointer
* If the current node and next node have the same value:

  * Skip the duplicate node by adjusting `next` and `prev` pointers
* Continue until the end of the list

**Key Concepts:**

* Doubly linked list traversal
* Pointer manipulation (`next` and `prev`)
* In-place modification

**Time Complexity:** `O(n)`
**Space Complexity:** `O(1)`

**Difficulty:** ⭐ Medium

---


* Refactor this for **Hard DLL problems**
* Do the same cleanup for **Singly Linked List**
* Add **revision checkboxes / status column**

Just tell me 👊
