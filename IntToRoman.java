public class IntToRoman {
    public String intToRoman(int num) {
        String s = "";
        int n = 0;
        n = num / 1000;
        num = num % 1000;
        for (int i = 0; i < n; i++)
            s = s.concat("M");

        n = num / 100;
        num = num % 100;
        if (n == 9) s = s.concat("CM");
        else if(n == 4) s = s.concat("CD");
        else if(n >= 5){
            s = s.concat("D");
            for (int i = 0; i < n - 5; i ++)
                s = s.concat("C");
        }
        else{
            for (int i = 0; i < n; i ++)
                s = s.concat("C");
        }

        n = num / 10;
        num = num % 10;
        if (n == 9) s = s.concat("XC");
        else if(n == 4) s = s.concat("XL");
        else if(n >= 5){
            s = s.concat("L");
            for (int i = 0; i < n - 5; i ++)
                s = s.concat("X");
        }
        else{
            for (int i = 0; i < n; i ++)
                s = s.concat("X");
        }

        n = num;
        if (n == 9) s = s.concat("IX");
        else if(n == 4) s = s.concat("IV");
        else if(n >= 5){
            s = s.concat("V");
            for (int i = 0; i < n - 5; i ++)
                s = s.concat("I");
        }
        else{
            for (int i = 0; i < n; i ++)
                s = s.concat("I");
        }


        return s;
    }

    public String intToRoman2(int num){
        int[] n = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] s = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 13; i++){
            while (num >= n[i]){
                num -= n[i];
                result.append(s[i]);
            }
        }
        return String.valueOf(result);
    }
    public static void main(String[] args) {
        IntToRoman intToRoman = new IntToRoman();
        System.out.println(intToRoman.intToRoman2(1994));
    }
}
