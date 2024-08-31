public class MinIncrements {
    public int minIncrements(int n, int[] cost) {
        if (n == 0 || n == 1)
            return 0;
        int number = n / 2;
        int max = fun(cost, number);
        int sum = max;
        for (int i = 1; i < number + 1; i++){
            int a = fun(cost, number + i);
            sum += a;
            if (max < a)
                max = a;
        }
        return max * (number + 1) - sum;
    }

    int fun(int[] cost, int n){
        if (n == 0)
            return cost[0];
        return cost[n] + fun(cost, (n - 1) / 2);
    }



    public static void main(String[] args) {
        int[] nums = {1,5,2,2,3,3,1};
        MinIncrements minIncrements = new MinIncrements();
        int a = minIncrements.minIncrements(7, nums);
        System.out.println();
    }
}
