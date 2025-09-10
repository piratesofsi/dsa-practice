# 🚀 Binary Search on 1D Arrays (Striver Sheet)

This folder contains solutions for problems under **Lecture 1: Binary Search on 1D Arrays**.  
Progress: **5 / 13 problems solved ✅**

---

## 📌 Problems

### 1. Implement Binary Search
- **Description:** Search for a target element in a sorted array.  
- **Approach 1:** Iterative Binary Search  
  - Maintains two pointers `low` and `high` and repeatedly checks the middle element.  
- **Approach 2:** Recursive Binary Search  
  - Divides the array recursively until the base case is reached.  
- **Time Complexity:** O(log n)  
- **Space Complexity:**  
  - Iterative → O(1)  
  - Recursive → O(log n) (stack frames)  

### 2. Lower Bound
- **Description:** Find the first index `i` such that `arr[i] >= target`.  
- **Approach 1:** Linear Search (brute force).  
- **Approach 2:** Binary Search (optimized).  
- **Time Complexity:**  
  - Linear → O(n)  
  - Binary → O(log n)  
- **Space Complexity:** O(1)  

### 3. Upper Bound
- **Description:** Find the first index `i` such that `arr[i] > target`.  
- **Approach:** Binary Search.  
- **Time Complexity:** O(log n)  
- **Space Complexity:** O(1)  

### 4. Search Insert Position
- **Description:** Given a sorted array and a target, return the index if found. If not found, return the index where it would be inserted in sorted order.  
- **Approach:** Direct application of Lower Bound.  
- **Time Complexity:** O(log n)  
- **Space Complexity:** O(1)  

### 5. Floor and Ceil in a Sorted Array
- **Description:**  
  - **Floor:** Largest element in the array less than or equal to the target.  
  - **Ceil:** Smallest element in the array greater than or equal to the target.  
- **Approach:** Binary Search with slight modification:  
  - Track potential `floor` and `ceil` values while searching.  
- **Time Complexity:** O(log n)  
- **Space Complexity:** O(1)  

---

## 🔜 Upcoming Problems
- [ ] First and Last Occurrence of an Element  
- [ ] Count Occurrences  
- [ ] Search in Rotated Sorted Array  
- [ ] Find Minimum in Rotated Sorted Array  
- [ ] Single Element in a Sorted Array  
- [ ] Square Root (Binary Search based)  
- [ ] … and more  
