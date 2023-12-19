public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        String start = strs[0];
        int length = strs.length;
        int count = strs[0].length();
        int index = 0;
        for (; index < count; index++) {
            char c = strs[0].charAt(index);
            for (int i = 1; i < length; i++){
                if (index == strs[i].length() || c != strs[i].charAt(index))
                    return start.substring(0, index);
            }
        }
        return start.substring(0, index);
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}
