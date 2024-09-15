package Code;

/**
 *
 * @author it21351372
 */
public class bracketChecker {
    String input;

    public bracketChecker(String input) {
        this.input = input;
    }
    
    public boolean check(){
        stack st = new stack(input.length());
        
        for(int i=0; i<input.length(); i++){
            switch (input.charAt(i)){
                case '{':
                case '[':
                case '(':
                    st.push(input.charAt(i));
                    break;
                case '}':
                    if (st.pop() != '{'){
                        return false;
                    } break;
                case ']':
                    if (st.pop() != '['){
                        return false;
                    } break;
                case ')':
                    if (st.pop() != '('){
                        return false;
                    } break;
            }
        }
        if (st.isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }
}


