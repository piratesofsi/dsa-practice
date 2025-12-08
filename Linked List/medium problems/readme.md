

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
2. Middle = `n/2`.
3. Traverse again till that index.
4. Return the middle node.

---

### ✔ Approach 2: Fast & Slow Pointer (Optimal)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/middleofLLfastandslow.java)**

**Logic**

1. `slow` → moves 1 step.
2. `fast` → moves 2 steps.
3. When fast reaches end → slow = middle.
4. Return slow.

---

---

## 🔥 2. Detect Cycle in Linked List (Only Check if Loop Exists)

Given the head of a linked list, **return true if a cycle exists**, else `false`.
(Does NOT return starting node)

---

### ✔ Approach 1: HashSet (Brute Force)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/DetectCycleHashSet.java)**

**Logic**

1. Use HashSet to track visited nodes.
2. If a node repeats → loop exists.
3. If LL ends → no loop.

---

### ✔ Approach 2: Floyd’s Cycle Detection (Optimal)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/DetectCycleOptimal.java)**

**Logic**

1. `slow` → 1 step & `fast` → 2 steps.
2. If both meet → cycle exists.
3. If fast ends → no cycle.

---

---

## 🔥 3. Find Starting Node of Cycle

Given a linked list with a cycle, return the **node where the loop begins**, else return `null`.

---

### ✔ Approach 1: HashSet (Brute)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/startingofloopbrute.java)**

**Logic**

1. Traverse LL while storing nodes in a HashSet.
2. First repeating node found = **start of loop**.
3. If no repetition → no cycle.

---

### ✔ Approach 2: Floyd’s Algorithm (Optimal)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/startingofloopfloyd.java)**

**Logic**

1. Detect cycle using slow & fast pointers.
2. After meeting → move `slow = head`.
3. Move both **1-1 step** each.
4. The point they meet again = **start of loop**.

---

---

## 🔥 4. Sort a Linked List

Given the head of a linked list, **sort it in ascending order**.

---

### ✔ Approach 1: Brute Force (ArrayList + Sort)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/sortLLbrute.java)**

**Logic**

1. Store values in ArrayList.
2. Sort using `Collections.sort()`.
3. Put values back into linked list.
4. Return head.

---

### ✔ Approach 2: Merge Sort on Linked List (Optimal)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/sortLLoptimal.java)**

**Logic**

1. Find middle using slow/fast pointer.
2. Split list into two halves.
3. Recursively sort both halves.
4. Merge both sorted lists.
5. Return final sorted head.

---


