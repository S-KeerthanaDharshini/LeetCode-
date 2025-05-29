# [33. Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/description/)
`Array` | `Binary Search` | `Medium`

## 📝 Problem Statement
Given a **rotated sorted array** with distinct integers and a target value, return the index of target if found, otherwise return -1. The algorithm must run in O(log n) time.

**Rotation Example:**  
Original: `[0,1,2,4,5,6,7]`  
Rotated at pivot 3: `[4,5,6,7,0,1,2]`

## 🔢 Constraints
- `1 <= nums.length <= 5000`
- `-10⁴ <= nums[i] <= 10⁴`
- All values are unique
- `-10⁴ <= target <= 10⁴`

## 📊 Examples

### Example 1
**Input:** `nums = [4,5,6,7,0,1,2]`, `target = 0`  
**Output:** `4`  

---

### Example 2
**Input:** `nums = [4,5,6,7,0,1,2]`, `target = 3`  
**Output:** `-1`  

---

### Example 3
**Input:** `nums = [1]`, `target = 0`  
**Output:** `-1`  


## 🔗 Additional Resources
- [Binary Search Guide](https://leetcode.com/articles/binary-search/)
- [Visual Explanation](https://youtu.be/QdVrY3stDD4)
