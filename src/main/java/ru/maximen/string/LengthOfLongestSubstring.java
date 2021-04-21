package ru.maximen.string;

import lombok.extern.slf4j.Slf4j;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Slf4j
public class LengthOfLongestSubstring {

    public static void main(String[] args) {


        log.info(String.valueOf(getLengthOfLongestSubstring("abcccqwe"))
        );
    }

    public static int getLengthOfLongestSubstring(String s){
            int n = s.length();
            Set<Character> set = new HashSet<>();
            int ans = 0, i = 0, j = 0;
            while (i < n && j < n) {
                if (!set.contains(s.charAt(j))){
                    log.info("add " + s.charAt(j));
                    set.add(s.charAt(j++));
                    ans = Math.max(ans, j - i);
                }
                else {
                    log.info("remove " + s.charAt(i));
                    set.remove(s.charAt(i++));
                }
                log.info("i = " + i);
                log.info("j = " + j);
                log.info("ans = " + ans);
                log.info(Arrays.toString(set.toArray()));
            }
            return ans;
    }


    public static int trsy(String s){
        int abs = 0, i = 0, j = 0;
        int n = s.length();
        Set<Character> set = new HashSet<>();
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                abs = Math.max(abs, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }

        return abs;
    }
}

