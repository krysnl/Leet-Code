class Solution {
    public int pivotIndex(int[] nums) {
        for(int i = 0 ; i< nums.length ; i++)
            if(sum(nums, i))
                return i;
        return -1;
        
    }
    public boolean sum (int [] nums , int x){
        int[] ret = new int[2];  
        for(int i = 0 ; i<x ; i++){
            ret[0] += nums[i];     
        }  
        for(int i = x+1 ; i<nums.length; i++){
              ret[1] += nums[i];
        }
        return ret[1] == ret[0];
    }
}
