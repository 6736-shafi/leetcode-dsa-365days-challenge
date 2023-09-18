class Solution {
    public String reversePrefix(String word, char ch) {

        int ind=word.indexOf(ch);
        StringBuilder sb= new StringBuilder(word.substring(0,ind+1));
        sb.reverse();
        sb.append(word.substring(ind+1));
        return sb.toString();
        
    }
}