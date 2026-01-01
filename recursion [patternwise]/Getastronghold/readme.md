

# 🔁 Recursion – PatternWise

This section focuses on **understanding recursion patterns**, identifying **base cases**, and applying **binary exponentiation** to optimize time complexity.

---

## 📊 Progress Table

| # | Problem Name       | Approaches | Difficulty | Jump To                      |
| - | ------------------ | ---------- | ---------- | ---------------------------- |
| 1 | Pow(x, n)          | 3          | Easy       | [Go](#-1-powx-n)             |
| 2 | Count Good Numbers | 1          | Easy       | [Go](#-2-count-good-numbers) |

---

## 🔵 1. Pow(x, n)

**Description:**
Given a base `x` and an integer `n`, compute (x^n).
The solution must correctly handle:

* Negative powers
* Very large values of `n`
* Precision constraints

---

### 1️⃣ Brute Force (Iterative)

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/recursion%20%5Bpatternwise%5D/Getastronghold/PowerBruteForce.java)**

**Idea:**
Multiply `x` exactly `n` times using a loop.

**Complexity:**

* Time: `O(N)`
* Space: `O(1)`

---

### 2️⃣ Recursive – Binary Exponentiation

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/recursion%20%5Bpatternwise%5D/Getastronghold/PowerRecursive.java)**

**Idea:**
Use divide and conquer to reduce the power by half.

* If `n` is even → (x^n = (x^2)^{n/2})
* If `n` is odd → (x^n = x \times x^{n-1})

**Why it’s optimal:**
Eliminates redundant multiplications.

**Complexity:**

* Time: `O(log N)`
* Space: `O(log N)`

---

### 3️⃣ Iterative – Binary Exponentiation

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/recursion%20%5Bpatternwise%5D/Getastronghold/binaryexponetiationbetter.java)**

**Idea:**
Same logic as recursive binary exponentiation but implemented iteratively to avoid recursion stack overhead.

**Complexity:**

* Time: `O(log N)`
* Space: `O(1)`

---

## 🔵 2. Count Good Numbers

**Description:**
Given an integer `n`, count the number of digit strings of length `n` such that:

* Digits at **even indices** are even → `{0, 2, 4, 6, 8}` (5 choices)
* Digits at **odd indices** are prime → `{2, 3, 5, 7}` (4 choices)

---

### 1️⃣ Recursive – Binary Exponentiation

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/recursion%20%5Bpatternwise%5D/Getastronghold/CountGoodNumbersbinaryexponentiationrecursion.java)**

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


