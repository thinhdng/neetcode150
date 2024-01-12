class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while(i < j){
            int sum = numbers[i] + numbers[j];
            if(sum == target){
                return new int[] {i+1, j+1};
             }
            if(sum > target){
                --j;
            }else{
                ++i;
            }
        }

        return new int[] {};
    }
}

//time complexity = O(n) because of the 2 pointers, no need to use a nested loop
//space complexity = O(1) because of the 2 pointers