package Stack.Problems;

import java.util.Stack;

public class SortingOfStack {
    static void  sort(Stack<Integer> s){
        Stack<Integer> tempStack = new Stack<>();

        while(!s.isEmpty()){
            int temp = s.pop();
            while(!tempStack.isEmpty() && tempStack.peek() > temp){
                //This makes a room for the temp to be inserted in its
                //correct sorted position in temp stack;
                s.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        //correct stack structure with the smallest element at the top.
        while(!tempStack.isEmpty()){
            s.push(tempStack.pop());
        }

    }
    public static void print(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(34);
        s.push(23);
        s.push(67);
        s.push(12);
        sort(s);
        print(s);

    }
}
