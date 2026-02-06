

# 📚 Monotonic Stack – PatternWise

This repository focuses on mastering **monotonic stack patterns** instead of memorizing solutions.

Instead of jumping to code, we train the brain to recognize:

* 🔼 **Monotonic Increasing Stack**
* 🔽 **Monotonic Decreasing Stack**
* Traversal direction (left → right / right → left)
* Circular arrays (`i % n`)
* Index vs value stacks
* Contribution-based problems

Classic loop:

```java
while (!stack.isEmpty() && stack.peek() <= curr) {
    stack.pop();
}
```

When this clicks — half of stack problems become mechanical 😤🔥

---

# 🤔 What Is a Monotonic Stack?

A **monotonic stack** is a stack that keeps elements in a strict order.

### 🔼 Monotonic Increasing Stack

Used for **next smaller** problems.

```java
while (!stack.isEmpty() && stack.peek() >= curr) {
    stack.pop();
}
```

---

### 🔽 Monotonic Decreasing Stack

Used for **next greater** problems.

```java
while (!stack.isEmpty() && stack.peek() <= curr) {
    stack.pop();
}
```


---

## 📊 Progress Table

| # | Problem Name                   | Approaches | Difficulty | Jump To                                    |
| - | ------------------------------ | ---------- | ---------- | ------------------------------------------ |
| 1 | Next Greater Element I         | 2          | Easy       | [Go](#-1-next-greater-element-i)           |
| 2 | Next Greater Element II        | 2          | Medium     | [Go](#-2-next-greater-element-ii-circular) |
| 3 | Next Smaller Element (Right)   | 2          | Easy       | [Go](#-3-next-smaller-element-right)       |
| 4 | Count NGE to Right             | 1          | Easy       | [Go](#-4-count-nge-to-right)               |
| 5 | Sum of Subarray Minimums       | 2          | Medium     | [Go](#-5-sum-of-subarray-minimums)         |
| 6 | Largest Rectangle in Histogram | 2          | Hard       | [Go](#-6-largest-rectangle-in-histogram)   |
| 7 | Asteroid Collision             | 1          | Medium     | [Go](#-7-asteroid-collision)               |
| 8 | Remove K Digits                | 1          | Medium     | [Go](#-8-remove-k-digits)                  |

---


```

If you want to go even harder 😏:

👉 add **Problem Links (LeetCode/GFG)** column
👉 add **Status / Solved / Revision Needed** column
👉 add **Date Completed**
👉 add **Tags** (Greedy / Contribution / Stack)

this repo is already screaming discipline 📈😤


---

# 🔵 1. Next Greater Element I

## 📌 Description

Given two arrays `nums1` and `nums2`, for every element in `nums1`, find the **next greater element to its right in nums2**.

If none exists → return `-1`.

---

## 🐌 Approach 1 — Brute Force

📌 **Code:**
[NextGreaterBrute.java](NextGreaterBrute.java)

### 🔍 Algorithm

1. For each element in `nums1`.
2. Locate its index in `nums2`.
3. Scan to the right until a greater element is found.

### ⏱ Complexity

* Time: `O(N²)`
* Space: `O(1)`

---

## ✅ Approach 2 — Optimized (Monotonic Decreasing Stack + HashMap)

📌 **Code:**
[NextGreaterOptimized.java](NextGreaterOptimized.java)

### 🔍 Algorithm

1. Traverse `nums2` from right to left.
2. Maintain a monotonic decreasing stack.
3. Pop elements ≤ current.
4. Store next greater in hashmap.
5. Build result for `nums1`.

### ⏱ Complexity

* Time: `O(N)`
* Space: `O(N)`

---

---

# 🔵 2. Next Greater Element II (Circular)

## 📌 Description

Given a circular array, find the next greater element for every index.

---

## 🐌 Approach 1 — Brute Simulation

📌 **Code:**
[NextGreater2TwoPass.java](NextGreater2TwoPass.java)

### 🔍 Algorithm

1. Run next greater normally.
2. Run again to resolve circular cases.

### ⏱ Complexity

* Time: `O(N)`
* Space: `O(N)`

---

## ✅ Approach 2 — Optimized (2N Traversal)

📌 **Code:**
[NextGreater2Optimized.java](NextGreater2Optimized.java)

### 🔍 Algorithm

1. Traverse from `2N-1 → 0`.
2. Use `i % n`.
3. Maintain monotonic decreasing stack.
4. Fill answers when `i < n`.

### ⏱ Complexity

* Time: `O(N)`
* Space: `O(N)`

---

---

# 🔵 3. Next Smaller Element (Right)

## 📌 Description

For every element, find the **next smaller element on the right**.

---

## 🐌 Approach 1 — Brute Force

📌 **Code:**
[NextSmallerBrute.java](NextSmallerBrute.java)

### 🔍 Algorithm

1. For every index.
2. Scan to the right for smaller.

### ⏱ Complexity

* Time: `O(N²)`
* Space: `O(1)`

---

## ✅ Approach 2 — Optimized (Monotonic Increasing Stack)

📌 **Code:**
[NextSmallerOptimized.java](NextSmallerOptimized.java)

### 🔍 Algorithm

1. Traverse from right.
2. Pop elements ≥ current.
3. Stack top is answer.

### ⏱ Complexity

* Time: `O(N)`
* Space: `O(N)`

---

---

# 🔵 4. Count NGE to Right

## 📌 Description

For each query index, count how many elements greater than it appear to its right.

---

## 🐌 Approach — Brute Scan

📌 **Code:**
[noOfNgestoRight.java](noOfNgestoRight.java)

### 🔍 Algorithm

1. For each query.
2. Scan to the right.
3. Count larger values.

### ⏱ Complexity

* Time: `O(Q × N)`
* Space: `O(1)`

---

---

# 🔵 5. Sum of Subarray Minimums

## 📌 Description

Return the sum of minimum values across all subarrays.

---

## 🐌 Approach 1 — Brute Force

📌 **Code:**
[SumSubarrayMins_Brute.java](SumSubarrayMins_Brute.java)

### 🔍 Algorithm

1. Generate all subarrays.
2. Track minimum.
3. Add to sum.

### ⏱ Complexity

* Time: `O(N²)`
* Space: `O(1)`

---

## ✅ Approach 2 — Optimized (Contribution + NSL/NSR)

📌 **Code:**
[SumSubarrayMins_Optimized.java](SumSubarrayMins_Optimized.java)

### 🔍 Algorithm

1. Compute previous smaller.
2. Compute next smaller.
3. Each element contributes:

```
arr[i] × leftCount × rightCount
```

### ⏱ Complexity

* Time: `O(N)`
* Space: `O(N)`

---

---

# 🔵 6. Largest Rectangle in Histogram

## 📌 Description

Find the largest rectangular area inside a histogram.

---

## 🐌 Approach 1 — Brute Force

📌 **Code:**
[LargestRectangleHistogram_Brute.java](LargestRectangleHistogram_Brute.java)

### 🔍 Algorithm

1. Fix left index.
2. Expand right.
3. Track minimum height.

### ⏱ Complexity

* Time: `O(N²)`
* Space: `O(1)`

---

## ✅ Approach 2 — Optimized (NSL + NSR)

📌 **Code:**
[LargestRectangleHistogram_Optimized.java](LargestRectangleHistogram_Optimized.java)

### 🔍 Algorithm

1. Compute next smaller left/right.
2. Width = `right - left - 1`.
3. Area = `height × width`.

### ⏱ Complexity

* Time: `O(N)`
* Space: `O(N)`

---

---

# 🔵 7. Asteroid Collision

## 📌 Description

Simulate collisions between asteroids moving left and right.

---

## ✅ Approach — Stack Simulation

📌 **Code:**
[AsteroidCollision.java](AsteroidCollision.java)

### 🔍 Algorithm

1. Push positive asteroids.
2. When negative appears:

   * Pop smaller positives.
   * Destroy equal ones.
3. Push if survives.

### ⏱ Complexity

* Time: `O(N)`
* Space: `O(N)`

---

---

# 🔵 8. Remove K Digits

## 📌 Description

Remove `k` digits from a number string to form the smallest possible number.

---

## ✅ Approach — Greedy + Monotonic Stack

📌 **Code:**
[RemoveKDigits.java](RemoveKDigits.java)

### 🔍 Algorithm

1. Traverse digits.
2. Pop bigger digits while `k > 0`.
3. Remove remaining from end.
4. Strip leading zeros.

### ⏱ Complexity

* Time: `O(N)`
* Space: `O(N)`

---

