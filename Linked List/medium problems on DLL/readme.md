

# 🔗 Doubly Linked List – Medium Problems (with Multiple Approaches)



---

## 🔵 1. Delete All Occurrences of a Given Value in DLL

📌 **Problem Statement**
Given a doubly linked list and an integer `x`, delete **all nodes** whose value is equal to `x`.

📌 **File:**
`deleteAllOccurOfXinDLL.java`

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems%20on%20DLL/deleteAllOccurOfXinDLL.java)**

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

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems%20on%20DLL/PairSumDLL_BruteForce.java)**

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

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems%20on%20DLL/PairSumDLL_TwoPointers.java)**

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

#### 📌 Key Pattern

> Sorted DLL + Pair Sum → Two Pointer Technique

---


