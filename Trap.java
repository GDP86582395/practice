public class Trap {
    public int trap(int[] height) {
        int n = height.length;
        return water(height, n - 1);
    }

    int water(int[] height, int n){
        if(n == 0 || n == 1)
            return 0;
        if (height[n] < height[n - 1])
            return water(height, n - 1);
        else{
            int m = n - 2;
            for (int i = n - 1; i >= 0; i--){
                if (height[m] <= height[i])
                    m = i;
                if (height[m] > height[n])
                    break;
            }
            if (height[m] <= height[n - 1])
                return 0;
            else {
                int min = Math.min(height[m], height[n]);
                int result = 0;
                for (int i = m + 1; i < n; i++)
                    result += min - height[i];
                return result + water(height, m);
            }
        }
    }

    public static void main(String[] args) {
        Trap trap = new Trap();
        int[] height = {5,4,1,2};
        System.out.println(trap.trap(height));
    }
}
