import java.util.ArrayList;
public class MinStack {
    public ArrayList<Integer> stack = new ArrayList<Integer>();
    public MinStack() {}
    
    public void push(int val) {
        this.stack.add(val);
    }
    
    public void pop() {
        stack.remove(stack.size()-1);
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < stack.size(); i++){
            if(stack.get(i) < smallest)
                smallest = stack.get(i);
        }

        return smallest;
    }

    public static void main(String[] args) {
        MinStack newStack = new MinStack();
        newStack.push(-2);
        newStack.push(0);
        newStack.push(-3);
        System.out.println(newStack.getMin());// return -3
        newStack.pop();
        System.out.println(newStack.top());   // return 0
        System.out.println(newStack.getMin());// return -2
    }
}

//overall O(n) implementation only for the getMin() function. 