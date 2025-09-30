# 🚀 Striver A2Z DSA Sheet Progress

## 🎯 Topic: Binary Search - 2D Matrix Problems

This section focuses on the application of Binary Search techniques to solve problems involving sorted 2D matrices.

### Progress Tracker

We have a total of **5** problems in this sub-topic.

**Progress:** 1/5 Solved (20%)

| Status | Solved Count | Total | Percentage |
| :---: | :---: | :---: | :---: |
| ✅ | 1 | 5 | 20% |

**Progress Bar:**

<p align="center">
  <img src="https://progress-bar.dev/60/" />
</p>

---

## 💻 Problem SR-1: Search in a 2D Matrix

### 📜 Problem Statement

You are given an $m \times n$ integer matrix `matrix` and an integer `target`.

The matrix has the following two properties:
1.  Each row is sorted in non-decreasing order.
2.  The first integer of each row is greater than the last integer of the previous row.

The goal is to write a function that returns `true` if `target` is in the matrix or `false` otherwise.

### 💡 Approaches

We explore three different methods to solve this problem, ranging from the straightforward Brute Force to the most efficient Optimal Binary Search.

---

### 1️⃣ Brute Force Approach (Linear Search)

#### Intuition
The most straightforward method is to traverse every single element in the matrix and check if it matches the `target`.

#### Time Complexity
Let $m$ be the number of rows and $n$ be the number of columns.
$$O(m \cdot n)$$

#### Space Complexity
$$O(1)$$

**Code File:** `searchin2dmatrixbrute.java`

---

### 2️⃣ Row-wise Binary Search Approach (Better)

#### Intuition
Since each row is sorted, we can optimize the search. First, we identify the potential row where the `target` could exist by checking the row boundaries. Then, we perform a Binary Search only on that specific row.

#### Time Complexity
Let $m$ be the number of rows and $n$ be the number of columns.
$$O(m + \log n)$$

#### Space Complexity
$$O(1)$$

**Code File:** `searchin2dmatrixbetter.java`

---

### 3️⃣ Optimal Flattened Binary Search Approach (Optimal)

#### Intuition
The matrix's properties ensure it is equivalent to a single fully sorted 1D array of size $N = m \cdot n$. We can perform the most efficient search by executing one Binary Search over this conceptual array, mapping the 1D index back to 2D coordinates using integer division and modulo.

#### Time Complexity
Let $m$ be the number of rows and $n$ be the number of columns. Total elements $N = m \cdot n$.
$$O(\log(m \cdot n))$$

#### Space Complexity
$$O(1)$$

**Code File:** `searchin2dmatrixoptimal.java`
