class DetermineIfStringHalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        String left = s.substring(0, s.length() / 2);
        String right = s.substring(s.length() / 2);
        String v = "aeiouAEIOU";
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < left.length(); i++)
            if (v.indexOf(left.charAt(i)) >= 0)
                leftSum++;
        for (int i = 0; i < right.length(); i++)
            if (v.indexOf(right.charAt(i)) >= 0)
                rightSum++;
        return leftSum == rightSum;
    }
}