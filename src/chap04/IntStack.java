package chap04;

public class IntStack {
    private int max;
    private int ptr;
    private int[] stk;
    
    public class EmptyIntStackExcetpion extends RuntimeException {}
    
    public class OverflowIntStackException extends RuntimeException {}
    
    public IntStack(int capacity) {
        this.ptr = 0;
        this.max = capacity;
        try {
            stk = new int[max];
        }
        catch (OutOfMemoryError e) {
            this.max = 0;
        }
    }
}
