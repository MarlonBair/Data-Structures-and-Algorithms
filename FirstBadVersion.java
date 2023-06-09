/**
 * @author Marlon Bair - 5/2/23
 * 
 * You are a product manager and currently leading a team to develop a new product. 
 * Unfortunately, the latest version of your product fails the quality check. 
 * 
 * Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * 
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 * You are given an API bool isBadVersion(version) which returns whether version is bad. 
 * 
 * Implement a function to find the first bad version. You should minimize the number of calls to the API.
 */

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int high = n;
        int low = 0;

        // Utilize a binary search to minimize API calls (Ologn time complexity)
        while(low < high) {
            int mid = low + (high - low)/2;         // Get midpoint using this algorithm to help prevent integer overflow
            if(isBadVersion(mid)) { high = mid; }
            else {low = mid + 1; }
        }

        // Return index of first bad version
        return low;
        
    }
}
