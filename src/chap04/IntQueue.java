package chap04;

public class IntQueue {
    
    private int max;
    private int front;
    private int rear;
    private int num;
    private int[] que;
    
    public IntQueue(int capacity) {
        try{
            this.que = new int[capacity];
            this.max = capacity;
        }
        catch (OutOfMemoryError e){
            throw e;
        }
    }
    
    public int enque(int x) throws OverflowIntQueueException {
        if(num >= max) {
            throw new OverflowIntQueueException();
        }
        que[rear++] = x;
        num++;
        if(rear == max) {
            rear = 0;
        }
        return x;
    }
    
    public int deque() throws EmptyIntQueueException {
        if(num <= 0) {
            throw new EmptyIntQueueException();
        }
    
        int x = que[front++];
        num--;
        
        if(front == max) {
            front = 0;
        }
    
        return x;
    }
    
    public int peek() throws EmptyIntQueueException {
        if(num <= 0) {
            throw new EmptyIntQueueException();
        }
    
        return que[front];
    }
    
    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % max;
            if(que[idx] == x) {
                return idx;
            }
        }
        return -1;
    }
    
    public void clear() {
        num = front = rear = 0;
    }
    
    public int capacity() {
        return max;
    }
    
    public int size() {
        return num;
    }
    
    public boolean isEmpty() {
        return num <= 0;
    }
    
    public boolean isFull() {
        return num >= max;
    }
    
    public int search(int x) {
        for (int i = 0; i < max; i++) {
            int idx = (i + front) % max;
            if(que[idx] == x) {
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
    
    
    public static class EmptyIntQueueException extends RuntimeException {}
    public static class OverflowIntQueueException extends RuntimeException {}
    
}
