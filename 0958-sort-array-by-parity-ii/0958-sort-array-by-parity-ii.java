class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        int odd = 1;

        while(true){
            while(even<nums.length && nums[even]%2 == 0){
                even += 2;
            }
            while(odd<nums.length && nums[odd]%2 == 1){
                odd += 2;
            }
            if(odd >= nums.length || even >= nums.length) break;

            int temp = nums[odd];
            nums[odd] = nums[even];
            nums[even] = temp;
        }
        return nums;
    }
}