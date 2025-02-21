class Solution {
    public void reverse(char[] s, int i, int j){
        while (i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
    }
    public int reverse(int x) {
        String s = "" + x;
        
        char[] arr = s.toCharArray();

        int i = 0; int j = arr.length-1;

        if (arr[0] == '-'){
            i = 1;
        };

        reverse(arr, i, j);
        long y = Long.parseLong(new String(arr));

        if (y > Integer.MAX_VALUE || y < Integer.MIN_VALUE){
            return 0;
        } 
        return (int)y;
    }    
}