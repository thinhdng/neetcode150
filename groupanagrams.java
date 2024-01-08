class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();
        
        String sorted_word = "";
        for(String word: strs){
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            sorted_word = new String(charArray);

            if (anagrams.containsKey(sorted_word)) {
                anagrams.get(sorted_word).add(word);
            }else{
                anagrams.put(sorted_word, new ArrayList<>());
                anagrams.get(sorted_word).add(word);
            }

        }

        return new ArrayList<>(anagrams.values());
    }
}

//works the same way with python
//only arraylists can be initialised, not lists
