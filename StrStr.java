public class StrStr {
    public int strStr(String haystack, String needle) {
        int haystack_len = haystack.length();
        int needle_len = needle.length();
        if (haystack_len == 0 || needle_len == 0 || needle_len > haystack_len)
            return -1;
        char first = needle.charAt(0);
        for (int i = 0; i < haystack_len - needle_len + 1; i ++){
            if (haystack.charAt(i) == first){
                int j = 0;
                for (; j < needle_len; j ++)
                    if (haystack.charAt(i + j) != needle.charAt(j))
                        break;
                if (j == needle_len)
                    return i;
            }
        }

        return -1;
    }

    public int strStr_kmp(String haystack, String needle) {
        int haystack_len = haystack.length();
        int needle_len = needle.length();
        if (haystack_len == 0 || needle_len == 0 || needle_len > haystack_len)
            return -1;
        int[] next = new int[needle_len];
        next[0] = 0;
        for (int i = 1, j = 0; i < needle_len; i ++){
            while (j > 0 && needle.charAt(i) != needle.charAt(j))
                j = next[j - 1];
            if (needle.charAt(i) == needle.charAt(j))
                j ++;
            next[i] = j;
        }
        for (int k = 0, p = 0; k < haystack_len; k ++){
            while (p > 0 && haystack.charAt(k) != needle.charAt(p))
                p = next[p - 1];
            if (haystack.charAt(k) == needle.charAt(p))
                p ++;

            if (p == needle_len)
                return k - p + 1;

        }
        return -1;

    }

    public static void main(String[] args) {
        StrStr strStr = new StrStr();
        int a = strStr.strStr_kmp("aab", "ab");
        System.out.println();
    }
}
