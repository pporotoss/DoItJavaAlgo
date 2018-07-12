package chap04;

import java.util.Arrays;

public class Gstack<E> {
    
    private E stk[];
    private int ptr;
    private int max;
    
    public Gstack (int capacity) {
        this.max = capacity;
        try {
            this.stk = (E[])new Object[capacity];
        }
        catch (OutOfMemoryError e) {
            this.max = 0;
        }
    }
    
    public void push(E item) throws OverflowGStackException {
        if(ptr >= max) {
            throw new OverflowGStackException();
        }
        this.stk[ptr++] = item;
    }
    
    public E pop() throws EmptyGStackExcetpion {
        if(ptr <= 0) {
            throw new EmptyGStackExcetpion();
        }
        E ret = this.stk[--ptr];
        this.stk[ptr] = null;
        return ret;
    }
    
    public E peek() throws EmptyGStackExcetpion {
        if(ptr <= 0) {
            throw new EmptyGStackExcetpion();
        }
        return this.stk[ptr - 1];
    }
    
    public int size() {
        return this.ptr;
    }
    
    public boolean isEmpty() {
        return this.ptr <= 0;
    }
    
    public boolean isFull() {
        return this.ptr >= max;
    }
    
    public int indexOf(E item) {
        for (int i = ptr - 1; i >= 0; i--) {
            if(stk[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }
    
    public void clear() {
        this.ptr = 0;
        Arrays.fill(stk, null);
    }
    
    public int capacity() {
        return this.max;
    }
    
    public static class EmptyGStackExcetpion extends RuntimeException {
        public EmptyGStackExcetpion() {
            super();
        }
    
        public EmptyGStackExcetpion(String message) {
            super(message);
        }
    
        public EmptyGStackExcetpion(String message, Throwable cause) {
            super(message, cause);
        }
    
        public EmptyGStackExcetpion(Throwable cause) {
            super(cause);
        }
    
        protected EmptyGStackExcetpion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }
    
    public static class OverflowGStackException extends RuntimeException {
        public OverflowGStackException() {
            super();
        }
    
        public OverflowGStackException(String message) {
            super(message);
        }
    
        public OverflowGStackException(String message, Throwable cause) {
            super(message, cause);
        }
    
        public OverflowGStackException(Throwable cause) {
            super(cause);
        }
    
        protected OverflowGStackException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }
    
}
