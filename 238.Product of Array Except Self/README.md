# [238. Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/description/)
`Array` | `Prefix Sum` | `Medium`

## 📝 Problem Statement
Given an integer array `nums`, return an array `answer` where `answer[i]` equals the product of all elements in `nums` except `nums[i]`. The solution must run in O(n) time without using division.

## 📊 Examples

### Example 1
**Input:** `nums = [1,2,3,4]`  
**Output:** `[24,12,8,6]`  
**Explanation:**  
- answer[0] = 2×3×4 = 24  
- answer[1] = 1×3×4 = 12  
- answer[2] = 1×2×4 = 8  
- answer[3] = 1×2×3 = 6  

### Example 2
**Input:** `nums = [-1,1,0,-3,3]`  
**Output:** `[0,0,9,0,0]`  
**Explanation:**  
- Any product including 0 becomes 0  
- answer[2] = (-1)×1×(-3)×3 = 9  


## 🔗 Additional Resources (Java-specific)
- [Java Arrays](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html)
- [Prefix Sum Technique](https://www.geeksforgeeks.org/prefix-sum-array-implementation-applications-competitive-programming/)

---
