

## 📊 Progress Table

| # | Problem Name | Variants | Difficulty | Jump To           |
| - | ------------ | -------- | ---------- | ----------------- |
| 1 | N Queen      | 2        | Hard       | [Go](#-1-n-queen) |

---

## 🔵 1. N Queen

**Description:**
Given an integer `n`, place `n` queens on an `n × n` chessboard such that:

* No two queens attack each other
* No two queens share the same row, column, or diagonal

---

### 1️⃣ Variant 1 – Return All Valid Boards

📌 **Code:** [`NQueens1.java`](NQueens1.java)

**Output:**
`List<List<String>>`

**Idea:**

* Build the chessboard row by row
* On placing a queen, check:

  * Column
  * Upper-left diagonal
  * Upper-right diagonal
* When all rows are filled, **convert the board to strings** and store it

**Use Case:**
Required when the problem asks for **actual configurations**, not just the count.

**Complexity:**

* Time: `O(N!)`
* Space: `O(N²)` (board + recursion stack)

---

### 2️⃣ Variant 2 – Count Number of Solutions Only

📌 **Code:** [`NQueens2.java`](NQueens2.java)

**Output:**
`int` (number of valid configurations)

**Idea:**

* Use backtracking to try all valid placements
* Instead of storing boards, **increment a counter** when a valid configuration is found
* This reduces memory usage

**Why this variant matters:**
Many interview problems ask **only the number of solutions**, not the boards.

**Complexity:**

* Time: `O(N!)`
* Space: `O(N)` (recursion stack only)

---


