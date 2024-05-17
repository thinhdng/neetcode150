public class searchinrotatedarray{
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.err.println(search(nums,0));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        
        //base cases
        if(nums.length==0)
            return -1;
        if(nums.length==1){
            if(nums[0]==target)
                return 0;
            else
                return -1;
        }

        //using binary search
        while(left <= right){
            int mid = (int)(left + (right-left)/2);
            if(target == nums[mid])
                return mid;
            else if(nums[mid] >= nums[left]){
                if(target >= nums[left] && target < nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }else{
                if(target > nums[mid] && target <= nums[right])
                    left = mid + 1;
                else   
                    right = mid - 1;
            }
        }
        return -1;
    }
}

//O(lgn), using binary search.