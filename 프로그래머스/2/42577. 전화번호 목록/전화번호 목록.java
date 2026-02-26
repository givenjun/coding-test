import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Map<String, Boolean> map = new HashMap<>();
        for (String s : phone_book) {
            map.put(s, true);
        }
        
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 1; j < phone_book[i].length(); j++) {
                if (map.getOrDefault(phone_book[i].substring(0, j), false)) {
                    return false;
                }
            }
        }
        
        
        return answer;
    }
}