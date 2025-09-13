### 🚀 Binary Search on 1D Arrays (Striver Sheet)

This folder contains my solutions for **Lecture 1: Binary Search on 1D Arrays** from Striver’s DSA Sheet. 
Progress so far: **10 / 13 problems solved ✅**

---

### 📌 Problems Covered

#### 1. Implement Binary Search
- **Goal:** Efficiently locate a specific target value within a sorted array.
- **Approach:** The core idea is to repeatedly divide the search interval in half. If the middle element is the target, we've found it. If the target is smaller, we continue searching in the left half; if it's larger, we search in the right half.
- **Time Complexity:** O(log n) due to the halving of the search space.
- **Space Complexity:** O(1) for the iterative approach and O(log n) for the recursive approach (due to the call stack).

---

#### 2. Lower Bound
- **Goal:** Find the index of the first element in a sorted array that is greater than or equal to a given target.
- **Approach:** We use binary search to narrow down the possible indices. When we find an element that meets the condition ($arr[mid] \ge target$), we save its index and try to find an even smaller index by searching the left half.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

---

#### 3. Upper Bound
- **Goal:** Find the index of the first element in a sorted array that is strictly greater than a given target.
- **Approach:** Similar to the Lower Bound, we use binary search. When we find an element that is strictly greater than the target ($arr[mid] > target$), we save its index and try to find a smaller index in the left half.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

---

#### 4. Search Insert Position
- **Goal:** Given a sorted array and a target, return its index if found. If not, return the index where it would be if it were inserted in order.
- **Approach:** This problem is a direct application of the Lower Bound concept. The index returned by a lower bound search is exactly where the target should be inserted to maintain the sorted order.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

---

#### 5. Floor and Ceil in a Sorted Array
- **Goal:** Find two values: the **floor** (the largest element less than or equal to the target) and the **ceil** (the smallest element greater than or equal to the target) in a sorted array.
- **Approach:** We can find both values using a single binary search. We track potential floor and ceil values as we narrow the search space.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

---

#### 6. First and Last Occurrence of an Element
- **Goal:** Find the starting and ending indices of a target value in a sorted array that may contain duplicates.
- **Approach:** We solve this efficiently by first finding the **first occurrence** using a modified binary search (or the Lower Bound logic). Then, we find the **last occurrence** by finding the upper bound of the target and subtracting one from the result.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

---

#### 7. Count Occurrences
- **Goal:** Count how many times a target element appears in a sorted array.
- **Approach:** Leveraging the previous problem, the count of a target is simply the difference between the index of its last occurrence and the index of its first occurrence, plus one. This can be calculated using `upperBound(target) - lowerBound(target)`.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

---

#### 8. Search in Rotated Sorted Array (No Duplicates)
- **Goal:** Find a target value in a sorted array that has been rotated at some unknown pivot.
- **Approach:** The key insight is that even after rotation, one half of the array will always remain sorted. We use binary search to identify the sorted half and check if the target lies within it. If it does, we continue the search there; otherwise, we search the unsorted half.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

---

#### 9. Find Minimum in Rotated Sorted Array
- **Goal:** Find the smallest element in a rotated sorted array.
- **Approach:** The minimum element is the only one in the array that is smaller than its predecessor. We can use binary search to efficiently locate this element by always moving toward the unsorted half of the array. The minimum element will always be in the unsorted portion.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

---

#### 10. Find a Peak Element
- **Goal:** Find a "peak" element, which is an element strictly greater than its immediate neighbors. An array can have multiple peaks.
- **Approach:** Binary search is the optimal solution. We check the middle element. If it's a peak, we're done. If the element to its right is larger, a peak must exist in the right half of the array. If the element to its left is larger, a peak must exist in the left half. This approach guarantees finding at least one peak.
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

---

### 🔜 Upcoming Problems
- [ ] Single Element in a Sorted Array
- [ ] Square Root (Binary Search based)
- [ ] ...more binary search variations
