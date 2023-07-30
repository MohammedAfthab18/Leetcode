class Solution {
    public int[] productExceptSelf(int[] nums) {
           int[] res=new int[nums.length];
        for(int i=0, pre=1, suf=1, n=nums.length;i<n; res[i]=(res[i]!=0 || i>=((n%2==0)?0:1)+n/2)?res[i]*pre:pre, pre*=nums[i],res[n-i-1]=(res[n-i-1]!=0 || i>=n/2)?res[n-i-1]*suf:suf, suf*=nums[n-i-1], i++);
        return res;
        
    }
}