# [189. Rotate Array](https://leetcode.com/problems/rotate-array/description/)

## 🧠 Difficulty
**Medium**

## 📌 Problem Statement

Given an integer array `nums`, rotate the array to the **right by `k` steps**, where `k` is non-negative.

---

## 📥 Input

- An integer array `nums[]`
- An integer `k` (number of steps to rotate)

## 📤 Output

- The array after rotating to the right by `k` steps.

---

## ✅ Constraints

- `1 <= nums.length <= 10^5`
- `-2^31 <= nums[i] <= 2^31 - 1`
- `0 <= k <= 10^5`

---

## 🔍 Examples

### Example 1
```python
Input: nums = [1, 2, 3, 4, 5, 6, 7], k = 3  
Output: [5, 6, 7, 1, 2, 3, 4]  

Explanation:  
Step 1: [7, 1, 2, 3, 4, 5, 6]  
Step 2: [6, 7, 1, 2, 3, 4, 5]  
Step 3: [5, 6, 7, 1, 2, 3, 4]
