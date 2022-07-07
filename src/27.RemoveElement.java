public class RemoveElement_27 {
    public static void main(String[] args) {
        int[] x = {0,1,2,2,3,0,4,2};
        int y = 2;
        System.out.println(removeElement(x,y));
    }

    public static int removeElement(int[] nums, int val) {
        int a = nums.length;
        int count = 0 ;
        for (int i = 0; i < a - count; ) {
            if (nums[i] == val) {
                count++;
                nums[i] = nums[a-count];
                continue;
            }
            i++;
        }
        return a-count;
    }
}
