

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

---

## 🔵 1. Subsets

**Description:**
Given an integer array `nums`, return **all possible subsets (power set)**.

---

### 1️⃣ Copy-Based Recursion

📌 **Code:** `Subsets_CopyBased.java`

**Idea:**

* At each index, create a **new list**
* Add current element
* Pass it to recursive calls

This avoids manual backtracking but uses extra space.

**Complexity:**

* Time: `O(2^N)`
* Space: `O(N × 2^N)`

---

### 2️⃣ Backtracking (Pick / Not Pick)

📌 **Code:** `Subsets_backtracking.java`

**Idea:**

* Use the same list
* Pick → recurse
* Backtrack
* Not pick → recurse

This is the **classic subsequence recursion pattern**.

**Complexity:**

* Time: `O(2^N)`
* Space: `O(N)` (recursion stack)

---

## 🔵 2. Subsets II (With Duplicates)

**Description:**
Given an integer array that may contain duplicates, return all **unique subsets**.

---

### 1️⃣ Backtracking + Skipping Duplicates

📌 **Code:** `SubsetsWithDup.java`

**Idea:**

* Sort the array
* Skip duplicate elements at the same recursion level

**Complexity:**

* Time: `O(2^N)`
* Space: `O(N)`

---

## 🔵 3. Generate Parentheses

**Description:**
Given `n` pairs of parentheses, generate all combinations of **well-formed parentheses**.

---

### 1️⃣ New String on Each Recursive Call

📌 **Code:** `GenerateParentheses_NewStringEachCall.java`

**Idea:**

* Create a new string at each recursion step
* Add `'('` or `')'` if valid
* No explicit backtracking required

**Complexity:**

* Time: `O(2^(2N))` (pruned)
* Space: `O(2N × answers)`

---

### 2️⃣ Backtracking with StringBuilder

📌 **Code:** `GenerateParentheses_Backtracking.java`

**Idea:**

* Use a single `StringBuilder`
* Append character
* Recurse
* Remove last character (backtrack)

This is **memory efficient**.

**Complexity:**

* Time: `O(2^(2N))`
* Space: `O(2N)` (recursion + builder)

---

## 🔵 4. Letter Combinations of a Phone Number

**Description:**
Given a string containing digits from `2–9`, return all possible letter combinations based on phone keypad mapping.

---

### 🧠 Core Insight

Although this problem is **not classic pick / not-pick**, it still fits the **subsequence-style recursion mindset** because:

* recursion progresses **index by index**
* one character is added per recursive call
* state is maintained using backtracking
* result is built incrementally

---

### 🔁 Recursion Design

**State:**

* `index` → current digit
* `StringBuilder` → current combination

**Choices:**

* letters mapped to `digits[index]`

**Base Case:**

```java
sb.length() == digits.length()
```

---

### ✅ Backtracking Approach

📌 **Code:** `Lettercombinationofaphoneno.java`

**Idea:**

* Iterate over all letters for the current digit
* Append one letter
* Recurse to next index
* Backtrack after recursion

---

### ⏱ Complexity

* **Time:** `O(4^N)`
* **Space:** `O(N)` (recursion stack)

---

