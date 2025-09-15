# 📈 Binary Search on Answers (Striver Sheet)

This folder contains **Java solutions** for problems under **Lecture 2: Binary Search on Answers** from the [Striver A2Z DSA Sheet](https://takeuforward.org/interviews/strivers-sde-sheet-top-coding-interview-problems/).

<p align="center">
  <img src="https://img.shields.io/badge/Binary%20Search%20on%20Answers-1%2F14-yellow?style=for-the-badge" />
</p>

---

## ✅ Progress
- Problems Solved: **1 / 14**

---

## 📌 Problems & Approaches

### 1. Find Square Root of a Number

#### 🔹 Brute Force 1 – Linear Search
- Start from `1` and go up until `i * i > n`.  
- Last valid `i` is the floor of sqrt(n).  
- **Time Complexity:** O(√n)  
- **Space Complexity:** O(1)  

#### 🔹 Brute Force 2 – Using `Math.sqrt()`
- Directly use Java’s built-in function `Math.sqrt(n)`.  
- Returns floating point, so take floor if integer result is required.  
- **Time Complexity:** O(1)  
- **Space Complexity:** O(1)  

#### 🔹 Optimized – Binary Search
- Apply binary search on range `[0, n]`.  
- Compare `mid * mid` with `n`:  
  - If `mid * mid == n`, return mid.  
  - If `mid * mid < n`, move `low = mid + 1`.  
  - Else, move `high = mid - 1`.  
- Keep track of the last valid mid as the floor sqrt.  
- **Time Complexity:** O(log n)  
- **Space Complexity:** O(1)  

---
