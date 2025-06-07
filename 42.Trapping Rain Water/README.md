# [42. Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/description/)
`Array` | `Two Pointers` | `Dynamic Programming` | `Stack` | `Hard`

## 📝 Problem Statement
Given an elevation map represented by an array of non-negative integers, calculate how much water can be trapped between the bars after raining. Each bar has width 1.

![Image](https://assets.leetcode.com/uploads/2018/10/22/rainwatertrap.png)
## 📊 Examples

### Example 1
**Input:** `height = [0,1,0,2,1,0,1,3,2,1,2,1]`  
**Output:** `6`  
**Explanation:** 
```
        X
    X   XX X
X_XX_XXXXXX
```
6 units of water (represented by `_`) are trapped.

### Example 2
**Input:** `height = [4,2,0,3,2,5]`  
**Output:** `9`  
**Explanation:** 
```
      X
X     X
X X   X
X X X X
X X X X
```
9 units of water are trapped.

## 🔗 Additional Resources (Java-specific)
- [Java Arrays](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html)
- [Math.max()](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#max-int-int-)
