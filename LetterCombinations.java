import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
    String[] value = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    int[] number = {0, 0, 3, 3, 3, 3, 3, 4, 3, 4};

    public List<String> letterCombinations(String digits) {
        List<String> L = new LinkedList<>();
        int len = digits.length();
        if (len == 0)
            return L;
        fun(L, digits, 0, new StringBuilder());
        return L;
    }

    private void fun(List<String> L, String digits, int index, StringBuilder StringBuilder){
        if (index == digits.length())
            L.add(StringBuilder.toString());
        else {
            int n = digits.charAt(index) - '0';
            for (int i = 0; i < number[n]; i ++ ){
                char c = value[n].charAt(i);
                fun(L, digits, index + 1, StringBuilder.append(c));
                StringBuilder.deleteCharAt(index);
            }
        }

    }


    public static void main(String[] args) {
        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        System.out.println(phoneMap.toString());


        LetterCombinations letterCombinations = new LetterCombinations();
        System.out.println(letterCombinations.letterCombinations("23"));

    }
}
