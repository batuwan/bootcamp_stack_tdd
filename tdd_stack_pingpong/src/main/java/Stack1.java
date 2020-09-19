import java.util.ArrayList;
import java.util.List;

public class Stack1 {

    private List<String> stack = new ArrayList<String>();


    public List<String> getStack() {
        return stack;
    }

    public void setStack(List<String> stack) {
        this.stack = stack;
    }

    public String push(String item){
        if(item == null){
            throw new IllegalArgumentException("Input must not be null!");
        }
        stack.add(item);
        return item;

    }


    public String pop() {
        if(stack.isEmpty()){
            throw new IllegalArgumentException("Stack is empty!");
        }
        return stack.remove(stack.size() -1);
    }

    public String peek() {
        if(stack.isEmpty()){
            throw new IllegalArgumentException("Stack is empty!");
        }
        return stack.get(stack.size() -1);
    }
}
