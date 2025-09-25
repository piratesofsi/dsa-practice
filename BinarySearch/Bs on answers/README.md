# 📈 Binary Search on Answers (Striver Sheet)

This folder contains **Java solutions** for problems under **Lecture 2: Binary Search on Answers** from the [Striver A2Z DSA Sheet](https://takeuforward.org/interviews/strivers-sde-sheet-top-coding-interview-problems/).

<p align="center">
  <img src="https://img.shields.io/badge/Binary%20Search%20on%20Answers-11%2F15-brightgreen?style=for-the-badge" />
</p>

---

## ✅ Progress
- Problems Solved: **11 / 15**

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
- **Time Complexity:** O(m × n)  
- **Space Complexity:** O(1)

#### 🔹 Optimized – Binary Search with Helper Function
- Use binary search on `[1, m]` to guess the possible root.  
- Helper function returns:
  - `0` if `mid^n == m`, `1` if `mid^n < m`, `2` if `mid^n > m`.
- Adjust binary search range based on helper. Avoids `Math.pow()` overflow.  
- **Time Complexity:** O(log(m) × n)  
- **Space Complexity:** O(1)  

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
- **Time Complexity:** O(N × log(maxPile))  
- **Space Complexity:** O(1)  

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
- **Time Complexity:** O(N × log(maxDay - minDay))  
- **Space Complexity:** O(1)  

---

### 5. Find the Smallest Divisor Given a Threshold

#### 🔹 Problem Understanding
- Find the **smallest positive integer divisor `d`** such that the sum of `ceil(nums[i] / d)` ≤ threshold.

#### 🔹 Optimized – Binary Search on Answer
- Search space: divisor ∈ `[1, max(nums)]`.
- **Helper:** `checkIf(divisor)` returns sum of divisions for given `divisor`.
- Binary search: decrease `high` if sum ≤ threshold, increase `low` if sum > threshold.
- **Time Complexity:** O(N × log(max(nums)))  
- **Space Complexity:** O(1)  

---

### 6. Least Capacity to Ship Packages in D Days

#### 🔹 Problem Understanding
- You are given an array `weights[]`, where `weights[i]` is the weight of the i-th package.  
- You need to ship all packages in **D days**. Each day, you load the ship with packages in order without breaking them.  
- The capacity of the ship must be at least large enough to handle the heaviest item and at most the sum of all packages.  
- **Goal:** Find the **minimum capacity** of the ship such that all packages can be shipped within `D` days.

#### 🔹 Brute Force – Naive Search
- Try every capacity from the maximum single package weight to the sum of all package weights.  
- For each capacity, check how many days are required using a helper function that simulates the shipping process.  
- Return the first capacity for which the number of days required is ≤ D.  
- **Time Complexity:** O((sum(weights) - max(weights)) × N)  
- **Space Complexity:** O(1)  

#### 🔹 Optimized – Binary Search on Answer
- Use binary search over the range `[max(weights), sum(weights)]`.  
- For each mid capacity, simulate shipping:
  - If the required days ≤ `D`, try smaller capacities (move `high = mid - 1`).  
  - Else, increase capacity (move `low = mid + 1`).  
- Final `low` will be the least capacity required.  
- **Time Complexity:** O(N × log(sum(weights) - max(weights)))  
- **Space Complexity:** O(1)  

---

### 7. Kth Missing Number

#### 🔹 Brute Force 1 – Using HashSet
- Insert all elements of the array into a `HashSet` for quick lookup.  
- Iterate from `1` onwards and count missing numbers.  
- When the count reaches `k`, return that number.  
- **Time Complexity:** O(N + k)  
- **Space Complexity:** O(N)  

#### 🔹 Brute Force 2 – Iteration with Missing Count
- Use the property: missing numbers until index `i` = `arr[i] - (i + 1)`.  
- Traverse array:  
  - If `missingTill(i) >= k`, then answer lies before or at `i`.  
  - Return `k + i` once reached.  
- **Time Complexity:** O(N)  
- **Space Complexity:** O(1)  

#### 🔹 Optimized – Binary Search
- Observation: Number of missing elements before `arr[mid]` = `arr[mid] - (mid + 1)`.  
- Use binary search:  
  - If `missing >= k`, move left (`high = mid - 1`).  
  - Else, move right (`low = mid + 1`).  
- Final answer = `low + k`.  
- **Time Complexity:** O(log N)  
- **Space Complexity:** O(1)  

---

### 8. Aggressive Cows

#### 🔹 Problem Understanding
- You are given `n` stalls (array of positions) and `k` cows.  
- Place the cows in the stalls such that the **minimum distance** between any two cows is maximized.  
- **Goal:** Find the largest minimum distance possible.

#### 🔹 Brute Force
- Try every distance from `1` to `max(stall) - min(stall)`.  
- For each distance, check if it’s possible to place all `k` cows.  
- Return the largest valid distance.  
- **Time Complexity:** O(n × (max-min))  
- **Space Complexity:** O(1)  

#### 🔹 Optimized – Binary Search on Answer
- Sort stall positions first.  
- Search space = `[1, max-min]`.  
- **Helper function:** Checks if all cows can be placed with at least `mid` distance apart.  
- Binary search:  
  - If placement is possible, try larger distance (`low = mid + 1`).  
  - Else, try smaller distance (`high = mid - 1`).  
- Answer will be stored in `high` after the loop ends.  
- **Time Complexity:** O(n log(max-min) + n log n)`  
- **Space Complexity:** O(1)

---

### 9. Book Allocation Problem

#### 🔹 Problem Understanding
- You are given `n` books, each with some pages, and `m` students.  
- The books must be allocated **in order** (no shuffling).  
- Each student gets at least one book.  
- **Goal:** Minimize the **maximum pages allocated** to any student.

#### 🔹 Brute Force – Naive Search
- Try every possible maximum page limit from the maximum pages of a single book to the sum of all book pages.  
- For each limit, use a helper function to calculate how many students are required.  
- Return the first limit for which the number of students ≤ m.  
- **Time Complexity:** O((sum(pages) - max(pages)) × N)  
- **Space Complexity:** O(1)  

#### 🔹 Optimized – Binary Search on Answer
- Search space: `[max(pages[]), sum(pages[])]`.  
- **Helper function (`noOfStudents`)**: Given a limit `mid`, calculate how many students are required.  
  - Start allocating sequentially until sum exceeds `mid`, then assign books to a new student.  
- Binary search:  
  - If `studentsRequired ≤ m`, try smaller limit (`high = mid - 1`).  
  - Else, increase limit (`low = mid + 1`).  
- Final answer is stored in `low`.  
- **Time Complexity:** O(N × log(sum - max))  
- **Space Complexity:** O(1)  

---

### 10. Painter’s Partition Problem

#### 🔹 Problem Understanding
- You have `n` boards of different lengths and `k` painters.  
- Each painter paints continuous boards.  
- Time taken to paint a board = length of board × time per unit.  
- **Goal:** Minimize the time to paint all boards.

#### 🔹 Brute Force – Naive Search
- Try every possible time from the maximum single board length to the sum of all board lengths.  
- For each time, calculate how many painters would be required using a helper function that simulates the process.  
- Return the first time for which painters required ≤ k.  
- **Time Complexity:** O((sum(boards) - max(boards)) × N)  
- **Space Complexity:** O(1)  

#### 🔹 Optimized – Binary Search on Answer
- Search space: `[max(boards), sum(boards)]`.  
- Use a helper function to check how many painters are required for a given time.  
- Binary search:
  - If painters required ≤ `k`, try smaller time (`high = mid - 1`).  
  - Else, increase time (`low = mid + 1`).  
- Final answer is stored in `low`.  
- **Time Complexity:** O(N × log(sum - max))  
- **Space Complexity:** O(1)  

---

### 11. Split Array – Largest Sum

#### 🔹 Problem Understanding
- Given an array `nums[]` and an integer `m`.  
- Split the array into `m` subarrays such that the **largest sum among these subarrays is minimized**.  
- **Goal:** Minimize the maximum subarray sum.

#### 🔹 Brute Force – Naive Search
- Try every possible sum limit from the maximum single element to the sum of all elements.  
- For each limit, calculate how many subarrays would be required using a helper function that simulates the process.  
- Return the first limit for which subarrays required ≤ m.  
- **Time Complexity:** O((sum(nums) - max(nums)) × N)  
- **Space Complexity:** O(1)  

#### 🔹 Optimized – Binary Search on Answer
- Search space: `[max(nums), sum(nums)]`.  
- Use a helper function to check how many subarrays are required for a given sum limit.  
- Binary search:
  - If subarrays required ≤ `m`, try smaller sum (`high = mid - 1`).  
  - Else, increase sum (`low = mid + 1`).  
- Answer is stored in `low`.  
- **Time Complexity:** O(N × log(sum - max))  
- **Space Complexity:** O(1)  
