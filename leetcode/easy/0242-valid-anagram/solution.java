
import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        // Step 1: Count frequency of characters in s
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Decrease frequency using characters of t
        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);

            if (map.containsKey(ch)) {

                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }

            } else {
                return false;
            }
        }

        return map.isEmpty();
    }
}
