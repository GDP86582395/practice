public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        if (length == 0)
            return 0;
        int a = 0;
        int b = 0;
        while (b < length){
            if (nums[b] == val)
                b ++;
            else
                nums[a++] = nums[b++];
        }
        return a;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {0,0,1,1,1,2,2,3,3,4,4};
        int a = removeElement.removeElement(nums, 2);
        System.out.println();
    }
}
