public class TwoSum_1 {

    public static void main(String[] args) {
        int [] nums = {3,2,4};
        int target = 6;
    }
    public static int[] twoSum(int[] nums, int target) {
        int [] arr = new int[2];
        for (int i = 0 ; i< nums.length ; i++){
            for (int j = i+1 ; j<nums.length ; j++){
                if (i == j)
                    continue;
                if(nums[i] + nums[j] == target ){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }
}
