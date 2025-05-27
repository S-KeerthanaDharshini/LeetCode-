# [2. Add Two Numbers](https://leetcode.com/problems/add-two-numbers/description/)
`Linked List` | `Math` | `Medium`

## 📝 Problem Statement
You are given two **non-empty linked lists** representing two non-negative integers. The digits are stored in **reverse order**, and each node contains a single digit. Add the two numbers and return the sum as a linked list.

**Note:**
- The numbers don't contain leading zeros, except for the number 0 itself
- Digits are stored in reverse order (easier for addition)
- Return the result as a linked list in reverse order

## 🔢 Constraints
- Number of nodes in each linked list: `[1, 100]`
- Node values: `0 <= val <= 9`
- No leading zeros in input numbers

## 📊 Examples

### Example 1
**Input:**  
`l1 = [2,4,3]`, `l2 = [5,6,4]`  
**Output:**  
`[7,0,8]`  

**Explanation:**  
342 (2→4→3) + 465 (5→6→4) = 807 → 7→0→8

---

### Example 2
**Input:**  
`l1 = [0]`, `l2 = [0]`  
**Output:**  
`[0]`  

---

### Example 3
**Input:**  
`l1 = [9,9,9,9,9,9,9]`, `l2 = [9,9,9,9]`  
**Output:**  
`[8,9,9,9,0,0,0,1]`  

**Explanation:**  
9,999,999 + 9,999 = 10,009,998 → 8→9→9→9→0→0→0→1
