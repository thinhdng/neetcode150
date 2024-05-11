public class mostwater{
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height){
        int left = 0;
        int right = height.length-1;
        int area = 0;
        int currentArea = 0;
        while(left < right){
            currentArea = Math.min(height[left], height[right]) * (right - left);
            if(area < currentArea)
                area = currentArea;
            if(height[left] > height[right])
                right--;
            else
                left++;
        }

        return area;
     }
}

//O(n) solution, only iterate through the list once.