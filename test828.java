import java.util.Scanner;

public class test828 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i ++) {
            a[i] = scanner.nextInt();
        }

        for(int i = 0; i < n; i ++) {
            b[i] = scanner.nextInt();
        }

        int score = 0;
        int flag = 0;
        if (n < 2)
            System.out.print(0);

        for (int i = 1; i < n; i ++){
            if (a[i] - a[i - 1] == b[i] - b[i - 1]){
                if (flag == 0){
                    score ++;
                    flag = 1;
                }

            }else
                flag = 0;


        }
        System.out.print(score);

    }
}
