class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if (height.length == 0) return 0;
        if (height.length == 1) return height[0];
        int maxArea = 0, left = 0, right = height.length - 1;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);
            if (height[left] > height[right]) right--;
            else left++;
        }

        return maxArea;
    }
}