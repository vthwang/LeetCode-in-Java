# [352. Data Stream as Disjoint Intervals](https://leetcode.com/problems/data-stream-as-disjoint-intervals/)

Given a data stream input of non-negative integers `a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>n</sub>`, summarize the numbers seen so far as a list of disjoint intervals.

Implement the `SummaryRanges` class:

- `SummaryRanges()` Initializes the object with an empty stream.
- `void addNum(int value)` Adds the integer `value` to the stream.
- `int[][] getIntervals()` Returns a summary of the integers in the stream currently as a list of disjoint intervals `[start<sub>i</sub>, end<sub>i</sub>]`. The answer should be sorted by `start<sub>i</sub>`.

**Example 1:**

```
Input
["SummaryRanges", "addNum", "getIntervals", "addNum", "getIntervals", "addNum", "getIntervals", "addNum", "getIntervals", "addNum", "getIntervals"]
[[], [1], [], [3], [], [7], [], [2], [], [6], []]
Output
[null, null, [[1, 1]], null, [[1, 1], [3, 3]], null, [[1, 1], [3, 3], [7, 7]], null, [[1, 3], [7, 7]], null, [[1, 3], [6, 7]]]

Explanation
SummaryRanges summaryRanges = new SummaryRanges();
summaryRanges.addNum(1);      // arr = [1]
summaryRanges.getIntervals(); // return [[1, 1]]
summaryRanges.addNum(3);      // arr = [1, 3]
summaryRanges.getIntervals(); // return [[1, 1], [3, 3]]
summaryRanges.addNum(7);      // arr = [1, 3, 7]
summaryRanges.getIntervals(); // return [[1, 1], [3, 3], [7, 7]]
summaryRanges.addNum(2);      // arr = [1, 2, 3, 7]
summaryRanges.getIntervals(); // return [[1, 3], [7, 7]]
summaryRanges.addNum(6);      // arr = [1, 2, 3, 6, 7]
summaryRanges.getIntervals(); // return [[1, 3], [6, 7]]
```

## Solutions
### [Ordered Set](DataStreamAsDisjointIntervals.java)

Idea: Put the values in the ordered set. Then, return the intervals by left and right pointers.

```java
class SummaryRanges {
    private final Set<Integer> values;
    
    public SummaryRanges() {
        values = new TreeSet<>();
    }
    
    public void addNum(int value) {
        values.add(value);
    }
    
    public int[][] getIntervals() {
        if (values.isEmpty())
            return new int[0][2];
        List<int[]> intervals = new ArrayList<>();
        int left = -1, right = -1;
        for (Integer value : values) {
            if (left < 0)
                left = right = value;
            else if (value == right + 1)
                right = value;
            else {
                intervals.add(new int[]{left, right});
                left = right = value;
            }
        }
        intervals.add(new int[]{left, right});
        return intervals.toArray(new int[0][]);
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of values. Save value in ordered set cost $O(\log n)$ and getIntervals costs $O(n)$. Thus, the total time complexity is $O(n)$.
- Space Complexity: $O(n)$. We save all values in ordered set. The total space complexity is $O(n)$.
