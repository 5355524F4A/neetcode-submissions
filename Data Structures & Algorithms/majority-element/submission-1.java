class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int max = -1;
        int ans = nums[0];
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                int freq = j - i;
                if (freq > max) {
                    max = freq;
                    ans = nums[i];
                }
                i = j;
            }
        }
        int freq = j - i;
        if (freq > max) {
            max = freq;
            ans = nums[i];
        }
        return ans;
    }
}