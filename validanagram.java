import java.util.Arrays;
public class validanagram {

    public static void main(String[] args){
       String s = "anagram", t = "nagaram";

       isAnagram(s, t);
    }

    public static void isAnagram(String s, String t) {
        String[] sArray = s.split("", 0);
        String[] tArray = t.split("", 0);

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        System.out.println(Arrays.toString(sArray));
        System.out.println(Arrays.toString(tArray));
        System.out.println(Arrays.equals(sArray, tArray));
    }
}
