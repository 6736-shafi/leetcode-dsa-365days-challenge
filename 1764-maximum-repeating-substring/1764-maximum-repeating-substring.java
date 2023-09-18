class Solution {
    public int maxRepeating(String sequence, String word) {

        String wordToFind=word;
        int count=0,beg=0;
        while(true){

            int ind=sequence.substring(beg).indexOf(wordToFind);
            if(ind==-1) return count;
            else{
                                count++;
                                 wordToFind +=word;
                                  beg=ind;
            }
            
        }

       
    }
}