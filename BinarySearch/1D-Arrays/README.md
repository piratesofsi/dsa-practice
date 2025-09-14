<h1 align="center">🚀 Binary Search on 1D Arrays (Striver Sheet)</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Binary%20Search-13%2F13-brightgreen?style=for-the-badge" />
</p>

This folder contains my solutions for **Lecture 1: Binary Search on 1D Arrays** from Striver’s DSA Sheet.  
Progress so far: **13 / 13 problems solved ✅**

---

### 📌 Problems Covered

#### 1. Implement Binary Search
- **Goal:** Efficiently locate a specific target value within a sorted array.
- **Approach:** The core idea is to repeatedly divide the search interval in half. If the middle element is the target, we've found it. If the target is smaller, we continue searching in the left half; if it's larger, we search in the right half.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1) for iterative, O(log n) for recursive (stack space).

---

#### 2. Lower Bound
- **Goal:** Find the index of the first element in a sorted array that is greater than or equal to a given target.
- **Approach:** Binary search, storing the index when condition `arr[mid] >= target` is met, then move left.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

---

#### 3. Upper Bound
- **Goal:** Find the index of the first element in a sorted array that is strictly greater than a given target.
- **Approach:** Binary search, storing the index when condition `arr[mid] > target` is met, then move left.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

---

#### 4. Search Insert Position
- **Goal:** Given a sorted array and a target, return its index if found. Otherwise, return the index where it should be inserted.
- **Approach:** Direct application of lower bound.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

---

#### 5. Floor and Ceil in a Sorted Array
- **Goal:** Find the **floor** (largest ≤ target) and **ceil** (smallest ≥ target).
- **Approach:** Single binary search while tracking potential floor and ceil.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

---

#### 6. First and Last Occurrence of an Element
- **Goal:** Find start and end indices of a target in a sorted array (with duplicates).
- **Approach:** Use lower bound for first occurrence, and `upperBound(target) - 1` for last.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

---

#### 7. Count Occurrences
- **Goal:** Count how many times a target appears.
- **Approach:** `upperBound(target) - lowerBound(target)`
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

---

#### 8. Search in Rotated Sorted Array (No Duplicates)
- **Goal:** Find target in a rotated sorted array.
- **Approach:** One half of the array is always sorted. Identify sorted half → check target → move accordingly.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

---

#### 9. Find Minimum in Rotated Sorted Array
- **Goal:** Find the smallest element in rotated array.
- **Approach:** The minimum lies in the unsorted half. Use binary search to move toward unsorted half until found.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

---

#### 10. Find a Peak Element
- **Goal:** Find a peak element (greater than neighbors).
- **Approach:** Binary search:  
  - If mid is peak, return.  
  - If right neighbor > mid → peak on right.  
  - If left neighbor > mid → peak on left.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

---

#### 11. Single Element in a Sorted Array
- **Goal:** Every element appears twice except one. Find that single element.
- **Approach:** Binary search with even/odd index pairing logic. If alignment breaks → single element nearby.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

---

#### 12. How Many Times the Array is Rotated
- **Goal:** Find how many times a sorted array has been rotated.
- **Approach:** Index of the minimum element = number of rotations. Use binary search to find minimum.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

---

#### 13. Search in Rotated Sorted Array (With Duplicates)
- **Goal:** Find a target value in rotated sorted array with duplicates.
- **Approach:**  
  - If `arr[low] == arr[mid] == arr[high]`, shrink both ends (`low++`, `high--`).  
  - Otherwise, check sorted half (like no-duplicate case).  
- **Time Complexity:** O(log n) on average, O(n) in worst case (due to duplicates).  
- **Space Complexity:** O(1)
