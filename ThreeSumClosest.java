import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3)
            return 0;
        Arrays.sort(nums);
        int len = nums.length;
        int i = 0;
        int l = 1;
        int r = len - 1;
        int result = nums[i] + nums[l] + nums[r];
        for (; i < len - 2; i ++){
            l = i + 1;
            r = len - 1;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            while (l <  r){
                int sum = nums[i] + nums[l] + nums[r];
                if (Math.abs(sum - target) < Math.abs(result - target))
                    result = sum;
                if (sum == target){
                    return target;
                }
                else if (sum > target){
                    r--;
                }else {
                    l++;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        ThreeSumClosest threeSumClosest = new ThreeSumClosest();
        System.out.println(threeSumClosest.threeSumClosest(new int[]{-100,-98,-2,-1}, -101));
    }
}
