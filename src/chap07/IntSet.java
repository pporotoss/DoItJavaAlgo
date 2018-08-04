package chap07;

public class IntSet {
    private int max;
    private int num;
    private int[] set;
    
    public IntSet(int capacity) {
        set = new int[capacity];
        max = capacity;
    }
    
    public int capacity() {
        return this.max;
    }
    
    public int size() {
        return this.num;
    }
    
    public int indexOf(int n) {
        for (int i = 0; i < num; i++) {
            if(set[i] == n) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean contains(int n) {
        return indexOf(n) > -1;
    }
    
    public boolean add(int n) {
        if(num >= max || contains(n)) {
            return false;
        }
    
        set[num++] = n;
        return true;
    }
    
    public boolean remove(int n) {
        int idx;
        idx = indexOf(n);
        if(num <= 0 || idx == -1) {
            return false;
        }
        
        set[idx] = set[--num];
        return true;
    }
    
    public void copyTo(IntSet s) {
        int n = Math.min(this.num, s.max);
    
        for (int i = 0; i < n; i++) {
            s.set[i] = set[i];
        }
    
        s.num = n;
    }
    
    public void copyFrom(IntSet s) {
        int n = Math.min(this.max, s.num);
        for (int i = 0; i < n; i++) {
            set[i] = s.set[i];
        }
    
        this.num = n;
    }
    
    
    public boolean equalTo(IntSet s) {
        if(this.num != s.num) {
            return false;
        }
    
        for (int i = 0; i < num; i++) {
            int j = 0;
            for ( ; j < s.num; j++) {
                if(set[i] == s.set[j]){
                    break;
                }
            }
            
            if(j == s.num) {
                return false;
            }
        }
        
        return true;
    }
    
    public void unionOf(IntSet s1, IntSet s2) {
        copyFrom(s1);
        for (int i = 0; i < s2.num; i++) {
            add(s2.set[i]);
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{ ");
        for (int i = 0; i < num; i++) {
            sb.append(set[i] + " ");
        }
        sb.append("}");
        return sb.toString();
    }
}
