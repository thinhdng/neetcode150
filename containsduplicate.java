class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1])
                return true;
        }
        return false;

        //time complexity: O(n + nlgn) => sorting takes nlgn time
    }
}