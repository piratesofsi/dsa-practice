

# 📚 Monotonic Stack – PatternWise

This section focuses on mastering **monotonic stack patterns** instead of memorizing solutions.

The goal is to recognize:

* 🔼 **Monotonic Increasing Stack**
* 🔽 **Monotonic Decreasing Stack**
* Traversing from **left → right** vs **right → left**
* Handling **circular arrays**
* Mapping **indices vs values**
* The classic loop:

```
while (!stack.isEmpty() && stack.peek() <= curr) {
    stack.pop();
}
```

Once this clicks — half of stack problems become mechanical 😤🔥

---

## 📊 Progress Table

| # | Problem Name                 | Approaches | Difficulty | Jump To                                    |
| - | ---------------------------- | ---------- | ---------- | ------------------------------------------ |
| 1 | Next Greater Element I       | 2          | Easy       | [Go](#-1-next-greater-element-i)           |
| 2 | Next Greater Element II      | 2          | Medium     | [Go](#-2-next-greater-element-ii-circular) |
| 3 | Next Smaller Element (Right) | 2          | Easy       | [Go](#-3-next-smaller-element-right)       |

---

---

## 🔵 1. Next Greater Element I

**Description:**

Given two arrays `nums1` and `nums2`, for each element in `nums1`, find the **next greater element to its right** in `nums2`.

If none exists → return `-1`.

---

### 1️⃣ Optimized – Monotonic Decreasing Stack + HashMap

📌 **Code:**
[NextGreaterOptimized.java](NextGreaterOptimized.java)

**Idea:**

* Traverse `nums2` from right
* Maintain a **monotonic decreasing stack**
* Pop until a greater element is found
* Store answers in a hashmap
* Fill results for `nums1`

**Complexity:**

* Time: `O(N)`
* Space: `O(N)`

---

### 2️⃣ Brute Force

📌 **Code:**
[NextGreaterBrute.java](NextGreaterBrute.java)

**Idea:**

* For each element in `nums1`
* Scan to the right in `nums2`

**Complexity:**

* Time: `O(N²)`
* Space: `O(1)`

---

---

## 🔵 2. Next Greater Element II (Circular)

**Description:**

Given a circular array, find the next greater element for every index.

If no greater exists → `-1`.

---

### 1️⃣ Optimized – Simulating Circular Array (2N Loop)

📌 **Code:**
[NextGreater2Optimized.java](NextGreater2Optimized.java)

**Idea:**

* Traverse from `2*N - 1 → 0`
* Use `i % n` to simulate circularity
* Push elements into a monotonic stack
* Only store answers when `i < n`

**Key Trick:**

```
nums[i % n]
```

**Complexity:**

* Time: `O(N)`
* Space: `O(N)`

---

---

### 2️⃣ Two Pass Stack Method

📌 **Code:**
[NextGreater2TwoPass.java](NextGreater2TwoPass.java)

**Idea:**

* Run normal next-greater twice
* Let leftover stack elements resolve circular answers

**Complexity:**

* Time: `O(N)`
* Space: `O(N)`

---

---

## 🔵 3. Next Smaller Element (Right)

**Description:**

For every element in the array, find the **next smaller element on the right**.

If none exists → `-1`.

---

### 1️⃣ Optimized – Monotonic Increasing Stack

📌 **Code:**
[NextSmallerOptimized.java](NextSmallerOptimized.java)

**Idea:**

* Traverse from right
* Maintain a **monotonic increasing stack**
* Pop elements `>= curr`
* Top of stack is next smaller

**Pattern:**

```
while (!stack.isEmpty() && stack.peek() >= curr) {
    stack.pop();
}
```

**Complexity:**

* Time: `O(N)`
* Space: `O(N)`

---

---

### 2️⃣ Brute Force

📌 **Code:**
[NextSmallerBrute.java](NextSmallerBrute.java)

**Idea:**

* For every element
* Linearly search to the right

**Complexity:**

* Time: `O(N²)`
* Space: `O(1)`

---




