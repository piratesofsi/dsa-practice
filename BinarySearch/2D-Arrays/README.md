# 🚀 Striver A2Z DSA Sheet Progress

## 🎯 Topic: Binary Search - 2D Matrix Problems

This section covers essential problems involving the application of Binary Search techniques on 2D matrices, typically leveraging properties of sorted rows and overall structure.

### Progress Tracker

We have a total of **5** problems in this sub-topic.

**Progress:** 3/5 Solved (60%)

| Status | Solved Count | Total | Percentage |
| :---: | :---: | :---: | :---: |
| ✅ | 3 | 5 | 60% |

**Progress Bar:**

<p align="center">
  <img src="https://progress-bar.dev/60/" />
</p>

---

## 💻 Problem: Search in a 2D Matrix (Type I)

### 📜 Problem Description

You are given an $m \times n$ integer matrix `matrix` and an integer `target`.

The matrix has the following two properties:
1.  Each row is sorted in non-decreasing order.
2.  The first integer of each row is greater than the last integer of the previous row.

The goal is to write a function that returns `true` if `target` is in the matrix or `false` otherwise.

### 💡 Approaches to Solve the Problem

We explore three different methods to solve this problem, ranging from the straightforward Brute Force to the most efficient Optimal Binary Search.

---

### 1️⃣ Brute Force Approach (Linear Search)

#### Intuition
The simplest way to search for an element is to check every element. We iterate through every cell of the matrix and compare its value with the `target`.

#### Approach
The solution uses a nested loop structure to traverse the entire matrix. If `matrix[i][j]` equals the `target`, we immediately return `true`.

#### Complexity
Let $m$ be the number of rows and $n$ be the number of columns.
- **Time Complexity:** $$O(m \cdot n)$$ - In the worst case, every element must be checked.
- **Space Complexity:** $$O(1)$$ - Constant extra space is used.

**Code File:** `searchin2dmatrixbrute.java`

---

### 2️⃣ Row-wise Binary Search Approach (Better)

#### Intuition
We use the matrix properties to first identify the *potential* row that could contain the target by checking the row boundaries (`matrix[i][0]` and `matrix[i][n-1]`). Once the row is found, we apply Binary Search only to that specific row.

#### Approach
1.  Iterate through the rows.
2.  Check if `target` falls between the first and last element of the current row.
3.  If it falls in the range, execute a standard **Binary Search** on that row's 1D array.
4.  If the target is found, return `true`; otherwise, continue or stop if the target is smaller than the current row's first element.

#### Complexity
Let $m$ be the number of rows and $n$ be the number of columns.
- **Time Complexity:** $$O(m + \log n)$$ - Time for checking up to $m$ rows plus the time for one binary search on a row of length $n$.
- **Space Complexity:** $$O(1)$$ - Constant extra space is used.

**Code File:** `searchin2dmatrixbetter.java`

---

### 3️⃣ Optimal Flattened Binary Search Approach (Optimal)

#### Intuition
The matrix's properties ensure it is equivalent to a single fully sorted 1D array of size $N = m \cdot n$. We can perform the most efficient search by executing one Binary Search over this conceptual array.

#### Approach
1.  Treat the search space as a single 1D array from index $0$ to $m \cdot n - 1$.
2.  In the Binary Search loop, map the 1D index `mid` back to the 2D coordinates:
    * **Row Index:** `row = mid / n`
    * **Column Index:** `col = mid % n`
3.  Perform standard Binary Search comparisons on `matrix[row][col]`.

#### Complexity
Let $m$ be the number of rows and $n$ be the number of columns. Total elements $N = m \cdot n$.
- **Time Complexity:** $$O(\log(m \cdot n))$$ - One single logarithmic search.
- **Space Complexity:** $$O(1)$$ - Constant extra space is used.

**Code File:** `searchin2dmatrixoptimal.java`
