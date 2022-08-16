class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int res = Integer.MAX_VALUE;
        for (int i = 'a'; i <= 'z'; i++) {
            int index = s.indexOf(i);
            if (index != -1 && index == s.lastIndexOf(i)) {
                res = Math.min(res, index);
            }
        }
        if (res == Integer.MAX_VALUE) return -1;
        return res;
    }
}