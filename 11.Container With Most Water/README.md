# [11. Container With Most Water](https://leetcode.com/problems/container-with-most-water/description/)

`Medium` | `Two-pointers`
## Problem Statement

You are given an integer array `height` of length `n`. There are `n` vertical lines drawn such that the two endpoints of the `iᵗʰ` line are `(i, 0)` and `(i, height[i])`.

Find two lines that, together with the x-axis, form a container such that the container contains the **most water**.

Return the **maximum amount of water** a container can store.

**Note:** You may **not** slant the container.

---

![Container With Most Water](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg)


## Sample Input

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49

**Explanation:**  
The above vertical lines are represented by array `[1,8,6,2,5,4,8,3,7]`.  
The container formed between the lines at indices `1` and `8` stores the most water:  
`min(8, 7) * (8 - 1) = 7 * 7 = 49`.

---

### Example 2

Input: height = [1,1]
Output: 1
---

## Constraints

- `n == height.length`
- `2 <= n <= 10⁵`
- `0 <= height[i] <= 10⁴`

---

## Key Concepts

- Two-pointer technique
- Greedy approach
- Area between two vertical lines is calculated as `min(height[left], height[right]) * (right - left)`
- Move the pointer pointing to the shorter line to try and find a taller one

---

## Additional Java Resources

- [Two-Pointer Approach – GeeksforGeeks](https://www.geeksforgeeks.org/two-pointers-technique/)
- [Java Arrays Tutorial – Oracle](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)
- [How to Find Maximum Area in Java](https://www.programiz.com/java-programming/examples/area-rectangle)
- [Container With Most Water – LeetCode Discuss (Java)](https://leetcode.com/problems/container-with-most-water/discuss/6099/Easy-to-understand-O(n)-Java-solution)

---

## Related LeetCode Topics

- Array  
- Two Pointers  
- Greedy  
