public class SearchInsertPosition_35 {

    public static void main(String[] args) {
        int[] x = {0,1,2,2,3,0,4,2};
        int y = 2;
        System.out.println(searchInsert(x,y));
    }

    public static int searchInsert(int[] nums, int target) {
        if( target > 10000 || target < -10000 || nums.length < 1 || nums.length > 10000 )
            return -1;
        for (int i = 0 ; i< nums.length ; i++) {
            if(nums[i] >= target)
                return i;
        }
        return nums.length;
    }
}
