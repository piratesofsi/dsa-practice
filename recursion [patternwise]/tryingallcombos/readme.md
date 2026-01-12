
## 📊 Progress Table

| # | Problem Name  | Variants | Difficulty | Jump To                 |
| - | ------------- | -------- | ---------- | ----------------------- |
| 1 | N Queen       | 2        | Hard       | [Go](#-1-n-queen)       |
| 2 | Sudoku Solver | 1        | Hard       | [Go](#-2-sudoku-solver) |

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

## 🔵 2. Sudoku Solver

**Description:**
Given a partially filled `9 × 9` Sudoku board, fill the empty cells (`.`) such that:

* Each row contains digits `1–9` exactly once
* Each column contains digits `1–9` exactly once
* Each `3 × 3` subgrid contains digits `1–9` exactly once

---

### 1️⃣ Variant – Solve the Sudoku Board (Backtracking)

📌 **Code:** [`sudokusolver.java`](sudokusolver.java)

**Output:**
The input board is **modified in-place** to a valid solved Sudoku.

**Idea:**

* Traverse the board to find an empty cell
* Try placing digits `1–9`
* Before placing, check if the digit is **safe**:

  * Row
  * Column
  * `3 × 3` subgrid
* Use **backtracking**:

  * If a digit leads to a dead end, undo the placement
  * Try the next digit
* If no empty cell remains, the board is solved

**Why this approach is intuitive:**

* Matches natural human thinking for Sudoku
* No manual row/column pointer handling
* Clean recursion with clear base condition

**Complexity:**

* Time: `O(9^(empty_cells))` (practically optimized via pruning)
* Space: `O(81)` (recursion stack in worst case)

---

