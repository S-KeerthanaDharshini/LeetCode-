# [15. 3Sum ](https://leetcode.com/problems/3sum/description/)

## Problem Statement

Given an integer array `nums`, return all the **triplets** `[nums[i], nums[j], nums[k]]` such that:

- `i != j`, `i != k`, and `j != k`
- `nums[i] + nums[j] + nums[k] == 0`

**Note:**  
The solution set must **not contain duplicate triplets**.

---

## Examples

### Example 1

**Input:**  
`nums = [-1, 0, 1, 2, -1, -4]`  
**Output:**  
`[[-1, -1, 2], [-1, 0, 1]]`

**Explanation:**  
- `(-1) + 0 + 1 = 0`  
- `(-1) + (-1) + 2 = 0`  
These are the unique triplets that sum to 0.

---

### Example 2

**Input:**  
`nums = [0, 1, 1]`  
**Output:**  
`[]`

**Explanation:**  
There is no combination of three distinct indices that sum to 0.

---

### Example 3

**Input:**  
`nums = [0, 0, 0]`  
**Output:**  
`[[0, 0, 0]]`

**Explanation:**  
Only one valid triplet that sums to 0.

---

## Constraints

- `3 <= nums.length <= 3000`
- `-10⁵ <= nums[i] <= 10⁵`



## Additional Java Resources

- [Java Arrays.sort() Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#sort-int:A-)
- [Two Pointer Technique in Java](https://www.geeksforgeeks.org/two-pointers-technique/)
- [How to Avoid Duplicates in Array Problems](https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/776/)
