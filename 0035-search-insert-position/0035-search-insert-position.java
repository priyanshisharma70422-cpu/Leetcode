class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            boolean found=false;
            if(nums[mid]==target){
                found=true;
                return mid;
            }
            if(target>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }  
        return start;    
        
    }
}