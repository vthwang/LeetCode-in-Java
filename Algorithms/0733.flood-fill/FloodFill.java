class FloodFill {
    private int[][] floodFill(int[][] image, int cr, int cc, int curColor, int color) {
        if (cr == -1 || cr > image.length - 1 || cc == -1 || cc > image[0].length - 1 || image[cr][cc] != curColor) return image;
        image[cr][cc] = color;
        floodFill(image, cr - 1, cc, curColor, color);
        floodFill(image, cr, cc - 1, curColor, color);
        floodFill(image, cr + 1, cc, curColor, color);
        floodFill(image, cr, cc + 1, curColor, color);
        return image;
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int curColor = image[sr][sc];
        if (curColor == color) return image;
        return floodFill(image, sr, sc, curColor, color);
    }
}