# [2441. Largest Positive Integer That Exists With Its Negative](https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/description/)
`Array` | `Hash Table` | `Two Pointers` | `Sorting` | `Easy`

## 📝 Problem Statement
Given an integer array `nums` containing no zeros, find the largest positive integer `k` where `-k` also exists in the array. Return `-1` if no such integer exists.

## 🔢 Constraints
- `1 <= nums.length <= 1000`
- `-1000 <= nums[i] <= 1000`
- `nums[i] != 0`

## 📊 Examples

### Example 1
**Input:** `nums = [-1,2,-3,3]`  
**Output:** `3`  
**Explanation:** 3 is the only valid k (since -3 exists).

---

### Example 2
**Input:** `nums = [-1,10,6,7,-7,1]`  
**Output:** `7`  
**Explanation:** Both 1 and 7 have their negatives, with 7 being larger.

---

### Example 3
**Input:** `nums = [-10,8,6,7,-2,-3]`  
**Output:** `-1`  
**Explanation:** No positive integer has its negative counterpart.

