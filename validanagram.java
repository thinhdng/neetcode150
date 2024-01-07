class Solution {
    public boolean isAnagram(String s, String t) {
        String[] sArray = s.split("", 0);
        String[] tArray = t.split("", 0);
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);

        //time complexity: O(nlgn) => sorting takes O(nlgn) time
    }
}
