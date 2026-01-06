

# 🔁 Recursion – Subsequence Pattern

This section focuses on **subsequence-style recursion**, where at every step we make a **choice**:

* include the current element
* or exclude it

These problems help in mastering **pick / not-pick**, **backtracking**, and **state management** in recursion.

---

## 📊 Progress Table

| # | Problem Name                 | Approaches | Difficulty | Jump To                              |
| - | ---------------------------- | ---------- | ---------- | ------------------------------------ |
| 1 | Subsets                      | 2          | Easy       | [Go](#-1-subsets)                    |
| 2 | Subsets II (With Duplicates) | 1          | Medium     | [Go](#-2-subsets-ii-with-duplicates) |
| 3 | Generate Parentheses         | 2          | Medium     | [Go](#-3-generate-parentheses)       |

---

## 🔵 1. Subsets

**Description:**
Given an integer array `nums`, return **all possible subsets (the power set)**.

---

### 1️⃣ Copy-Based Recursion

📌 **Code:** [`Subsets_CopyBased.java`](Subsets_CopyBased.java)

**Idea:**
At each index:

* Create a **new list**
* Add the current element
* Pass it to the recursive call

This avoids manual backtracking but uses extra space.

**Complexity:**

* Time: `O(2^N)`
* Space: `O(N × 2^N)`

---

### 2️⃣ Backtracking (Pick / Not Pick)

📌 **Code:** [`Subsets_backtracking.java`](Subsets_backtracking.java)

**Idea:**
Use the **same list**:

* Pick the element → recurse
* Remove it (backtrack)
* Not pick → recurse

This is the **standard subsequence pattern**.

**Complexity:**

* Time: `O(2^N)`
* Space: `O(N)` (recursion stack)

---

## 🔵 2. Subsets II (With Duplicates)

**Description:**
Given an integer array `nums` that **may contain duplicates**, return all possible **unique subsets**.

---

### 1️⃣ Backtracking + Skipping Duplicates

📌 **Code:** [`SubsetsWithDup.java`](SubsetsWithDup.java)

**Idea:**

* Sort the array
* While iterating, **skip duplicate elements** at the same recursion level

This prevents duplicate subsets from being generated.

**Complexity:**

* Time: `O(2^N)`
* Space: `O(N)`

---

## 🔵 3. Generate Parentheses

**Description:**
Given `n` pairs of parentheses, generate all combinations of **well-formed parentheses**.

---

### 1️⃣ New String on Each Recursive Call

📌 **Code:** [`GenerateParentheses_NewStringEachCall.java`](GenerateParentheses_NewStringEachCall.java)

**Idea:**

* At each step, create a **new string**
* Add `'('` or `')'` if valid
* No backtracking needed

**Complexity:**

* Time: `O(2^(2N))` (pruned by constraints)
* Space: `O(2N × number of answers)`

---

### 2️⃣ Backtracking with StringBuilder

📌 **Code:** [`GenerateParentheses_Backtracking.java`](GenerateParentheses_Backtracking.java)

**Idea:**

* Use **one StringBuilder**
* Append a character
* Recurse
* Remove last character (backtrack)

This is **memory efficient and faster**.

**Complexity:**

* Time: `O(2^(2N))`
* Space: `O(2N)` (recursion + builder)

---

If you want next:

* Add **“Core Subsequence Pattern” notes**
* Add **dry run examples**
* Align this exactly with **Striver A2Z recursion flow**
* Or create a **master recursion index README**

Just say the word 🔥

