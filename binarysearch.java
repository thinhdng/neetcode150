public class binarysearch {
    public static void main(String[] args){

    }

    public static int search(int[] nums, int target) {
        int low = 0; //lower end pointer
        int high = nums.length - 1; //higher end pointer
        int mid = 0;
        while(low <= high){
            mid = low + (high - low)/2;
            if(target == nums[mid])
                return mid;
            else if(target > nums[mid])// target is on the right side
                low = mid + 1;
            else //target is on the left side
                high = mid - 1;
        }
        return -1;
    }
}

//time complexity: best case when target is in the middle of an array: O(1)
//worst / avg case: O(lgn)
//space complexity = O(1)