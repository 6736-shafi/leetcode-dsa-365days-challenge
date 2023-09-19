class Solution {
    public int reachNumber(int target) {
        int sum=0,step=0;
        target=Math.abs(target);

        while(sum<target){
            sum+=step;
            step++;

        }
       while((sum-target)%2==1){
            sum+=step;
            step++;
                
        }
        return step-1;
    }
}