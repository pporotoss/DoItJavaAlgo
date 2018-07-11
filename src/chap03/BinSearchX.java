package chap03;

public class BinSearchX {
    
    static int binSearchX(int[] array, int n, int key) {
        int pl = 0;
        int pr = n - 1;
        
        while (pl <= pr) {
            int pc = (pl + pr) / 2;
            if(array[pc] == key) {
                return getfirstIndex(array, key, pc);
            }
            else if(array[pc] < key) {
                pl = pc + 1;
            }
            else {
                pr = pc - 1;
            }
        }
        
        return -1;
    }
    
    private static int getfirstIndex(int[] array, int key, int pc) {
        int idx = pc;
        for (int i = pc - 1; i >= 0; i--) {
            if(array[i] != key) {
                break;
            }
            idx = i;
        }
        return idx;
    }
    
    public static void main(String[] args) {
        int[] array = new int[] {1, 3, 5, 7, 7, 7, 7, 8, 8, 9, 9};
        int key = 7;
        int idx = binSearchX(array, array.length, key);
    
        System.out.println("key : "+ key +", firstIdx : " + idx);
    
        key = 8;
        idx = binSearchX(array, array.length, key);
        System.out.println("key : "+ key +", firstIdx : " + idx);
    }
    
}
