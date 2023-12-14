import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RomanToInt {
    public int romanToInt(String s) {
        int result = 0;
        int flag = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++){
            int value = getValue(s.charAt(i));
            if (value > flag)
                result -= flag;
            else
                result += flag;
            flag = value;
        }
        return result + flag;
    }
    private int getValue(Character c){
        if(c == 'I')
            return 1;
        else if (c == 'V')
            return 5;
        else if (c == 'X')
            return 10;
        else if (c == 'L')
            return 50;
        else if (c == 'C')
            return 100;
        else if (c == 'D')
            return 500;
        else if (c == 'M')
            return 1000;
        else
            return 0;
    }

    public static void main(String[] args) {
        RomanToInt romanToInt = new RomanToInt();
        System.out.println(romanToInt.romanToInt("MCMXCIV"));
    }
}
