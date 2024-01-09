class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        int[] freq = new int[k];
        int count = 1;
        for(int i = 0; i < nums.length; i++){
            if(numsMap.containsKey(nums[i])){
               count = numsMap.get(nums[i]);
               ++count;
               numsMap.put(nums[i], count);
               count = 1;
            }else{
                numsMap.put(nums[i], count);
            }
        }

        for(int i = 0; i < freq.length; i++){
            freq[i] = Collections.max(numsMap.entrySet(), Map.Entry.comparingByValue()).getKey();
            numsMap.remove(Collections.max(numsMap.entrySet(), Map.Entry.comparingByValue()).getKey());
        }

        return freq;
    }
}

//solution: create a hashmap to store the numbers & frequencies,
//then run a for loop with k times to put the keys with the highest frequencies into an array using the collections.max
//time complexity: hashmap creation takes O(n), making the array of numbers with highest frequencies takes:
// collections.max takes O(n), so 2 of this goes for O(2n)
//=> total complexity = O(3n) = O(n)
