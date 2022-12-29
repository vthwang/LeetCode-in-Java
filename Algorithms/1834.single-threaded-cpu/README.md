# [1834. Single-Threaded CPU](https://leetcode.com/problems/single-threaded-cpu/)

You are given `n` ​​​​​​ tasks labeled from `0` to `n - 1` represented by a 2D integer array `tasks`, where `tasks[i] = [enqueueTime<sub>i</sub>, processingTime<sub>i</sub>]` means that the `i<sup>​​​​​​th</sup>` ​​​​ task will be available to process at `enqueueTime<sub>i</sub>` and will take `processingTime<sub>i</sub>` to finish processing.

You have a single-threaded CPU that can process **at most one** task at a time and will act in the following way:

- If the CPU is idle and there are no available tasks to process, the CPU remains idle.
- If the CPU is idle and there are available tasks, the CPU will choose the one with the **shortest processing time**. If multiple tasks have the same shortest processing time, it will choose the task with the smallest index.
- Once a task is started, the CPU will **process the entire task** without stopping.
- The CPU can finish a task then start a new one instantly.

Return _the order in which the CPU will process the tasks._

**Example 1:**

```
Input: tasks = [[1,2],[2,4],[3,2],[4,1]]
Output: [0,2,3,1]
Explanation: The events go as follows:
- At time = 1, task 0 is available to process. Available tasks = {0}.
- Also at time = 1, the idle CPU starts processing task 0. Available tasks = {}.
- At time = 2, task 1 is available to process. Available tasks = {1}.
- At time = 3, task 2 is available to process. Available tasks = {1, 2}.
- Also at time = 3, the CPU finishes task 0 and starts processing task 2 as it is the shortest. Available tasks = {1}.
- At time = 4, task 3 is available to process. Available tasks = {1, 3}.
- At time = 5, the CPU finishes task 2 and starts processing task 3 as it is the shortest. Available tasks = {1}.
- At time = 6, the CPU finishes task 3 and starts processing task 1. Available tasks = {}.
- At time = 10, the CPU finishes task 1 and becomes idle.
```

**Example 2:**

```
Input: tasks = [[7,10],[7,12],[7,5],[7,4],[7,2]]
Output: [4,3,2,0,1]
Explanation: The events go as follows:
- At time = 7, all the tasks become available. Available tasks = {0,1,2,3,4}.
- Also at time = 7, the idle CPU starts processing task 4. Available tasks = {0,1,2,3}.
- At time = 9, the CPU finishes task 4 and starts processing task 3. Available tasks = {0,1,2}.
- At time = 13, the CPU finishes task 3 and starts processing task 2. Available tasks = {0,1}.
- At time = 18, the CPU finishes task 2 and starts processing task 0. Available tasks = {1}.
- At time = 28, the CPU finishes task 0 and starts processing task 1. Available tasks = {}.
- At time = 40, the CPU finishes task 1 and becomes idle.
```

## Solutions
### [Sorting + Priority Queue](SingleThreadedCpu.java)

Idea: Create a new Task and record the index, then sort the newTasks based on enqueue time. After that, create a priority queue of integer array with processingTime and index. If the current Time is less than task enqueue time and there is no task in priority queue, add it to the answer array. Otherwise, fast forward current time to the latest task enqueue time and add the task to priority queue.

```java
class Solution {
    public int[] getOrder(int[][] tasks) {
        int[][] newTasks = new int[tasks.length][3];
        for (int i = 0; i < tasks.length; i++) {
            newTasks[i][0] = tasks[i][0];
            newTasks[i][1] = tasks[i][1];
            newTasks[i][2] = i;
        }

        Arrays.sort(newTasks, Comparator.comparingInt(a -> a[0]));
        // pq data: new int[]{processingTime, index}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] != b[0] ? (a[0] - b[0]) : (a[1] - b[1])));
        int[] ans = new int[tasks.length];
        int ansIndex = 0, currTime = 0;
        for (int i = 0; i < newTasks.length; i++) {
            while (currTime < newTasks[i][0] && !pq.isEmpty()) {
                int[] topTask = pq.remove();
                ans[ansIndex++] = topTask[1];
                currTime += topTask[0];
            }
            currTime = Math.max(currTime, newTasks[i][0]);
            pq.add(new int[]{newTasks[i][1], newTasks[i][2]});
        }
        while (!pq.isEmpty()) {
            int[] topTask = pq.remove();
            ans[ansIndex++] = topTask[1];
        }

        return ans;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n\log n)$. Array Sort costs $O(n\log n)$, add priority queue costs $O(\log n)$ and we running $n$ times which is the length of tasks. The total time complexity is $O(2n\log n)=O(n\log n)$.
- Space Complexity: $O(n)$. newTasks costs $O(n)$ and priority queue costs $O(n)$ as well. The total space complexity is $O(2n)=O(n)$.
