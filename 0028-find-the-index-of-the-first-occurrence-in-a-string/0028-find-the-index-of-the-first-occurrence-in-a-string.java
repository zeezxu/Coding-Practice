class Solution {
    public int strStr(String haystack, String needle) {
        int n1 = haystack.length();
        int n2 = needle.length();

        for(int windowstart = 0; windowstart <= n1-n2; windowstart++){
            for(int i = 0; i < n2; i++){
                if(needle.charAt(i) != haystack.charAt(windowstart+i)){
                    break;
                }
                if (i == n2-1){
                    return windowstart;
                }
            }
        }
        return -1;
    }
}        