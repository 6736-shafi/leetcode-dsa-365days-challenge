class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;

        int[] out= new int[N];
        out[0] = 1;

        for(int i=1;i<N;i++ ){
            out[i] = nums[i-1 ] * out[i-1];
        }

        int R=1;
        for(int i=N-1; i>=0;i--){
             out[i]=out[i]*R;
             R =R * nums[i];
        }
        return out;

    }
}