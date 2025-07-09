# [268. Missing Number](https://leetcode.com/problems/missing-number/description/)

## 🧠 Difficulty
**Easy**

## 📌 Problem Statement

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the **only number** in the range that is **missing** from the array.

---

## 📥 Input

- An integer array `nums[]` of length `n` containing **distinct** numbers from `0` to `n`.

## 📤 Output

- Return the **missing number** in the range `[0, n]`.

---

## ✅ Constraints

- `n == nums.length`
- `1 <= n <= 10^4`
- `0 <= nums[i] <= n`
- All the numbers of `nums` are **unique**.

---

## 🔍 Examples

### Example 1
```python
Input: nums = [3, 0, 1]
Output: 2

Explanation:
n = 3, so range = [0, 3]
But 2 is missing from the array.
