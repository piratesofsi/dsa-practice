# 📘 Lec 3: Medium Problems of LL

---

## 🔹 Find the Starting Point in Linked List (Cycle Start)

Given the head of a linked list, detect if a cycle exists.  
If yes, return the **node where the cycle begins**, else return `null`.

---

### ✔ Approach 1: Using HashSet

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/DetectCycleHashSet.java)**

**Logic:**
1. Create a `HashSet`.
2. Traverse the list:
   - If current node already exists in set → this is the **starting node** → return it.
   - Else add current node to set.
3. If traversal ends → no cycle → return `null`.

---

### ✔ Approach 2: Floyd’s Cycle Detection (Tortoise & Hare)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Linked%20List/medium%20problems/DetectCycleFloyd.java)**

**Logic:**
1. Use two pointers `slow` and `fast`.
2. Move `slow = slow.next`, `fast = fast.next.next` until they meet.
3. If no meet → no cycle → return `null`.
4. After meeting, set `fast = head`.
5. Move both one step at a time.
6. Where they meet again → **cycle start node**.

---

