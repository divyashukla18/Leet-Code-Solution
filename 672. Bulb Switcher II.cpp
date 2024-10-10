class Solution {
public:
    int flipLights(int n, int presses) {
        if (presses == 0) {
            return 1;
        }

        if (n == 1) {
            return 2;
        }


        int maxMask = 16;
        if (n == 2) {
            maxMask = 8;
        }

        int ans = 0;
        for (int mask = 0; mask < maxMask; ++mask) {
            int bits = __builtin_popcount(mask);
            if (bits > presses) {
                continue;
            }
            if ((presses - bits) & 1 > 0) {
                continue;
            }
            ++ans;
        }
        return ans;   
    }
};