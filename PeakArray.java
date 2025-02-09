public class PeakArray {
    public int findPeakElement(int[] nums) {
        if(nums == null || nums.length == 0) return -1; 
        int low = 0, high = nums.length - 1;
        while(low <= high) { 
            int mid = low + (high - low)/2; 
            if((mid == nums.length-1 || nums[mid] > nums[mid+1]) 
               && (mid == 0 || nums[mid-1] < nums[mid])) 
                return mid; 
            else if(nums[mid] < nums[mid+1]){ 
                low = mid + 1;
            } else { 
                high = mid - 1;
            }
        }
        return nums.length-1;
    }    
}
