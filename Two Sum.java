class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    //System.out.println(i+" "+j);
                    return new int[]{i,j};
                }
                else
                continue;
            }
        }
        //System.out.println(n);
        return new int[]{};
    }
    
}
