class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> bracketsMap = Map.of(
            '(',')',
            '[',']',
            '{','}'
        );
   
  
        for(char ch : s.toCharArray()){
            if(bracketsMap.containsKey(ch)){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                Character popped = stack.pop();
                if(!bracketsMap.get(popped).equals(ch)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
