# [153. Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/)
`Array` | `Binary Search` | `Medium`

## 🎯 Problem Statement
Given a **sorted and rotated** array `nums` of **unique** elements, return the minimum element of the array. The array was originally sorted in ascending order and then rotated between 1 and `n` times. Your solution must run in **O(log n)** time complexity.

## 📊 Examples

### Example 1
**Input:**  
`nums = [3,4,5,1,2]`  

**Output:**  
`1`  

**Explanation:**  
The original array was `[1,2,3,4,5]` rotated 3 times.

### Example 2
**Input:**  
`nums = [4,5,6,7,0,1,2]`  

**Output:**  
`0`  

**Explanation:**  
The original array was `[0,1,2,4,5,6,7]` rotated 4 times.

### Example 3
**Input:**  
`nums = [11,13,15,17]`  

**Output:**  
`11`  

**Explanation:**  
The array was rotated 4 times (remains unchanged).

## 🔗 Additional Resources
- [Binary Search Guide](https://leetcode.com/articles/binary-search/)
- [Java Arrays API](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html)
- [Visual Explanation](https://www.youtube.com/watch?v=IzHR_U8Ly6c)