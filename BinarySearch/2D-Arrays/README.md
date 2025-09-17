# 📈 Binary Search on Answers (Striver Sheet)

This folder contains **Java solutions** for problems under **Lecture 2: Binary Search on Answers** from the [Striver A2Z DSA Sheet](https://takeuforward.org/interviews/strivers-sde-sheet-top-coding-interview-problems/).

<p align="center">
  <img src="https://img.shields.io/badge/Binary%20Search%20on%20Answers-2%2F14-yellow?style=for-the-badge" />
</p>

---

## ✅ Progress
- Problems Solved: **2 / 14**

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

### 2. Find the Nth Root of a Number `m`

#### 🔹 Brute Force
- Multiply `mid` exactly `n` times (instead of using `Math.pow`).  
- Stop early if result exceeds `m` to avoid unnecessary multiplications.  
- **Time Complexity:** O(n) per check × O(log m) binary search steps → O(n · log m).  
- **Space Complexity:** O(1).  

#### 🔹 Optimized – Binary Search with Helper Function
- Use binary search on range `[1, m]` to guess the possible root.  
- For each mid:  
  - Compute `mid^n` using a loop (not `Math.pow`).  
  - Return **0** if `mid^n == m`.  
  - Return **1** if `mid^n < m`.  
  - Return **2** if `mid^n > m`.  
- Adjust binary search based on result.  

#### 🔹 Why Not `Math.pow()`?
- `Math.pow()` works with floating-point numbers, which can lead to precision errors for large inputs.  
- Our helper `function()` ensures:  
  - Safe integer multiplication.  
  - Early exit if the result already exceeds `m`.  
  - Correct comparisons (equal, less, greater).  

#### 🔹 Notes I Understood
- `n` is the **power** (exponent), not the number itself.  
- The loop multiplies `mid` `n` times.  
- If during multiplication `ans > m`, we return immediately (no need for further iterations).  
- If exactly equal, return success.  
- If smaller even after all iterations, that means `mid` is too small.  
- This prevents unnecessary work and avoids overflow.  

---

#### 📝 Dry Run Example

Find `3rd root of 27` → (n = 3, m = 27)

- Search space: `[1, 27]`

1. `low = 1, high = 27`  
   `mid = 14`  
   - Compute `14^3 = 2744` → exceeds 27 → return 2 → move `high = 13`

2. `low = 1, high = 13`  
   `mid = 7`  
   - Compute `7^3 = 343` → exceeds 27 → return 2 → move `high = 6`

3. `low = 1, high = 6`  
   `mid = 3`  
   - Compute:  
     - 1st iteration: ans = 3  
     - 2nd iteration: ans = 9  
     - 3rd iteration: ans = 27 → equal to m → return 0 → **answer = 3**

✅ Final Answer = 3

---
