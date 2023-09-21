class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int[] arr= new int[n];
         int start=0;
         int end=n-1;
        for(int i=0;i<n;i++){
              if(nums[i]%2==0) arr[start++]=nums[i];
              else arr[end--]=nums[i];
        }
        return arr;
    }
}