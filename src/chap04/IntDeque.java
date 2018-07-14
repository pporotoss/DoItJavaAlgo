package chap04;

public class IntDeque {
    
    private int max;
    private int num;
    private int front;
    private int rear;
    private int[] que;
    
    public IntDeque(int capacity) {
        try {
            this.que = new int[capacity];
            this.max = capacity;
        }
        catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
    }
    
    public int enqueFront(int item) throws OverflowIntDequeException {
        if(num >= max) {
            throw new OverflowIntDequeException();
        }
        front--;
        if(front < 0) {
            front = max - 1;
        }
        
        que[front] = item;
        
        num++;
        return item;
    }
    
    public int enqueRear(int item) throws OverflowIntDequeException {
        if(num >= max) {
            throw new OverflowIntDequeException();
        }
    
        que[rear++] = item;
        if(rear >= max) {
            rear = 0;
        }
        num++;
        
        return item;
    }
    
    
    public int dequeFront() throws EmptyIntDequeException {
        if(num == 0) {
            throw new EmptyIntDequeException();
        }
    
        int ret = que[front++];
        if(front >= max) {
            front = 0;
        }
        num--;
        
        return ret;
    }
    
    
    public int dequeRear() throws EmptyIntDequeException {
        if(num == 0) {
            throw new EmptyIntDequeException();
        }
        rear--;
        if(rear < 0) {
            rear = max - 1;
        }
        num--;
        
        return que[rear];
    }
    
    
    public int peekFront() throws EmptyIntDequeException {
        if(num == 0) {
            throw new EmptyIntDequeException();
        }
        
        return que[front];
    }
    
    
    public int peekRear() throws EmptyIntDequeException {
        if(num == 0) {
            throw new EmptyIntDequeException();
        }
    
        return que[rear == 0 ? max - 1 : rear - 1];
    }
    
    public int indexOf(int item) {
    
        for (int i = 0; i < max; i++) {
            int idx = (i + front) % max;
            if(que[idx] == item) {
                return idx;
            }
        }
    
        return -1; // 검색실패
    }
    
    
    public int search(int item) {
    
        for (int i = 0; i < max; i++) {
            int idx = (i + front) % max;
            if(que[idx] == item) {
                return i + 1;
            }
        }
        
        return 0;
    }
    
    
    public void clear() {
        front = rear = num = 0;
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
    
    public static class EmptyIntDequeException extends RuntimeException {}
    
    public static class OverflowIntDequeException extends RuntimeException {}
    
    
}
