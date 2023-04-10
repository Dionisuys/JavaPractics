class Solution {
    public static int minimizeArrayValue(int[] nums) {
        int n = nums.length;
        int[] maxIdxs = new int[n];
        int maxVal = nums[0];
        int maxCnt = 0;

        // find all indices of the maximum values
        for (int i = 0; i < n; i++) {
            if (nums[i] > maxVal) {
                maxVal = nums[i];
                maxCnt = 1;
                maxIdxs[maxCnt - 1] = i;
            } else if (nums[i] == maxVal) {
                maxCnt++;
                maxIdxs[maxCnt - 1] = i;
            }
        }

        // iterate through the maximum values, averaging values to the left of them
        int minMaxVal = maxVal;
        for (int i = 0; i < maxCnt; i++) {
            int idx = maxIdxs[i];
            int sum = nums[idx];
            int cnt = 1;
            for (int j = idx - 1; j >= 0; j--) {
                sum += nums[j];
                cnt++;
                int avg = sum / cnt;
                if (avg >= maxVal) {
                    break;
                }
                minMaxVal = Math.min(minMaxVal, maxVal - 1);
                if (minMaxVal == maxVal - 1) {
                    break;
                }
            }
        }

        return minMaxVal;
    }
}
