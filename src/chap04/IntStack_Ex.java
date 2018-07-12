package chap04;

public class IntStack_Ex {

    enum StackType {
        STACK_A, STACK_B
    }
    
    private int max;
    private int ptrA;
    private int ptrB;
    private int[] stk;
    
    public IntStack_Ex(int capacity) {
        this.max = capacity;
        try {
            this.stk = new int[capacity];
            this.ptrB = max - 1;
        }
        catch (OutOfMemoryError e) {
            this.max = 0;
        }
    }
    
    public void push(StackType type, int item) throws OverflowIntStackException {
        if(ptrA >= ptrB + 1) {
            throw new OverflowIntStackException();
        }
        
        switch (type) {
            case STACK_A:
                stk[ptrA++] = item;
                break;
                
            case STACK_B:
                stk[ptrB--] = item;
                break;
    
            default:
                throw new IllegalArgumentException();
        }
        
    }
    
    public int pop(StackType type) {
    
        switch (type) {
            case STACK_A:
                if(ptrA <= 0) {
                    throw new OverflowIntStackException();
                }
                return stk[--ptrA];
        
            case STACK_B:
                if(ptrB >= max) {
                    throw new OverflowIntStackException();
                }
                return stk[++ptrB];
            
            default:
                throw new IllegalArgumentException();
        }
    }
    
    public int peek(StackType type) {
        
        switch (type) {
            case STACK_A:
                if(ptrA <= 0) {
                    throw new OverflowIntStackException();
                }
                return stk[ptrA - 1];
            
            case STACK_B:
                if(ptrB >= max) {
                    throw new OverflowIntStackException();
                }
                return stk[ptrB + 1];
            
            default:
                throw new IllegalArgumentException();
        }
    }
    
    public int indexOf(StackType type, int item) {
        
        switch (type) {
            case STACK_A:
                for (int i = ptrA - 1; i >= 0; i--) {
                    if(stk[i] == item) {
                        return i;
                    }
                }
                break;
    
            case STACK_B:
                for (int i = ptrB + 1; i < max; i++) {
                    if(stk[i] == item) {
                        return i;
                    }
                }
                break;
    
            default:
                throw new IllegalArgumentException();
        }
        
        return -1;
    }
    
    public void clear(StackType type) {
        switch (type) {
            case STACK_A:
                for (int i = ptrA - 1; i >= 0; i--) {
                    stk[i] = 0;
                }
                this.ptrA = 0;
                break;
        
            case STACK_B:
                for (int i = ptrB + 1; i < max; i++) {
                    stk[i] = 0;
                }
                this.ptrB = max - 1;
                break;
                
            default:
                throw new IllegalArgumentException();
        }
    }
    
    public boolean isEmpty(StackType type) {
        switch (type) {
            case STACK_A:
                return this.ptrA <= 0;
        
            case STACK_B:
                return this.ptrB >= max - 1;
    
            default:
                throw new IllegalArgumentException();
        }
    }
    
    public boolean isFull() {
        return ptrA >= ptrB + 1;
    }
    
    public static class EmptyIntStackExcetpion extends RuntimeException {
        public EmptyIntStackExcetpion() {
            super();
        }
        
        public EmptyIntStackExcetpion(String message) {
            super(message);
        }
        
        public EmptyIntStackExcetpion(String message, Throwable cause) {
            super(message, cause);
        }
        
        public EmptyIntStackExcetpion(Throwable cause) {
            super(cause);
        }
        
        protected EmptyIntStackExcetpion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }
    
    public static class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {
            super();
        }
        
        public OverflowIntStackException(String message) {
            super(message);
        }
        
        public OverflowIntStackException(String message, Throwable cause) {
            super(message, cause);
        }
        
        public OverflowIntStackException(Throwable cause) {
            super(cause);
        }
        
        protected OverflowIntStackException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }
}
