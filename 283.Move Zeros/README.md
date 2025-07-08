# [283. Move Zeroes](https://leetcode.com/problems/move-zeroes/description/)

## 🧠 Difficulty
**Easy**

## 📌 Problem Statement

Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

📎 **Note:** You must do this in-place **without making a copy** of the array.

---

## 📥 Input

- An integer array `nums[]`

## 📤 Output

- The same array with all zeroes moved to the end, maintaining the relative order of non-zero elements.

---

## ✅ Constraints

- `1 <= nums.length <= 10^4`
- `-2^31 <= nums[i] <= 2^31 - 1`

---

## 🔍 Examples

### Example 1
```python
Input: nums = [0, 1, 0, 3, 12]
Output: [1, 3, 12, 0, 0]
