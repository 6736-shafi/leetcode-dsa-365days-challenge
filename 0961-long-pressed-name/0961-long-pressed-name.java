class Solution {
    public boolean isLongPressedName(String name, String typed) {

       int n1=name.length();
       int n2=typed.length();
       int ind1=0;
       int ind2=0;
        while(ind1<n1 && ind2<n2){
            
            if(name.charAt(ind1)==typed.charAt(ind2)){
                ind1++;
                ind2++;
                continue;
            }
            if(ind1>0 && name.charAt(ind1-1)==typed.charAt(ind2))
            ind2++;
            else
            return false;

        }
        if(ind1<n1)return false;
        while(ind2<n2){
            if( name.charAt(ind1-1)!=typed.charAt(ind2)) return false;
            ind2++;
        }
        return true;
    }
}