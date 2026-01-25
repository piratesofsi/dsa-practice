
---

## 📊 Progress Table

| # | Problem Name  | Variants | Difficulty | Jump To                 |
| - | ------------- | -------- | ---------- | ----------------------- |
| 1 | N Queen       | 2        | Hard       | [Go](#-1-n-queen)       |
| 2 | Sudoku Solver | 1        | Hard       | [Go](#-2-sudoku-solver) |
| 3 | Rat in a Maze | 1        | Medium     | [Go](#-3-rat-in-a-maze) |
| 4 | Word Search   | 1        | Medium     | [Go](#-4-word-search)   |

---

## 🔵 1. N Queen

**Description:**
Given an integer `n`, place `n` queens on an `n × n` chessboard such that:

* No two queens attack each other
* No two queens share the same row, column, or diagonal

---

### 1️⃣ Variant 1 – Return All Valid Boards

📌 **Code:** [`NQueens1.java`](./NQueens1.java)

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

📌 **Code:** [`NQueens2.java`](./NQueens2.java)

**Output:**
`int`

**Idea:**

* Use backtracking to try all valid placements
* Instead of storing boards, **increment a counter**
* Reduces memory usage

**Complexity:**

* Time: `O(N!)`
* Space: `O(N)`

---

## 🔵 2. Sudoku Solver

**Description:**
Given a partially filled `9 × 9` Sudoku board, fill the empty cells (`.`).

---

### 1️⃣ Variant – Solve the Sudoku Board

📌 **Code:** [`sudokusolver.java`](./sudokusolver.java)

**Output:**
Board modified **in-place**.

**Idea:**

* Locate empty cell
* Try digits `1–9`
* Validate row / column / box
* Backtrack on failure

**Complexity:**

* Time: `O(9^(empty_cells))`
* Space: `O(81)`

---

## 🔵 3. Rat in a Maze

**Description:**
Find **all possible paths** from `(0,0)` to `(n-1,n-1)`.

---

### 1️⃣ Variant – Return All Paths

📌 **Code:** [`ratinamaze.java`](./ratinamaze.java)

**Output:**
`ArrayList<String>`

**Idea:**

* DFS in 4 directions
* Track visited
* Backtrack path

**Complexity:**

* Time: `O(4^(n²))`
* Space: `O(n²)`

---

## 🔵 4. Word Search

**Description:**
Given a grid of characters and a word, determine if the word exists by sequentially adjacent letters.

Adjacency allowed:

* up
* down
* left
* right

Each cell may be used **once** per path.

---

### 1️⃣ Variant – DFS + Backtracking

📌 **Code:** [`WordSearch.java`](./WordSearch.java)

**Output:**
`boolean`

**Idea:**

* Start DFS from every cell
* Match characters sequentially
* Temporarily mark visited
* Explore all 4 directions
* Backtrack after recursion

**Why this belongs here:**

* Classic **grid backtracking**
* Same family as maze & sudoku
* Teaches DFS pruning

**Complexity:**

* Time: `O(N × M × 4^L)`
* Space: `O(L)`

---
