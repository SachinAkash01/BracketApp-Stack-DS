package Code;

/**
 *
 * @author it21351372
 */
public class stack {
    private int maxSize;
    private char stackArray[];
    private int top;
    
    public stack(int maxSize){
        this.maxSize = maxSize;
        stackArray = new char[maxSize];
        top = -1;
    }
    
    public boolean isFull(){
        if (top == (maxSize - 1)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }
    
    public void push(char value){
        if (isFull()){
            System.out.println("Stack is full");
        }
        else{
            stackArray[++top] = value;
        }
    }
    
    public char pop(){
        if (isEmpty()){
            return '*';
        }
        else{
            return stackArray[top--];
        }
    }
    
    public char peek(){
        if (isEmpty()){
            return '*';
        }
        else{
            return stackArray[top];
        }
    }
}
