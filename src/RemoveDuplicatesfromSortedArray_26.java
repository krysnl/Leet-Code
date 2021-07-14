public class RemoveDuplicatesfromSortedArray_26 {

    public static void main(String[] args) {
        int[] x = {1,1,2};
        System.out.println(removeDuplicates(x));
    }

    public static int removeDuplicates(int[] nums) {
        int a = nums.length;
        int count = 0 ;
        for (int i = 0; i < a - (1+count); ) {
            if (nums[i] == nums[i + 1]) {
                count++;
                for (int j = i; j < a - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                continue;
            }
            i++;
        }
        return a-count;
    }
}
