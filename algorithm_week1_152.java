// leetcode 152
class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int candidate1 = max * nums[i];
            int candidate2 = min * nums[i];
            max = Math.max(nums[i], Math.max(candidate1, candidate2));
            min = Math.min(nums[i], Math.min(candidate1, candidate2));
            ans = Math.max(max, ans);
        }
        return ans;
    }
}
