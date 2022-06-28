class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] mag = new int[26];
        int [] not = new int[26];
        for(char x : magazine.toCharArray()){
            mag[x-'a']++;
        }
        for(char x : ransomNote.toCharArray()){
            not[x-'a']++;
        }
        for(int i = 0 ; i<26 ; i++)
            if (not[i]>mag[i])
                return false;
        return true;
    }
}
