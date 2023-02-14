class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int n = Math.max(a.length(), b.length()), carry = 0;
        for (int i = 0; i < n; i++) {
            carry += i < a.length() ? a.charAt(a.length() - 1 - i) - '0' : 0;
            carry += i < b.length() ? b.charAt(b.length() - 1 - i) - '0' : 0;
            res.append((char) (carry % 2 + '0'));
            carry /= 2;
        }
        if (carry > 0)
            res.append('1');

        return res.reverse().toString();
    }
}