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

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            if(numsMap.containsKey(nums[i])){
                return true;
            }
            numsMap.put(nums[i], i);
        }

        return false;
    }
    //time complexity: O(n) worst case using hashmap, since it only iterates through the array only once
    //and the put and contains key methods of a hashmap is only O(1)
}