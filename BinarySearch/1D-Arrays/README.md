# 🚀 Binary Search on 1D Arrays (Striver Sheet)

This folder contains my solutions for **Lecture 1: Binary Search on 1D Arrays** from Striver’s DSA Sheet.  
Progress so far: **8 / 13 problems solved ✅**

---

## 📌 Problems Covered

### 1. Implement Binary Search
- **Goal:** Search for a target element in a sorted array.  
- **Approach 1 (Iterative):** Maintain `low` and `high` pointers, repeatedly check the middle element, and adjust search space.  
- **Approach 2 (Recursive):** Recursively divide the array until the base case is reached.  
- **Time Complexity:** O(log n)  
- **Space Complexity:**  
  - Iterative → O(1)  
  - Recursive → O(log n) (stack space)  

---

### 2. Lower Bound
- **Goal:** Find the first index `i` such that `arr[i] >= target`.  
- **Approach 1 (Brute):** Linear scan until the condition is met.  
- **Approach 2 (Optimal):** Binary Search — shrink the right half when `arr[mid] >= target`.  
- **Time Complexity:** O(n) / O(log n)  
- **Space Complexity:** O(1)  

---

### 3. Upper Bound
- **Goal:** Find the first index `i` such that `arr[i] > target`.  
- **Approach:** Binary Search — shrink the right half when `arr[mid] > target`.  
- **Time Complexity:** O(log n)  
- **Space Complexity:** O(1)  

---

### 4. Search Insert Position
- **Goal:** Given a sorted array and a target, return the index if found; otherwise, return the index where it should be inserted.  
- **Approach:** Direct use of Lower Bound.  
- **Time Complexity:** O(log n)  
- **Space Complexity:** O(1)  

---

### 5. Floor and Ceil in a Sorted Array
- **Goal:**  
  - **Floor:** Largest element ≤ target.  
  - **Ceil:** Smallest element ≥ target.  
- **Approach:** Modified Binary Search — track candidate floor and ceil while adjusting search space.  
- **Time Complexity:** O(log n)  
- **Space Complexity:** O(1)  

---

### 6. First and Last Occurrence of an Element
- **Goal:** Return the first and last index of a given target in a sorted array.  
- **Approach:** Use `lowerBound(target)` and `upperBound(target) - 1`.  
- **Time Complexity:** O(log n)  
- **Space Complexity:** O(1)  

---

### 7. Count Occurrences
- **Goal:** Count how many times a target element appears in a sorted array.  
- **Approach:** `(upperBound - lowerBound)` gives the frequency.  
- **Time Complexity:** O(log n)  
- **Space Complexity:** O(1)  

---

### 8. Search in Rotated Sorted Array (No Duplicates)
- **Goal:** Find a target in a rotated sorted array (without duplicates).  
- **Approach 1 (Brute):** Linear Search through all elements.  
  - **Time Complexity:** O(n)  
  - **Space Complexity:** O(1)  
- **Approach 2 (Optimal):** Modified Binary Search:  
  - Identify which half (left or right) is sorted.  
  - Check if the target lies in the sorted half, else search the other.  
  - Reduces to O(log n).  
- **Time Complexity:** O(log n)  
- **Space Complexity:** O(1)  

---

## 🔜 Upcoming Problems
- [ ] Find Minimum in Rotated Sorted Array  
- [ ] Single Element in a Sorted Array  
- [ ] Square Root (Binary Search based)  
- [ ] … more binary search variations
