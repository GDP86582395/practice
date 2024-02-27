import java.util.*;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> L = new LinkedList<>();
        if (nums == null || nums.length < 4)
            return L;
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len - 3; i++){
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            if ((long)nums[i] + (long)nums[i + 1] + (long)nums[i + 2] + (long)nums[i + 3] > target)
                break;
            if ((long)nums[i] + (long)nums[len - 1] + (long)nums[len - 2] + (long)nums[len - 3] < target)
                continue;
            for (int j = i + 1; j < len - 2; j++){
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                if ((long)nums[i] + (long)nums[j] + (long)nums[j + 1] + (long)nums[i + 2] > target)
                    break;
                if ((long)nums[i] + (long)nums[j] + (long)nums[len - 1] + (long)nums[len - 2] < target)
                    continue;
                int l = j + 1;
                int r = len - 1;
                while (l < r){
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[l] + (long)nums[r];
                    if (sum == target){
                        L.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        while (l < r && nums[r] == nums[--r]);
                        while (l < r && nums[l] == nums[++l]);
                    }else if (sum > target){
                        while (l < r && nums[r] == nums[--r]);
                    }else {
                        while (l < r && nums[l] == nums[++l]);
                    }
                }
            }
        }
        return L;

    }

    public static void main(String[] args) {
        FourSum fourSum = new FourSum();
        System.out.println(fourSum.fourSum(new int[]{1,0,-1,0,-2,2}, 0));
    }
}
