class Solution {
    public int[] asteroidCollision(int[] asteroid) {

        int[] st = new int[asteroid.length];
        int top = -1;

        for (int i = 0; i < asteroid.length; i++) {

            boolean destroyed = false;

            while (top >= 0 && st[top] > 0 && asteroid[i] < 0) {

                if (st[top] < Math.abs(asteroid[i])) {
                    // stack asteroid explodes
                    top--;
                }
                else if (st[top] == Math.abs(asteroid[i])) {
                    // both explode
                    top--;
                    destroyed = true;
                    break;
                }
                else {
                    // incoming asteroid explodes
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                st[++top] = asteroid[i];
            }
        }

        int[] res = new int[top + 1];

        for (int i = 0; i <= top; i++) {
            res[i] = st[i];
        }

        return res;
    }
}