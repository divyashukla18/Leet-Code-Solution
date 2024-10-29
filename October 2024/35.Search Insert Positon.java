class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=nums.length,s=0,e=l;
        while(s<e)
        {
            
            int mid= (s+e)/2;
            if(target==nums[mid])
                return mid;
            if(nums[mid]<target)  
                s=mid+1;
            else
                e=mid;      
            }
            return s;
        }
    public static void main(String args[]){
        Solution obj = new Solution();
        int nums[]={2,34,67,89,90};
        System.out.println(obj.searchInsert(nums,13));
    }
}