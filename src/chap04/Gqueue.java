package chap04;

import java.util.Arrays;

public class Gqueue<E>{
    
    private int max;
    private int num;
    private int front;
    private int rear;
    private E[] que;
    
    public Gqueue(int capacity) {
        try {
            que = (E[]) new Object[capacity];
            this.max = capacity;
        }
        catch (OutOfMemoryError e){
            e.printStackTrace();
        }
    }
    
    
    public E enque(E item) throws OverflowGqueueException {
        if(num >= max) {
            throw new OverflowGqueueException();
        }
        que[rear++] = item;
        num++;
        if(rear >= max) {
            rear = 0;
        }
        
        return item;
    }
    
    
    public E deque() throws EmptyGqueueException {
        if(num <= 0) {
            throw new EmptyGqueueException();
        }
        E item = que[front++];
        num--;
        if(front>= max) {
            front = 0;
        }
        
        return item;
    }
    
    
    public E peek() throws EmptyGqueueException {
        if(num <= 0) {
            throw new EmptyGqueueException();
        }
        return que[front];
    }
    
    
    public int indexOf(E item) {
    
        for (int i = 0; i < max; i++) {
            int idx = (i + front) % max;
            if(que[idx].equals(item)) {
                return idx;
            }
        }
        
        return -1;
    }
    
    
    public void clear() {
        Arrays.fill(que, null);
        num = front = rear = 0;
    }
    
    
    public int capacity() {
        return max;
    }
    
    
    public int size() {
        return num;
    }
    
    
    public boolean isEmpty() {
        return num == 0;
    }
    
    
    public boolean isFull() {
        return num == max;
    }
    
    
    public int search(E item) {
        for (int i = 0; i < max; i++) {
            int idx = (i + front) % max;
            if(que[idx].equals(item)) {
                return i + 1;
            }
        }
        return 0;
    }
    
    public void dump() {
        if(num <= 0) {
            System.out.println("큐가 비어 있습니다.");
        }
        else {
            for (int i = 0; i < num; i++) {
                System.out.print(que[(i + front) % max] + " ");
            }
            System.out.println();
        }
    }
    
    public static class EmptyGqueueException extends RuntimeException {}
    public static class OverflowGqueueException extends RuntimeException {}
    
}
