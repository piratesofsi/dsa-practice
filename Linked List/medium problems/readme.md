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


Betaaa Musab 👑
I got you — I'll update the same **README format + wording style** just like previous problems and add **your 3 new problems + code links section** smoothly.

You just need to **copy-paste the block below directly below Segregate Odd-Even part**, inside your README.md.

---

# 🔥 6. Intersection of Two Linked Lists

Find the node where **two linked lists intersect**.
Return the intersecting `ListNode`, else return `null`.

---

### ✔ Approach 1: HashSet (Brute)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/Intersection_HashSetBrute.java)**

**Logic**

1. Traverse first LL and store each node address in `HashSet`.
2. Traverse second LL and check if any node exists in set.
3. First repeated node → intersection point.
4. Else return `null`.

**Time Complexity:** `O(n + m)`
**Space Complexity:** `O(n)`

---

### ✔ Approach 2: Length Difference Method (Better)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/Intersection_LengthMethodBetter.java)**

**Logic**

1. Count lengths of both lists.
2. Find absolute difference `d`.
3. Move **longer LL** `d` steps ahead.
4. Now move both pointers together.
5. Node where both meet → intersection.

**Time Complexity:** `O(n + m)`
**Space Complexity:** `O(1)`

---

### ✔ Approach 3: Two Pointer Switching (Optimal 💯)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/Intersection_TwoPointerOptimal.java)**

**Logic**

1. `t1 = A`, `t2 = B`.
2. When pointer ends, switch it to other list.
3. Both will cover equal distance → meet at intersection.
4. If no intersection → both become `null` at same time.

**Time Complexity:** `O(n + m)`
**Space Complexity:** `O(1)`
**Most recommended in interviews.**

---

