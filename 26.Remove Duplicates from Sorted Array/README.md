# [26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/)
`Array` | `Two Pointers` | `Easy`

## 📝 Problem Statement
Given a sorted integer array `nums` in non-decreasing order, remove duplicates in-place such that each element appears only once while maintaining relative order. Return the count of unique elements.

**Requirements:**
1. Modify `nums` in-place so first `k` elements contain unique elements
2. Return `k` (number of unique elements)
3. Elements beyond `k` are irrelevant

## 🔢 Constraints
- `1 <= nums.length <= 3 * 10⁴`
- `-100 <= nums[i] <= 100`
- `nums` is sorted in non-decreasing order

## 📊 Examples

### Example 1
**Input:** `nums = [1,1,2]`  
**Output:** `2`  
**Modified Array:** `[1,2,_]`  
**Explanation:** First 2 elements are unique (1 and 2).

---

### Example 2
**Input:** `nums = [0,0,1,1,1,2,2,3,3,4]`  
**Output:** `5`  
**Modified Array:** `[0,1,2,3,4,_,_,_,_,_]`  
**Explanation:** First 5 elements are unique (0,1,2,3,4).

## 🔗 Additional Resources
- [LeetCode Solution](https://leetcode.com/problems/remove-duplicates-from-sorted-array/solutions/)
- [Two Pointers Technique](https://www.geeksforgeeks.org/two-pointers-technique/)
- [Visual Explanation](https://youtu.be/DEJAZBq0FDA)

---
