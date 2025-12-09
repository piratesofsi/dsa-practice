Here is your **complete updated README.md**, including the **new Segregate Odd-Even Linked List problem** in the same format & styling you showed.
Just **copy → paste** inside your repo.

---

# 📘 Linked List – Medium Problems

---

## 🔥 1. Find the Middle of a Linked List

Given the head of a linked list, return the **middle node**.
If there are two middle nodes, return the **second middle**.

---

### ✔ Approach 1: Length + Second Traversal

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/middleofLL.java)**

**Logic**

1. Traverse LL & count total nodes.
2. Middle index = `n/2`.
3. Traverse again to that node.
4. Return middle.

---

### ✔ Approach 2: Fast & Slow Pointer (Optimal)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/middleofLLfastandslow.java)**

**Logic**

1. `slow` → 1 step, `fast` → 2 steps.
2. When fast reaches end → slow at middle.
3. Return slow.

---

---

## 🔥 2. Detect Cycle in Linked List (Only Check Loop Exists)

Return **true** if loop exists, else **false**.

---

### ✔ Approach 1: HashSet (Brute)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/DetectCycleHashSet.java)**

**Logic**

1. Store visited nodes in set.
2. If node repeats → cycle exists.
3. If end reached → no cycle.

---

### ✔ Approach 2: Floyd’s Cycle Detection (Optimal)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/DetectCycleOptimal.java)**

**Logic**

1. `slow`=1 step, `fast`=2 steps.
2. If they meet → cycle exists.
3. If fast ends → no cycle.

---

---

## 🔥 3. Find Starting Node of Cycle

Return the node where loop begins.

---

### ✔ Approach 1: HashSet (Brute)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/startingofloopbrute.java)**

**Logic**

1. Use set to track visited.
2. First repeated node = start of loop.

---

### ✔ Approach 2: Floyd's Algorithm (Optimal)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/startingofloopfloyd.java)**

**Logic**

1. Detect cycle using fast/slow.
2. Move slow → head.
3. Move both 1 step until meet.
4. Meet point = loop start.

---

---

## 🔥 4. Sort a Linked List

Sort the LL in ascending order.

---

### ✔ Approach 1: Brute (ArrayList + Sort)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/sortLLbrute.java)**

**Logic**

1. Push all values in list.
2. Sort it.
3. Rewrite nodes.

---

### ✔ Approach 2: Merge Sort on LL (Optimal)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/sortLLoptimal.java)**

**Logic**

1. Find mid using fast/slow.
2. Recursively sort halves.
3. Merge sorted lists.

---

---

## 🔥 5. Segregate Odd and Even Nodes in Linked List

Place **odd indexed nodes first**, then even ones.

---

### ✔ Approach 1: Brute (ArrayList)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/SegregateOddEvenNodesLLBrute.java)**

**Logic**

1. Traverse & store odd values first.
2. Then even values.
3. Rewrite list.

---

### ✔ Approach 2: Optimal O(1) Space

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/SegregateOddEvenNodesLLOptimal.java)**

**Logic**

1. Maintain `odd` & `even` ptrs.
2. Link alternate nodes.
3. Attach even list after odd.

---


