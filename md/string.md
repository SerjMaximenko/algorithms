# String

+ [Longest Substring Without Repeating Characters](#Longest-Substring-Without-Repeating-Characters)

## Longest Substring Without Repeating Characters
 
https://leetcode.com/problems/longest-substring-without-repeating-characters/

---

#### [Пример](src/main/java/ru/maximen/string/LengthOfLongestSubstring.java)

```java
public static int getLengthOfLongestSubstring(String s){
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
}
```