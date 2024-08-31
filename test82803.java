import java.util.Scanner;

public class test82803 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        int n = Integer.parseInt(str1);
        String str = scanner.next();
        int score = 0;
        int length = 0;
        int flag = -1;
        if (n == 0)
            System.out.print(0);
        else{
            for (int i = 0 ; i < n; i ++){
                if (str.charAt(i) == '('){
                    if (flag == 1 && score != 0){
                        length = 0;
                        break;
                    }

                    score ++;
                    flag = -1;
                }

                else if(str.charAt(i) == ')'){
                    if (flag == -1 && score <= 0)
                        break;
                    score --;
                    flag = 1;
                    if (score < 0)
                        break;
                    else
                        length += 2;
                }
            }
        }

        System.out.print(length);

    }
}
