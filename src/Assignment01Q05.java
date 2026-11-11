public class Assignment01Q05 {
    public static int findShortestPath(int[][] a, int i, int j) {
        if (i == j) {
            return 0;
        }
        int n = a.length;
        int[] distance = new int[n];
        for (int k = 0; k < n; k++) {
            distance[k] = -1;
        }
        int[] queue = new int[n];
        int front = 0;
        int rear = 0;
        queue[rear] = i;
        rear++;
        distance[i] = 0;
        while (front < rear) {
            int current = queue[front];
            front++;
            for (int k = 0; k < n; k++) {
                if (a[current][k] == 1 && distance[k] == -1) {
                    distance[k] = distance[current] + 1;
                    if (k == j) {
                        return distance[k];
                    }
                    queue[rear] = k;
                    rear++;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}