public class MaximumSubarray_53 {
    public static void main(String[] args) {
        int[] x = {-3,-2,1,2,2,0,1,0};
        System.out.println(maxSubArray(x));
    }

    public static int maxSubArray(int[] nums) {
        int max = nums[0] ;
        int sum= 0;
        for(int i = 0 ;i<nums.length ; i++){
            sum += nums[i];
            if (max < sum) {
                max = sum;
            }
            else if (0 > sum) {
                sum = 0;
            }
            if (nums[i] > max){
                max = nums[i];
                sum = nums[i];
            }
        }
        return max;
    }
}
