class Solution {
    public boolean isPalindrome(String s) {
        if(s.equals(""))
            return true;
        String s1 = s.toLowerCase().replaceAll("[^0-9a-z]", "");
        String[] s1Array = s1.split("", 0);
        int left = 0;
        int right = s1Array.length - 1;
        for(int i = 0; i < s1Array.length / 2; i++){
            if(!s1Array[left].equals(s1Array[right])){
                return false;
            }
            ++left;
            --right;
        }
        
        return true;
    }
}

//using 2 pointers => tolowercase = O(n), replaceall = O(n), split = O(n)
//for loop = O(n/2) => total time complexity = O(n)
