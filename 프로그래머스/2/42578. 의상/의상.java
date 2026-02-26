import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, String> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][0], clothes[i][1]);
            map2.put(clothes[i][1], map2.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        for (String s : map2.keySet()) {
            System.out.println(map2.get(s));
            answer *= (map2.get(s) + 1);
        }
  
        return answer - 1;
    }
}