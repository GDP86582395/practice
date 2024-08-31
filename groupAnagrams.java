import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class groupAnagrams {
    String fun(String str){
        List<Integer> list = new LinkedList<>();
        for(int i = 0; i < str.length(); i ++)
            list.add(str.charAt(i) - 'a');
        list.sort(null);
        StringBuilder output = new StringBuilder();
        for (int j: list){
            output.append('a' + j);
        }

        return String.valueOf(output);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String key = fun(str);
            if (map.containsKey(key)) {
                List<String> value = map.get(key);
                value.add(str);
                map.put(key, value);
            } else {
                List<String> value = new LinkedList<>();
                value.add(str);
                map.put(key, value);
            }
        }
        List<List<String>> result = new LinkedList<>();
        for (String key : map.keySet()){
            result.add(map.get(key));
        }
        return result;

    }
}
