public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length == 0 || length == 1)
            return length;
        int b = 0;
        int k = 0;
        for (int i = 1; i < length; i ++){
            if (nums[b] == nums[i])
                continue;
            nums[k++] = nums[b];
            b = i;
        }
        nums[k++] = nums[b];
        return k;
    }

    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] nums = {0,0,1,1,1,2,2,3,3,4,4};

        int a = removeDuplicates.removeDuplicates(nums);
        System.out.println();
    }
}
