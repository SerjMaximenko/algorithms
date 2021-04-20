package ru.maximen.string;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Slf4j
public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        log.info(String.valueOf(getLengthOfLongestSubstring("abcdababcdeabcqwertyui")));
    }

    public static int getLengthOfLongestSubstring(String s){
            int n = s.length();
            Set<Character> set = new HashSet<>();
            int ans = 0, i = 0, j = 0;
            while (i < n && j < n) {
                // try to extend the range [i, j]
                if (!set.contains(s.charAt(j))){
                    log.info(String.valueOf(s.charAt(j)));
                    set.add(s.charAt(j++));
                    ans = Math.max(ans, j - i);
                }
                else {
                    log.info(String.valueOf(s.charAt(i)));
                    set.remove(s.charAt(i++));
                }
                try {
                    log.info(String.valueOf(ans));
                    log.info(Arrays.toString(set.toArray()));
                } catch (Exception e) {

                }
            }
            return ans;
    }
}

