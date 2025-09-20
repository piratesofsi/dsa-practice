# 📈 Binary Search on Answers (Striver Sheet)

This folder contains **Java solutions** for problems under **Lecture 2: Binary Search on Answers** from the [Striver A2Z DSA Sheet](https://takeuforward.org/interviews/strivers-sde-sheet-top-coding-interview-problems/).

<p align="center">
  <img src="https://img.shields.io/badge/Binary%20Search%20on%20Answers-6%2F14-yellow?style=for-the-badge" />
</p>

---

## ✅ Progress
- Problems Solved: **6 / 14**

---

## 📌 Problems & Approaches

### 1. Find Square Root of a Number

#### 🔹 Brute Force 1 – Linear Search
- Start from `1` and go up until `i * i > n`.  
- The last valid `i` is the floor of `sqrt(n)`.  
- **Time Complexity:** O(√n)  
- **Space Complexity:** O(1)  

#### 🔹 Brute Force 2 – Using `Math.sqrt()`
- Directly use Java’s built-in function `Math.sqrt(n)`.  
- Returns a floating-point number, so take the floor if an integer result is required.  
- **Time Complexity:** O(1)  
- **Space Complexity:** O(1)  

#### 🔹 Optimized – Binary Search
- Apply binary search on the range `[0, n]`.  
- Compare `mid * mid` with `n`:  
  - If `mid * mid == n`, return mid.  
  - If `mid * mid < n`, `mid` could be the answer, store it and move `low = mid + 1`.  
  - Else, `mid * mid > n`, move `high = mid - 1`.  
- Keep track of the last valid `mid` as the floor of `sqrt(n)`.  
- **Time Complexity:** O(log n)  
- **Space Complexity:** O(1)  

---

### 2. Find the Nth Root of a Number `m`

#### 🔹 Brute Force
- Iterate from `1` to `m`. For each number `i`, check if `i^n` equals `m`.
- **Time Complexity:** $O(m \times n)$
- **Space Complexity:** $O(1)$

#### 🔹 Optimized – Binary Search with Helper Function
- Use binary search on `[1, m]` to guess the possible root.  
- Helper function returns:
  - `0` if `mid^n == m`, `1` if `mid^n < m`, `2` if `mid^n > m`.
- Adjust binary search range based on helper. Avoids `Math.pow()` overflow.  
- **Time Complexity:** $O(log(m) \times n)$
- **Space Complexity:** $O(1)$

---

### 3. Koko Eating Bananas

#### 🔹 Problem Understanding
- Given `piles` of bananas and `h` hours.  
- Koko eats at a speed `k` bananas/hour.  
- Each pile takes `ceil(pile / k)` hours to finish.  
- **Goal:** Find the **minimum `k`** such that Koko can eat all bananas in ≤ `h` hours.

#### 🔹 Optimized – Binary Search on Answer
- Search space: speed `k` ∈ `[1, max(pile)]`.
- **Helper function:** Checks if Koko can finish within `h` hours.
- Binary search: decrease `high` if possible, increase `low` if too slow.
- **Time Complexity:** $O(N \log(\text{maxPile}))$
- **Space Complexity:** $O(1)$

---

### 4. Minimum Days to Make `m` Bouquets

#### 🔹 Problem Understanding
- Make `m` bouquets using `k` adjacent bloomed flowers.
- `bloomDay[i]` is the bloom day of flower `i`.
- **Goal:** Minimum number of days to make `m` bouquets.

#### 🔹 Optimized – Binary Search on Answer
- Search days `[min(bloomDay), max(bloomDay)]`.
- **Helper:** `possible(day)` checks if `m` bouquets can be formed.
- Binary search: decrease `high` if possible, increase `low` if too early.
- **Pre-check:** If total flowers < `m * k`, return -1.
- **Time Complexity:** $O(N \log(\text{maxDay} - \text{minDay}))$
- **Space Complexity:** $O(1)$

---

### 5. Find the Smallest Divisor Given a Threshold

#### 🔹 Problem Understanding
- Find the **smallest positive integer divisor `d`** such that the sum of `ceil(nums[i] / d)` ≤ threshold.

#### 🔹 Optimized – Binary Search on Answer
- Search space: divisor ∈ `[1, max(nums)]`.
- **Helper:** `checkIf(divisor)` returns sum of divisions for given `divisor`.
- Binary search: decrease `high` if sum ≤ threshold, increase `low` if sum > threshold.
- **Time Complexity:** $O(N \log(\text{max(nums)}))$
- **Space Complexity:** $O(1)$

---

### 6. Minimum Capacity to Finish Work / Smallest Divisor Given `d` Days

#### 🔹 Problem Understanding
- You have `nums` array (work/items) and `d` days.  
- Find the **minimum capacity per day** to finish all work/items within `d` days.

#### 🔹 Brute Force
- Test capacities from `1` to `max(nums)`.
- For each capacity, calculate total days: `days += ceil(nums[i] / capacity)`.
- First capacity ≤ `d` is the answer.
- **Time Complexity:** $O(N \times \text{max(nums)})$
- **Space Complexity:** $O(1)$

#### 🔹 Optimized – Binary Search on Answer
- **Observation:** Increasing capacity reduces total days (monotonic property).
- Search space: `[1, max(nums)]`.
- **Helper:** `canFinish(capacity)` → returns `true` if `sum(ceil(nums[i] / capacity)) <= d`.
- Binary Search Steps:
  1. `low = 1`, `high = max(nums)`.
  2. While `low <= high`:
     - `mid = low + (high - low) / 2`.
     - If `canFinish(mid)` → store `mid` and try smaller capacity: `high = mid - 1`.
     - Else → capacity too small: `low = mid + 1`.
  3. `low` (or last stored valid `mid`) = **minimum capacity / smallest divisor**.
- **Time Complexity:** $O(N \log(\text{max(nums)}))$
- **Space Complexity:** $O(1)$
