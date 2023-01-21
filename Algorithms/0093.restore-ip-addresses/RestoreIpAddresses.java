import java.util.ArrayList;
import java.util.List;

class RestoreIpAddresses {
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