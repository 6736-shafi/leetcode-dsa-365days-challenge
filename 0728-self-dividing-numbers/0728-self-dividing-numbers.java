class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
            List<Integer> seldiv = new ArrayList<>();
            for(int i=left; i<=right;i++){
                if(isSelfDiv(i)) seldiv.add(i);
            }
            return seldiv;
    }
   public boolean   isSelfDiv(int num){
       for(char c : String.valueOf(num).toCharArray()){
           if( c== '0'  || num % (c-'0') >0) return false;
       }
       return true;
   }
}