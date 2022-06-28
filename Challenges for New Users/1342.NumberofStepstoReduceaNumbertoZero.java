class Solution {
    public int numberOfSteps(int num) {
        int ret = 0;
        while (num != 0){
            ret++;
            if(num%2 == 0)
                num = num/2;
                else
                    num--;
        }
        return ret;
    }
}
