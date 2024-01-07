class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        int complement = 0;
        for(int i = 0; i < nums.length; i++){
            complement = target - nums[i];
            if(numsMap.containsKey(complement)){
                return new int[] {numsMap.get(complement), i};
            }
                 numsMap.put(nums[i], i);
        }

        return new int[] {};
    }
}

//using hashmap: O(n) => iterate through each element in the array. 
//hashmap get() returns the value of the key given, O(1)
//containskey() is also O(1)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target)
                    return new int[] {i, j};
            }
        }

        return new int[] {};
    }
}

//brute force method: O(n^2) => for each element, iterate through the whole
//array to find the complement. memory efficient but not time efficient at all. 
