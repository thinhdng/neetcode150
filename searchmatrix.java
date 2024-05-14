public class searchmatrix {
    public static void main(String[] args) {
        int[][] m = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(m, 15));
    }

    public static boolean searchMatrix(int[][] matrix, int target){
        if(matrix.length == 0)
            return false;
        if(matrix.length == 1 && matrix[0].length == 1)
            return target == matrix[0][0];
        int n = 0;
        int midptr = 0;
        int leftptr = 0;
        int rightptr = matrix[n].length - 1;
        int right = matrix[n][matrix[n].length -1];
        while(target > right && matrix.length > 1){
            n++;
            if(n < matrix.length)
                right = matrix[n][matrix[n].length -1];
            else
                return false;
        }
        while(leftptr <= rightptr){
            midptr = (int)leftptr + (rightptr-leftptr)/2;
            if(matrix[n][midptr] == target)
                return true;
            else if(matrix[n][midptr] < target)
                leftptr =  midptr + 1;
            else
                rightptr = midptr - 1;
        }
        return false;
    }
}

//O(lg(m*n)) solution. 