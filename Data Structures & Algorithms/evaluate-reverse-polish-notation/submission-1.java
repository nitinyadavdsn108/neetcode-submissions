class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int i=0;
        int output = 0;
        while(i< tokens.length){
            String ch = tokens[i];
            if( ch.equals("+") || ch.equals("-") || ch.equals("*")|| ch.equals("/")){
                int left_op = st.pop();
                int right_op = st.pop();
                
                if(ch.equals("+")){
                        output = right_op + left_op;
                        st.push(output);
                }else if(ch.equals("*")){
                        output = right_op * left_op;
                        st.push(output);
                }else if(ch.equals("-")){
                        output = right_op - left_op;
                        st.push(output);
                }else if(ch.equals("/")){
                        output = right_op / left_op;
                        st.push(output);

                }
            }else{

            output = Integer.parseInt(tokens[i]) ;
            st.push(output);
            }
            
            

            i++;
        }
        
    return output;
    }
}
