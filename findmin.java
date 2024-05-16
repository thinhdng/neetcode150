public class findmin {
    public static void main(String[] args) {
        
    }

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        while(left < right){
            int mid = (int)left + (right - left) / 2;
            if(nums[mid] >= nums[right])
                left = mid + 1;
            if(nums[mid] < nums[right])
                right = mid;
        }
        return nums[left];
    }
}

//O(lgn) solution, using binary search
//update the left and right endmarkers by comparing them to the mid marker