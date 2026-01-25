

# 🔁 Recursion – Subsequence Pattern

This section focuses on **subsequence-style recursion**, where solutions are built **progressively** using recursion and backtracking.

At each step, we:

* move index by index
* make controlled choices
* manage state carefully
* use backtracking to explore all possibilities

These problems help in mastering **recursion flow**, **state management**, and **decision trees**.

---

## 📊 Progress Table

| # | Problem Name                          | Approaches | Difficulty | Jump To                                         |
| - | ------------------------------------- | ---------- | ---------- | ----------------------------------------------- |
| 1 | Subsets                               | 2          | Easy       | [Go](#-1-subsets)                               |
| 2 | Subsets II (With Duplicates)          | 1          | Medium     | [Go](#-2-subsets-ii-with-duplicates)            |
| 3 | Generate Parentheses                  | 2          | Medium     | [Go](#-3-generate-parentheses)                  |
| 4 | Letter Combinations of a Phone Number | 1          | Medium     | [Go](#-4-letter-combinations-of-a-phone-number) |
| 5 | Combination Sum Series                | 3          | Medium     | [Go](#-5-combination-sum-series)                |

---

# 🔵 1. Subsets

**Description:**
Given an integer array `nums`, return **all possible subsets (power set)**.

---

### 1️⃣ Copy-Based Recursion

📌 **Code:** [`Subsets_CopyBased.java`](./Subsets_CopyBased.java)

**Complexity:**

* Time: `O(2^N)`
* Space: `O(N × 2^N)`

---

### 2️⃣ Backtracking (Pick / Not Pick)

📌 **Code:** [`Subsets_backtracking.java`](./Subsets_backtracking.java)

**Complexity:**

* Time: `O(2^N)`
* Space: `O(N)`

---

# 🔵 2. Subsets II (With Duplicates)

**Description:**
Given an integer array that may contain duplicates, return all **unique subsets**.

---

### ✅ Backtracking + Skip Duplicates

📌 **Code:** [`SubsetsWithDup.java`](./SubsetsWithDup.java)

**Complexity:**

* Time: `O(2^N)`
* Space: `O(N)`

---

# 🔵 3. Generate Parentheses

**Description:**
Generate all combinations of **well-formed parentheses**.

---

### 1️⃣ New String Each Call

📌 **Code:** [`GenerateParentheses_NewStringEachCall.java`](./GenerateParentheses_NewStringEachCall.java)

---

### 2️⃣ Backtracking with StringBuilder

📌 **Code:** [`GenerateParentheses_Backtracking.java`](./GenerateParentheses_Backtracking.java)

---

# 🔵 4. Letter Combinations of a Phone Number

**Description:**
Return all possible letter combinations for digits `2–9`.

---

### ✅ Backtracking DFS

📌 **Code:** [`Lettercombinationofaphoneno.java`](./Lettercombinationofaphoneno.java)

**Complexity:**

* Time: `O(4^N)`
* Space: `O(N)`

---

# 🔵 5. Combination Sum Series

These problems revolve around **DFS + backtracking + pruning**:

* reuse or skip numbers
* move index-wise
* avoid duplicates
* prune early when sum exceeds

---

## 🔹 5.1 Combination Sum I

**Unlimited usage allowed.**

📌 **Code:** [`CombinationSum1.java`](./CombinationSum1.java)

**Complexity:**

* Time: `O(2^T)`
* Space: `O(T)`

---

## 🔹 5.2 Combination Sum II

**Each element used once + no duplicate answers.**

📌 **Code:** [`CombinationSum2.java`](./CombinationSum2.java)

**Complexity:**

* Time: `O(2^N)`
* Space: `O(N)`

---

## 🔹 5.3 Combination Sum III

**Pick `k` numbers from `1–9` summing to `n`.**

📌 **Code:** [`CombinationSum3.java`](./CombinationSum3.java)

**Complexity:**

* Time: `O(C(9, k))`
* Space: `O(k)`

---
