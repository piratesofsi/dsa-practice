Here is your **full formatted README.md** including all four questions and both approaches each.
You can directly **copy → paste into GitHub / OneNote**.

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

1. Traverse LL & count length.
2. Middle index = `n/2`.
3. Traverse again till middle index.
4. Return middle node.

---

### ✔ Approach 2: Fast & Slow Pointer (Optimal)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/middleofLLfastandslow.java)**

**Logic**

1. `slow` → 1 step, `fast` → 2 steps at a time.
2. When fast reaches end, slow = **middle**.
3. Return slow.

---

---

## 🔥 2. Detect Cycle & Find Starting Node

Given the head of a linked list, determine if there is a cycle.
If cycle exists, return the **starting node of the cycle**, else return `null`.

---

### ✔ Approach 1: HashSet

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/DetectCycleHashSet.java)**

**Logic**

1. Use a HashSet.
2. While traversing:

   * if node already exists → this is the cycle start.
   * else add node.
3. If traversal ends → no cycle.

---

### ✔ Approach 2: Floyd’s Cycle Detection (Tortoise-Hare)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/DetectCycleFloyd.java)**

**Logic**

1. Use `slow` & `fast` pointers to detect meeting.
2. If never meet → no cycle.
3. If meet → set `fast = head`.
4. Move slow & fast one step each → where they meet = **cycle start**.

---

---

## 🔥 3. Sort a Linked List

Given the head of a linked list, **sort in ascending order**.

---

### ✔ Approach 1: Brute Force (ArrayList + Sort)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/sortLLbrute.java)**

**Logic**

1. Extract values to ArrayList.
2. Sort list using `Collections.sort`.
3. Rewrite sorted values back into linked list.
4. Return head.

---

### ✔ Approach 2: Optimal – Merge Sort on Linked List

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/sortLLoptimal.java)**

**Logic**

1. Find mid (slow-fast approach).
2. Split list into two halves.
3. Recursively sort both halves.
4. Merge both sorted halves like **merge two sorted lists**.
5. Return sorted final head.

---




