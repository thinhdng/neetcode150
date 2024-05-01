import java.util.Arrays;
public class longestConsecutiveProblem{
    public static void main(String[] args){
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        int count = 1;
        int temp_count = 1;
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return 1;
        }
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i+1] == nums[i] + 1){
                temp_count++;
                if(count <= temp_count){
                    count = temp_count;
                }
            }else if(nums[i+1] == nums[i]){
                ;
            }else{
                temp_count = 1;
            }
        }
        return count;
    }
}

//time = O(nlgn + n)