class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[] points = {0, 1, 2, 3};
        int[][] p = {p1, p2, p3, p4};
        int[] distances = new int[6];
        int index = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) { 
                int dx = p[i][0] - p[j][0];
                int dy = p[i][1] - p[j][1];
                distances[index++] = dx * dx + dy * dy;
            }
        }
        Arrays.sort(distances);
        if (distances[0] == 0) {
            return false;
        }
        if (distances[0] != distances[1] ||
            distances[1] != distances[2] ||
            distances[2] != distances[3]) {
            return false;
        }
        if (distances[4] != distances[5]) {
            return false;
        }
        return distances[4] > distances[0];
    }
}