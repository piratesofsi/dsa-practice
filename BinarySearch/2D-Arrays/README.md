# 🚀 Striver A2Z DSA Sheet Progress

## 🎯 Topic: Binary Search - 2D Matrix Problems

This section focuses on the application of Binary Search techniques to solve problems involving sorted 2D matrices.

### Progress Tracker

We have a total of **5** problems in this sub-topic.

**Progress:** 4/5 Solved (80%)

| Status | Solved Count | Total | Percentage |
| :---: | :---: | :---: | :---: |
| ✅ | 4 | 5 | 80% |

**Progress Bar:**

<p align="center">
  <img src="https://progress-bar.dev/40/" />
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

---

## 💻 Problem SR-2: Search in a 2D Matrix II

### 📜 Problem Statement

You are given an $m \times n$ integer matrix `matrix` and an integer `target`. The matrix has the following properties:
1. Each row is sorted in ascending order from left to right.
2. Each column is sorted in ascending order from top to bottom.

The goal is to write a function that returns `true` if `target` is in the matrix or `false` otherwise.

### 💡 Approaches

We explore three different methods to solve this problem, improving step by step:

---

### 1️⃣ Brute Force Approach

#### Intuition
Check every element one by one until we either find the `target` or exhaust the matrix.

#### Time Complexity
$$O(m \cdot n)$$

#### Space Complexity
$$O(1)$$

**Code File:** `searchin2Dmatrix2brute.java`

---

### 2️⃣ Row-wise Binary Search Approach (Better)

#### Intuition
Since each row is sorted, perform a Binary Search in each row individually until we either find the `target` or finish scanning all rows.

#### Time Complexity
$$O(m \cdot \log n)$$

#### Space Complexity
$$O(1)$$

**Code File:** `searchin2Dmatrix2better.java`

---

### 3️⃣ Optimal Staircase Search Approach

#### Intuition
Start from the **top-right corner** (or bottom-left).  
- If the current element equals the `target`, return `true`.  
- If the current element is greater, move left.  
- If it is smaller, move down.  
This way, we eliminate one row or column at every step.

#### Time Complexity
$$O(m + n)$$

#### Space Complexity
$$O(1)$$

**Code File:** `searchin2Dmatrix2optimal.java`

---


## 💻 Problem SR-3: Peak Element in a 2D Matrix

### 📜 Problem Statement

You are given an $m \times n$ integer matrix where each row and each column may or may not be sorted.  
A **peak element** is an element that is **strictly greater** than its adjacent neighbors (up, down, left, right).  
Your task is to find the position (row index and column index) of any one peak element.

### 💡 Approaches

We explore three approaches for this problem: Brute Force, Better (Largest Element), and Binary Search.

#### 1️⃣ Brute Force Approach

**Intuition:** Check every element and compare with its neighbors to find a peak.  

**Time Complexity:** $O(m \cdot n)$  
**Space Complexity:** $O(1)$  

**Code File:** `peak2dmatrixbrute.java`

#### 2️⃣ Better Approach (Largest Element)

**Intuition:** The largest element in the matrix will always be a peak.  
Scan the matrix once to find this maximum element and return its position.  

**Time Complexity:** $O(m \cdot n)$  
**Space Complexity:** $O(1)$  

**Code File:** `peak2dmatrixbetter.java`

#### 3️⃣ Binary Search Approach (Optimal)

**Intuition:** Use Binary Search on columns to narrow down the search efficiently.  

**Time Complexity:** $O(m \cdot \log n)$  
**Space Complexity:** $O(1)$  

**Code File:** `peak2dmatrixoptimal.java`

---

## 💻 Problem SR-4: Row with Maximum Number of 1’s

### 📜 Problem Statement

You are given a binary matrix of size $m \times n$ where **each row is sorted in non-decreasing order**.  
Find the **row index with the maximum number of 1’s** and return the count of 1’s in that row.  
If multiple rows have the same number of 1’s, return the smallest row index.

### 💡 Approaches

We explore two approaches: Brute Force and Optimal Binary Search.

#### 1️⃣ Brute Force Approach

**Intuition:** For each row, find the first occurrence of `1` using linear search and calculate number of ones.  

**Time Complexity:** $O(m \cdot n)$  
**Space Complexity:** $O(1)$  

**Code File:** `rowwithmaximumonesbrute.java`

#### 2️⃣ Optimal Binary Search Approach

**Intuition:** Since rows are sorted, use Binary Search to find the first occurrence of `1`.  

**Time Complexity:** $O(m \cdot \log n)$  
**Space Complexity:** $O(1)$  

**Code File:** `rowwithmaximumonesoptimal.java`

---

## 💻 Problem SR-5: [Next Problem Placeholder]

*(Will be added once solved)*

