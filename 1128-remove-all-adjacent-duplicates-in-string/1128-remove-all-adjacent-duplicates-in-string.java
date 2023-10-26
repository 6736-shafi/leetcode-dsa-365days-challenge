class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character>  stack = new Stack<>();

        for(int i=0;i<s.length();i++){

            if(stack.isEmpty() || s.charAt(i)!=stack.peek()){
                stack.push(s.charAt(i));
            }else
            stack.pop();
        }
        while(!stack.isEmpty())
          sb.append(stack.pop());

        return sb.reverse().toString();
    }
}