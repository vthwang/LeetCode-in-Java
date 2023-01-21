# [93. Restore IP Addresses](https://leetcode.com/problems/restore-ip-addresses/)

A **valid IP address** consists of exactly four integers separated by single dots. Each integer is between `0` and `255` ( **inclusive**) and cannot have leading zeros.

- For example, `"0.1.2.201"` and `"192.168.1.1"` are **valid** IP addresses, but `"0.011.255.245"`, `"192.168.1.312"` and `"192.168@1.1"` are **invalid** IP addresses.

Given a string `s` containing only digits, return _all possible valid IP addresses that can be formed by inserting dots into_ `s`. You are **not** allowed to reorder or remove any digits in `s`. You may return the valid IP addresses in **any** order.

**Example 1:**

```
Input: s = "25525511135"
Output: ["255.255.11.135","255.255.111.35"]
```

**Example 2:**

```
Input: s = "0000"
Output: ["0.0.0.0"]
```

**Example 3:**

```
Input: s = "101023"
Output: ["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]
```

## Solutions
### [Backtracking](RestoreIpAddresses.java)

Idea: We use backtracking and DFS to iterate all possible IPs. In DFS, if we found four IP segments and iterate all strings, then it’s an answer. Then if we iterated all strings but didn’t have four segments, we stop the backtracking. If the current number is ‘0’, it can only be 0 in this address, because ‘0’ can’t be the first number of ip segment. Other situations, we iterate all possible results and do recursion.

```java
class Solution {
    static final int segCount = 4;
    List<String> ans = new ArrayList<>();
    int[] segments = new int[segCount];

    public List<String> restoreIpAddresses(String s) {
        segments = new int[segCount];
        dfs(s, 0, 0);
        return ans;
    }

    private void dfs(String s, int segId, int segStart) {
        if (segId == segCount) {
            if (segStart == s.length()) {
                StringBuilder ipAddr = new StringBuilder();
                for (int i = 0; i < segCount; i++) {
                    ipAddr.append(segments[i]);
                    if (i != segCount - 1)
                        ipAddr.append('.');
                }
                ans.add(ipAddr.toString());
            }
            return;
        }
        if (segStart == s.length())
            return;
        if (s.charAt(segStart) == '0') {
            segments[segId] = 0;
            dfs(s, segId + 1, segStart + 1);
        }
        int addr = 0;
        for (int segEnd = segStart; segEnd < s.length(); segEnd++) {
            addr = addr * 10 + (s.charAt(segEnd) - '0');
            if (addr > 0 && addr <= 0xFF) {
                segments[segId] = addr;
                dfs(s, segId + 1, segEnd + 1);
            } else {
                break;
            }
        }
    }
}
```

Complexity Analysis:

- Time Complexity: $O(1)$. $n$ is the length of `s`. The depth of recursion is $3^{segCount}$ and restore an IP address is $O(n)$. `segCount` is 4 which is constant and the largest $n$ for this question is $3\times4=12$ that is constant as well, so the total time complexity is $O(1)$.
- Space Complexity: $O(1)$. The size segments array is 4 which is cosntant.
