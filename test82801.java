import java.util.Scanner;

public class test82801 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();;
        int b = scanner.nextInt();;
        int number = 0;
        number += (a / 1000 % 10 - b / 1000 % 10 + 10) % 10;
        number += (a / 100 % 10 - b / 100 % 10 + 10) % 10;
        number += (a / 10 % 10 - b / 10 % 10 + 10) % 10;
        number += (a % 10 - b % 10 + 10) % 10;

        System.out.println(number);

    }
}
