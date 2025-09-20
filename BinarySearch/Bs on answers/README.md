# 📈 Binary Search on Answers (Striver Sheet)

This folder contains **Java solutions** for problems under **Lecture 2: Binary Search on Answers** from the [Striver A2Z DSA Sheet](https://takeuforward.org/interviews/strivers-sde-sheet-top-coding-interview-problems/).

<p align="center">
  <img src="https://img.shields.io/badge/Binary%20Search%20on%20Answers-5%2F14-yellow?style=for-the-badge" />
</p>

---

## ✅ Progress
- Problems Solved: **5 / 14**

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
  - If `mid * mid < n`, `mid` could be the answer, so store it and move `low = mid + 1` to search for a larger potential answer.  
  - Else, `mid * mid > n`, so `mid` is too large, move `high = mid - 1`.  
- Keep track of the last valid `mid` as the floor of `sqrt(n)`.  
- **Time Complexity:** O(log n)  
- **Space Complexity:** O(1)  

---

### 2. Find the Nth Root of a Number `m`

#### 🔹 Brute Force
- Iterate from `1` to `m`. For each number `i`, check if `i^n` equals `m`.
- The `power` function can be implemented with a loop that multiplies `i` `n` times.
- **Time Complexity:** $O(m \times n)$
- **Space Complexity:** $O(1)$

#### 🔹 Optimized – Binary Search with Helper Function
- Use binary search on the range `[1, m]` to guess the possible root.  
- For each `mid` value, use a helper function to compute `mid^n`.
- This helper function should return:
  - `0` if `mid^n == m`.  
  - `1` if `mid^n < m`.  
  - `2` if `mid^n > m`.
- Adjust the binary search range based on the helper function's return value. This approach avoids using `Math.pow()` and handles potential overflow by stopping early if the product exceeds `m`.
- **Time Complexity:** $O(log(m) \times log(m))$ or $O(log(m) \times n)$ depending on the power function implementation.
- **Space Complexity:** $O(1)$

---

### 3. Koko Eating Bananas

#### 🔹 Problem Understanding
- Given `piles` of bananas and `h` hours.  
- Koko eats at a speed `k` bananas/hour.  
- Each pile takes `ceil(pile / k)` hours to finish.  
- **Goal:** Find the **minimum `k`** such that Koko can eat all bananas in ≤ `h` hours.

#### 🔹 Brute Force
- Check all possible speeds from `1` to `max(pile)`.  
- For each speed, calculate the total hours needed.
- The first speed that satisfies the condition (`totalHours <= h`) is the answer.
- **Time Complexity:** $O(\text{max(pile)} \times N)$ where $N$ is the number of piles. This is too slow for large inputs.
- **Space Complexity:** $O(1)$

#### 🔹 Optimized – Binary Search on Answer
- The search space for the answer is the possible speed `k`, which ranges from `1` to `max(pile)`.
- The problem has a **monotonic property**: as the speed `k` increases, the total hours required will decrease.
- We perform a binary search on the speed `k`. For a `mid` speed, we check if Koko can finish within `h` hours.
- If `totalHours(mid) <= h`, `mid` is a possible answer. We store it and try a smaller speed to find the minimum: `high = mid - 1`.
- If `totalHours(mid) > h`, the speed is too slow. We need to increase it: `low = mid + 1`.
- **Time Complexity:** $O(N \log(\text{maxPile}))$
- **Space Complexity:** $O(1)$

---

### 4. Minimum Days to Make `m` Bouquets

#### 🔹 Problem Understanding
- You need to make `m` bouquets using `k` adjacent bloomed flowers for each bouquet.
- `bloomDay[i]` is the day a flower at index `i` blooms.
- **Goal:** Find the **minimum number of days** to make `m` bouquets.

#### 🔹 Brute Force
- The search space for the answer is the number of days, ranging from the minimum bloom day to the maximum bloom day.
- Iterate through each day `d` in this range.
- For each day, check if it's possible to make `m` bouquets by counting adjacent bloomed flowers.
- The first day that satisfies the condition is the answer. If no such day exists, return -1.
- **Time Complexity:** $O((\text{maxDay} - \text{minDay}) \times N)$
- **Space Complexity:** $O(1)$

#### 🔹 Optimized – Binary Search on Answer
- The problem has a **monotonic property**: if we can make `m` bouquets on day `d`, we can also make them on any day after `d`.
- We perform binary search on the range of days `[min(bloomDay), max(bloomDay)]`.
- **Helper function:** A `possible(day)` function checks if we can form `m` bouquets on that specific `day`.
- In the binary search, if `possible(mid)` returns `true` (meaning `mid` is a valid day), we store it as a potential answer and try to find a smaller day: `high = mid - 1`.
- If `possible(mid)` returns `false`, `mid` is too small, so we need more time for the flowers to bloom: `low = mid + 1`.
- The loop terminates when `low` is the smallest valid day.
- **Pre-check:** If the total number of flowers is less than `m * k`, it's impossible to form the bouquets. Return -1 immediately to handle this edge case.
- **Time Complexity:** $O(N \log(\text{maxDay} - \text{minDay}))$
- **Space Complexity:** $O(1)$

---

### 5. Find the Smallest Divisor Given a Threshold

#### 🔹 Problem Understanding
- Find the **smallest positive integer divisor `d`** such that the sum of `ceil(nums[i] / d)` is less than or equal to `threshold`.

#### 🔹 Brute Force
- The search space for the divisor is from `1` to `max(nums)`.
- Iterate through each possible divisor `d` in this range.
- For each `d`, calculate the sum of divisions `(num + d - 1) / d` (which is an efficient way to calculate `ceil(num / d)`).
- The first `d` that satisfies the condition is the answer.
- **Time Complexity:** $O(\text{max(nums)} \times N)$
- **Space Complexity:** $O(1)$

#### 🔹 Optimized – Binary Search on Answer
- The problem has a **monotonic property**: as the divisor `d` increases, the sum of the divisions decreases.
- We can perform a binary search on the range of divisors `[1, max(nums)]`.
- **Helper function:** A `checkIf(divisor)` function calculates the total sum of divisions for a given `divisor`.
- In the binary search, if `checkIf(mid)` is less than or equal to `threshold`, `mid` is a valid divisor. We store it and try a smaller one: `high = mid - 1`.
- If `checkIf(mid)` is greater than `threshold`, the divisor `mid` is too small, so we need a larger one: `low = mid + 1`.
- The final answer is the `low` value after the loop completes.
- **Time Complexity:** $O(N \log(\text{max(nums)}))$
- **Space Complexity:** $O(1)$
