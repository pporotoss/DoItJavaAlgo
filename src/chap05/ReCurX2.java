package chap05;

import chap04.IntStack;

public class ReCurX2 {
    
    static void recur(int n) {
        IntStack stack = new IntStack(n);
        
        while (true) {
            if(n > 0) {
                stack.push(n);
                n = n - 1;
                continue;
            }
            if(stack.isEmpty() == false) {
                n = stack.pop();
                System.out.println(n);
                n = n - 2;
                continue;
            }
            break;
        }
    }
    
    public static void main(String[] args) {
        recur(4);
    }
    
}
