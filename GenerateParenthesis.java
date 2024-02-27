import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {

        List<String> s = fun2(0, n, n);
        return s;
    }

    public Set<String> fun(String s){
        Set<String> set = new HashSet<>();
        if (s.length() == 1){
            set.add(s);
            return set;
        }
        for(int i = 0; i < s.length(); i++){
            for (String str: fun(s.substring(0, i) + s.substring(i + 1))){
                set.add(s.charAt(i) + str);
            }
        }
        return set;
    }

    public boolean isOK(String s){
        boolean changed = true;
        while (changed){
            String b = s.replace("()", "");
            changed = !s.equals(b);
            s = b;
        }
        return s.equals("");
    }

    public List<String> fun2(int score, int left, int right){
        List<String> list = new ArrayList<>();
        if (right == 0) {
            list.add("");
            return list;
        }
        if (score == 0 && left > 0){
            for (String s: fun2(score + 1, left - 1, right))
                list.add("(" + s);
        }else if (left == 0){
            for (String s: fun2(score - 1, left, right - 1))
                list.add(")" + s);
        }
        else{
            for (String s: fun2(score + 1, left - 1, right))
                list.add("(" + s);
            for (String s: fun2(score - 1, left, right - 1))
                list.add(")" + s);
        }
        return list;
    }


    public static void main(String[] args) {
        GenerateParenthesis generateParenthesis = new GenerateParenthesis();
        System.out.println(generateParenthesis.generateParenthesis(8));
    }
}
