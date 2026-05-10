class Solution {
    public int lengthOfLastWord(String s) {
        int k=0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)!=' ') k++;
            if(k>0 && s.charAt(i)==' ') break;
        }
        return k;
    }
}