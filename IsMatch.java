public class IsMatch {
    public boolean isMatch(String s, String p) {
        if(s == null && p == null)
            return true;
        if(s == null || p == null)
            return false;
        return starMatch(s, p, s.length() - 1, p.length() - 1);
    }

    boolean starMatch(String s, String p, int i, int j){
        if (i == -1 && j == -1)
            return true;
        if (j == -1)
            return false;
        if(p.charAt(j) != '*'){
            if (i == -1)
                return false;
            if(p.charAt(j) != s.charAt(i) && p.charAt(j) != '.')
                return false;
            else
                return starMatch(s, p, i - 1, j - 1);
        }
        else {
            if (i == -1 && j == 1)
                return true;
            else if (i == -1)
                return starMatch(s, p, i, j - 2);

            if (p.charAt(j - 1) != s.charAt(i) && p.charAt(j - 1) != '.')
                return starMatch(s, p, i, j - 2);
            else{
                return starMatch(s, p, i, j - 2) | starMatch(s, p, i - 1, j);
            }
        }
    }


    public static void main(String[] args) {
        IsMatch isMatch = new IsMatch();
        System.out.println(isMatch.isMatch("aab", "c*a*b"));
    }
}
