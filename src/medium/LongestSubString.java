package medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        String s = "Pooja";
        int res = longestSubString(s);
        System.out.println(res);
    }

    private static int longestSubString(String s) {
        int left = 0, maxLength = 0;
        Set<Character> set = new HashSet<>();
        for(int right=0;right<s.length();right++){
            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength,right-left+1);
        }
        System.out.println(set);
        return maxLength;
    }
}
