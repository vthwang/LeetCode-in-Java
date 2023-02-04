# [6. Zigzag Conversion](https://leetcode.com/problems/zigzag-conversion/)

The string `"PAYPALISHIRING"` is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

```
P   A   H   N
A P L S I I G
Y   I   R
```

And then read line by line: `"PAHNAPLSIIGYIR"`

Write the code that will take a string and make this conversion given a number of rows:

```
string convert(string s, int numRows);
```

**Example 1:**

```
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
```

**Example 2:**

```
Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
```

**Example 3:**

```
Input: s = "A", numRows = 1
Output: "A"
```

## Solutions
### [String](ZigzagConversion.java)

Idea: Create rows of string to put string in zigzag shape. We use flag to reverse iteration from “start to end” to “end to start” which is the zigzag way of iteration.

```java
class Solution {
    public String convert(String s, int numRows) {
        if (numRows < 2) return s;
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++)
            rows.add(new StringBuilder());
        int i = 0, flag = -1;
        for (char c : s.toCharArray()) {
            rows.get(i).append(c);
            if (i == 0 || i == numRows - 1) flag = -flag;
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows)
            res.append(row);
        return res.toString();
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of `s`. We iterate s for one time, so the time complexity is $O(n)$.
- Space Complexity: $O(n)$. We save the data in rows that maximum space is $O(n)$.
