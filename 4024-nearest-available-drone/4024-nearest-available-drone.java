class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int min = 99999999;
        int ans = -1;

        for (int i = 0; i < drones.length; i++) {
            int x = Math.abs(drones[i][0] - target[0]);
            int y = Math.abs(drones[i][1] - target[1]);
            int distance = x + y;
            if (distance <= drones[i][2]) {
                if (distance < min) {
                    min = distance;
                    ans = i ;
                }
            }

        }
        return ans;

    }
}