/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int l = 0;
        int r = n;
        int mid = 0;
        while(l<=r){
            mid = l+(r-l)/2;
            if(isBadVersion(mid)){
                r = mid -1;
            }
            else{
                l = mid + 1;
            }
        }
        return l;
        
    }
}