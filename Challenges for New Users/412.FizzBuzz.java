class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ret = new ArrayList<String>();
        for (int i = 1 ; i< n+1 ;i++){
        if(i % 15 == 0)
            ret.add("FizzBuzz");
        else if(i % 5 == 0)
            ret.add("Buzz");
        else if(i % 3 == 0)
            ret.add("Fizz");
        else 
            ret.add(Integer.toString(i));
        }
            return ret;
    }
}
