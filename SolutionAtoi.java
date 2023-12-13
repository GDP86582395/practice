

public class SolutionAtoi {
    public int myAtoi(String s) {
        int start = 0;
        int isPositiveNumber = 1;
        int result = 0;
        int length = s.length();
        for(int i = 0; i < length; i++){
            char c = s.charAt(i);
            if(start==0 && c == '+') {
                start = 1;
            }
            else if(start==0 && c == ' '){

            }

            else if(start==0 && c == '-') {
                isPositiveNumber = -1;
                start = 1;
            }
            else if((c - '9') <= 9 && (c - '0') >= 0) {
                start = 2;
            }
            else if(start == 0 || start==1)
                return 0;

            if(start == 2){
                if((c - '9') > 9 || (c - '0') < 0)
                    break;
                try {
                    result = Math.addExact(Math.multiplyExact(result, 10), (c - '0'));
                }catch (Exception e){
                    if(isPositiveNumber == 1)
                        return Integer.MAX_VALUE;
                    else
                        return Integer.MIN_VALUE;
                }

            }
        }
        return result * isPositiveNumber;
    }

    public static void main(String[] args) {
        SolutionAtoi solutionAtoi = new SolutionAtoi();
        System.out.println(solutionAtoi.myAtoi("        +12345445646464646dsaw"));
    }
}


