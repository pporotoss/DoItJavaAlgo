package chap05;

public class QueenBB {
    
    static int[] pos = new int[8];
    static boolean[] flag = new boolean[8];
    
    static void print() {
        for (int i = 0; i < pos.length; i++) {
            System.out.printf("%2d", pos[i]);
        }
        System.out.println();
    }
    
    static void set(int i) {
        for (int j = 0; j < pos.length; j++) {
            if(flag[j]) {
                continue;
            }
            
            pos[i] = j;
            if(i == pos.length - 1) {
                print();
                continue;
            }
            
            flag[j] = true;
            set(i + 1);
            flag[j] = false;
        }
    }
    
    public static void main(String[] args) {
        set(0);
    }
    
}
