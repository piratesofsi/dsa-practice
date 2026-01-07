

# 🔁 Recursion – PatternWise

This section focuses on **understanding recursion patterns**, identifying **base cases**, and mastering
**pop → recurse → backtrack → insert** based problems instead of memorizing solutions.

---

## 📊 Progress Table

| # | Problem Name       | Approaches | Difficulty | Jump To                      |
| - | ------------------ | ---------- | ---------- | ---------------------------- |
| 1 | Pow(x, n)          | 3          | Easy       | [Go](#-1-powx-n)             |
| 2 | Count Good Numbers | 1          | Easy       | [Go](#-2-count-good-numbers) |
| 3 | Reverse Stack      | 1          | Medium     | [Go](#-3-reverse-stack)      |
| 4 | Sort Stack         | 1          | Medium     | [Go](#-4-sort-stack)         |

---

## 🔵 1. Pow(x, n)

**Description:**
Given a base `x` and an integer `n`, compute (x^n).

Handles:

* Negative powers
* Large values of `n`
* Precision constraints

---

### 1️⃣ Brute Force (Iterative)

📌 **Code:** [PowerBruteForce.java](PowerBruteForce.java)

**Idea:**
Multiply `x` exactly `n` times using a loop.

**Complexity:**

* Time: `O(N)`
* Space: `O(1)`

---

### 2️⃣ Recursive – Binary Exponentiation

📌 **Code:** [PowerRecursive.java](PowerRecursive.java)

**Idea:**

* If `n` is even → (x^n = (x^2)^{n/2})
* If `n` is odd → (x^n = x \times x^{n-1})

**Complexity:**

* Time: `O(log N)`
* Space: `O(log N)`

---

### 3️⃣ Iterative – Binary Exponentiation

📌 **Code:** [BinaryExponentiationBetter.java](BinaryExponentiationBetter.java)

**Idea:**
Same logic as recursive binary exponentiation but implemented iteratively.

**Complexity:**

* Time: `O(log N)`
* Space: `O(1)`

---

## 🔵 2. Count Good Numbers

**Description:**
Given an integer `n`, count the number of digit strings of length `n` such that:

* Even indices → `{0,2,4,6,8}` → **5 choices**
* Odd indices → `{2,3,5,7}` → **4 choices**

---

### 1️⃣ Recursive – Binary Exponentiation

📌 **Code:**
[CountGoodNumbersBinaryExponentiationRecursion.java](CountGoodNumbersBinaryExponentiationRecursion.java)

**Approach:**

* Even positions = ⌈n / 2⌉
* Odd positions = ⌊n / 2⌋

[
5^{\lceil n/2 \rceil} \times 4^{\lfloor n/2 \rfloor} \mod (10^9 + 7)
]

**Complexity:**

* Time: `O(log N)`
* Space: `O(log N)`

---

## 🔵 3. Reverse Stack

**Description:**
Reverse a stack using **recursion only**.
No extra data structures allowed.

---

### 1️⃣ Recursive – Insert at Bottom Pattern

📌 **Code:** [ReverseStack.java](ReverseStack.java)

**Idea:**

1. Remove elements until stack becomes empty
2. While backtracking, insert each element at the **bottom**

**Key Pattern:**

```
pop → recurse → insert at bottom
```

**Complexity:**

* Time: `O(N²)`
* Space: `O(N)` (recursion stack)

---

## 🔵 4. Sort Stack

**Description:**
Sort a stack using **recursion only** such that the smallest element stays at the bottom.

---

### 1️⃣ Recursive – Sorted Insert Pattern

📌 **Code:** [SortStack.java](SortStack.java)

**Idea:**

1. Pop the top element
2. Recursively sort the remaining stack
3. Insert the popped element in its **correct sorted position**

**Key Pattern:**

```
pop → recurse → insert in sorted order
```

**Complexity:**

* Time: `O(N²)`
* Space: `O(N)` (recursion stack)

---
