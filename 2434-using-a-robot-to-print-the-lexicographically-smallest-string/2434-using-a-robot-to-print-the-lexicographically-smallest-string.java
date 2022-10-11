class Solution {
   
    public String robotWithString(String s) {
      
       	int startingIndex = 0;
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<26;i++){
			char curr = (char)('a'+i);
			while(stack.size()>0 && stack.peek()<=curr){
				sb.append(stack.pop());
			}
			for(int j=startingIndex;j<s.length();j++){
				if(s.charAt(j)==curr){
					for(int k=startingIndex;k<=j;k++){
						stack.add(s.charAt(k));
					}                   
					sb.append(stack.pop());
					startingIndex = j+1;;
				}
			}
		}
		return sb.toString();
	}
}