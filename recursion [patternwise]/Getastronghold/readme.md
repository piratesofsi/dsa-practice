

# 🔁 Recursion – PatternWise



---

| # | Problem Name       | Approaches | Difficulty | Jump To                      |
| - | ------------------ | ---------- | ---------- | ---------------------------- |
| 1 | Pow(x, n)          | 3          | Easy       | [Go](#-1-powx-n)             |
| 2 | Count Good Numbers | 1          | Easy       | [Go](#-2-count-good-numbers) |

---

## 🔵 1. Pow(x, n)

📌 **[Brute Force Code](https://github.com/piratesofsi/dsa-practice/blob/main/Recursion/PowerBruteForce.java)**
📌 **[Recursive Binary Exponentiation Code](https://github.com/piratesofsi/dsa-practice/blob/main/Recursion/PowerRecursive.java)**
📌 **[Iterative Binary Exponentiation Code](https://github.com/piratesofsi/dsa-practice/blob/main/Recursion/binaryexponetiationbetter.java)**

**Description:**
Computes (x^n) using recursion and binary exponentiation while handling negative powers safely.

---

### 🔹 Brute Force Approach

**Idea:**
Multiply `x` repeatedly `n` times.

**Steps:**

1. Take absolute value of `n`
2. Multiply `x` in a loop `n` times
3. If `n` is negative, return reciprocal

**Complexity:**

* Time: `O(N)`
* Space: `O(1)`

---

### 🔹 Optimized Approach (Binary Exponentiation)

**Idea:**
Reduce the problem size by half using:

* (x^n = (x^2)^{n/2}) when `n` is even
* (x^n = x × x^{n-1}) when `n` is odd

**Why it works:**
Avoids repeated multiplication and drastically reduces operations.

**Complexity:**

* Time: `O(log N)`
* Space:

  * Recursive: `O(log N)`
  * Iterative: `O(1)`

---

## 🔵 2. Count Good Numbers

📌 **[Code](https://github.com/piratesofsi/dsa-practice/blob/main/Recursion/CountGoodNumbersbinaryexponentiationrecursion.java)**

**Description:**
Counts the number of valid digit strings of length `n` such that:

* **Even indices** → `{0, 2, 4, 6, 8}` → 5 choices
* **Odd indices** → `{2, 3, 5, 7}` → 4 choices

---

### 🔹 Mathematical Breakdown

* Even positions = ⌈n / 2⌉
* Odd positions = ⌊n / 2⌋

[
\text{Answer} = 5^{\lceil n/2 \rceil} \times 4^{\lfloor n/2 \rfloor} \mod (10^9 + 7)
]

---

### 🔹 Approach Used

* Count number of even and odd positions
* Compute large powers using **binary exponentiation with recursion**
* Apply modulo at every step to prevent overflow

---

### 🔹 Complexity

* Time: `O(log N)`
* Space: `O(log N)` (recursion stack)

---



* Refactor this into a **table-style README**
* Add a **progress tracker section**
* Align it **exactly with Striver’s Recursion Sheet format**

Just tell me 👍
