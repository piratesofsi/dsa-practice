

# 📘 Linked List – Medium Problems

---
| #  | Problem Name                     | Approaches | Difficulty | Jump To                                                      |
| -- | -------------------------------- | ---------- | ---------- | ------------------------------------------------------------ |
| 1  | Middle of Linked List            | 2          | ⭐ Medium   | [Go](#-1-find-the-middle-of-a-linked-list)                   |
| 2  | Detect Cycle (Check Loop)        | 2          | ⭐ Medium   | [Go](#-2-detect-cycle-in-linked-list-only-check-loop-exists) |
| 3  | Starting Node of Cycle           | 2          | ⭐ Medium   | [Go](#-3-find-starting-node-of-cycle)                        |
| 4  | Sort Linked List                 | 2          | ⭐ Medium   | [Go](#-4-sort-a-linked-list)                                 |
| 5  | Segregate Odd-Even Nodes         | 2          | ⭐ Medium   | [Go](#-5-segregate-odd-and-even-nodes-in-linked-list)        |
| 6  | Palindrome Linked List           | 3          | ⭐ Medium   | [Go](#-6-palindrome-linked-list)                             |
| 7  | Intersection of Two Linked Lists | 3          | ⭐ Medium   | [Go](#-7-intersection-of-two-linked-lists)                   |
| 8  | Delete Middle Node               | 2          | ⭐ Medium   | [Go](#-8-delete-the-middle-node-of-a-linked-list)            |
| 9  | Length of Loop in Linked List    | 2          | ⭐ Medium   | [Go](#-9-length-of-loop-in-a-linked-list)                    |
| 10 | Remove Nth Node From End         | 2          | ⭐ Medium   | [Go](#-10-remove-nth-node-from-end-of-linked-list)           |


---

# 🔥 1. Find the Middle of a Linked List

Given the head of a linked list, return the **middle node**.
If there are two middle nodes, return the **second middle**.

---

### ✔ Approach 1: Length + Second Traversal

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/middleofLL.java)**

**Logic**

1. Traverse LL & count total nodes
2. Middle index = `n/2`
3. Traverse again to that node
4. Return middle

---

### ✔ Approach 2: Fast & Slow Pointer (Optimal)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/middleofLLfastandslow.java)**

**Logic**

1. `slow` → 1 step, `fast` → 2 steps
2. When fast reaches end → slow at middle

---

---

# 🔥 2. Detect Cycle in Linked List (Only Check Loop Exists)

Return **true** if loop exists, else **false**.

---

### ✔ Approach 1: HashSet (Brute)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/DetectCycleHashSet.java)**

**Logic**

1. Store visited nodes in set
2. If node repeats → cycle exists
3. If end reached → no cycle

---

### ✔ Approach 2: Floyd’s Cycle Detection (Optimal)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/DetectCycleOptimal.java)**

**Logic**

1. `slow` = 1 step, `fast` = 2 steps
2. If they meet → cycle exists
3. If fast ends → no cycle

---

---

# 🔥 3. Find Starting Node of Cycle

Return the node where loop begins.

---

### ✔ Approach 1: HashSet (Brute)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/startingofloopbrute.java)**

**Logic**

1. Use set to track visited
2. First repeated node = start of loop

---

### ✔ Approach 2: Floyd's Algorithm (Optimal)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/startingofloopfloyd.java)**

**Logic**

1. Detect cycle using fast/slow
2. Move slow → head
3. Move both 1 step until meet
4. Meet point = loop start

---

---

# 🔥 4. Sort a Linked List

Sort the LL in ascending order.

---

### ✔ Approach 1: Brute (ArrayList + Sort)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/sortLLbrute.java)**

**Logic**

1. Push all values in list
2. Sort it
3. Rewrite nodes

---

### ✔ Approach 2: Merge Sort on LL (Optimal)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/sortLLoptimal.java)**

**Logic**

1. Find mid using fast/slow
2. Recursively sort halves
3. Merge sorted lists

---

---

# 🔥 5. Segregate Odd and Even Nodes in Linked List

Place **odd indexed nodes first**, then even ones.

---

### ✔ Approach 1: Brute (ArrayList)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/SegregateOddEvenNodesLLBrute.java)**

**Logic**

1. Traverse & store odd values first
2. Then even values
3. Rewrite list

---

### ✔ Approach 2: Optimal O(1) Space

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/SegregateOddEvenNodesLLOptimal.java)**

**Logic**

1. Maintain `odd` & `even` ptrs
2. Link alternate nodes
3. Attach even list after odd

---

---

# 🔥 6. Palindrome Linked List

Check if a linked list reads the same forward and backward.

---

### ✔ Approach 1: Array (Brute)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/Palindrome_Array.java)**

**Logic**

1. Store all values in array
2. Compare with two pointers

---

### ✔ Approach 2: Stack

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/Palindrome_Stack.java)**

**Logic**

1. Push all values into stack
2. Compare while popping

---

### ✔ Approach 3: Fast–Slow + Reverse Second Half (Optimal)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/Palindrome_Optimized.java)**

**Logic**

1. Find middle using slow/fast
2. Reverse second half
3. Compare halves
4. (Optional) Restore

---

---

# 🔥 7. Intersection of Two Linked Lists

Find the node where **two linked lists intersect**, else return `null`.

---

### ✔ Approach 1: HashSet (Brute)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/Intersection_HashSetBrute.java)**

**Logic**

1. Store nodes of list A in set
2. Traverse list B
3. First match = intersection

---

### ✔ Approach 2: Length Difference Method (Better)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/Intersection_LengthMethodBetter.java)**

**Logic**

1. Find lengths of A & B
2. Move longer list ahead by `d`
3. Move both pointers together
4. Meeting node = intersection

---

### ✔ Approach 3: Two Pointer Switching (Optimal)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/Intersection_TwoPointerOptimal.java)**

**Logic**

1. Pointer A → A then B
2. Pointer B → B then A
3. They meet at intersection or both null

---

---

# 🔥 8. Delete the Middle Node of a Linked List

Delete the **middle node** and return the head.

---

### ✔ Approach 1: Count Method (Brute)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/DeleteMiddleNodebrute.java)**

**Logic**

1. Count nodes
2. Middle = `count / 2`
3. Move to node before middle
4. Delete next

---

### ✔ Approach 2: Fast–Slow Pointer (Optimal)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/DeleteMiddleNodeOptimal.java)**

**Logic**

1. fast = 2 steps, slow = 1
2. slow reaches middle
3. prev.next = slow.next

---


# 🔥 **9. Length of Loop in a Linked List**

Given the head of a linked list, return the **number of nodes in the loop**.
If no loop exists, return **0**.

---

### ✔ Approach 1: HashSet (Brute)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/CycleLengthHashSetbrute.java)**

**Logic**

1. Traverse the linked list while storing each node in a HashSet
2. When a node repeats, a cycle exists
3. From that repeated node, move forward until you return to it
4. Count steps → loop length

**Time Complexity:** O(n)
**Space Complexity:** O(n)

---

### ✔ Approach 2: Floyd’s Cycle Detection (Optimal)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/CycleLengthFloydoptimal.java)**

**Logic**

1. Use slow and fast pointers
2. If they meet, a cycle exists
3. Move fast one step at a time until it meets slow again
4. Count steps → loop length

**Time Complexity:** O(n)
**Space Complexity:** O(1)

---

---

# 🔥 **10. Remove Nth Node From End of Linked List**

Given the head of a linked list, remove the **N-th node from the end**.

---

### ✔ Approach 1: Brute Force (Count Length)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/RemoveNthBrute.java)**

**Logic**

1. Traverse the list to count total nodes
2. Convert the nth-from-end to a forward index:

   ```
   del = length - n + 1
   ```
3. If `del == 1`, delete head
4. Otherwise move to `(del - 1)`th node
5. Unlink the next node

**Time Complexity:** O(n)
**Space Complexity:** O(1)

---

### ✔ Approach 2: Two Pointer Method (Optimal)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/RemoveNthTwoPointeroptimal.java)**

**Logic**

1. Move fast pointer `n` steps ahead
2. If fast becomes null → delete head
3. Move both pointers until `fast.next == null`
4. Slow now stands before the node to delete
5. Remove `slow.next`

**Time Complexity:** O(n)
**Space Complexity:** O(1)

---
Perfect 👍
Here’s **Question 11 updated**, **same format**, now with **Time & Space Complexity added for BOTH approaches**.

---

# 🔥 11. Add 1 to a Number Represented as Linked List

You are given a linked list representing a non-negative number.
Each node contains a single digit.
Add **1** to the number and return the updated linked list.

---

### ✔ Approach 1: Iterative (Reverse + Carry)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/add1noinLLIterative.java)**

**Logic**

1. Reverse the linked list.
2. Initialize carry as `1`.
3. Traverse the list and add carry to each node.
4. If sum `< 10`, update node and stop.
5. If sum `>= 10`, set node value to `0` and continue carry.
6. If carry remains after traversal, add a new node.
7. Reverse the list again and return the result.

**Complexity**

* **Time Complexity:** `O(n)`
  (reversing the list + traversal)

* **Space Complexity:** `O(1)`
  (in-place operations, no extra data structures)

---

### ✔ Approach 2: Recursive (Backtracking)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/add1noinLLRecursive.java)**

**Logic**

1. Use recursion to reach the last node.
2. Add `1` while backtracking.
3. Handle carry propagation during backtracking.
4. If carry remains after full recursion, create a new node at the head.
5. Return the updated linked list.

**Complexity**

* **Time Complexity:** `O(n)`
  (each node is visited once)

* **Space Complexity:** `O(n)`
  (recursive call stack)

---






