package chap05;

public class EightQueen_Ex {
    static boolean[] flag_a = new boolean[8];
    static boolean[] flag_b = new boolean[15];
    static boolean[] flag_c = new boolean[15];
    static int[] pos = new int[8];
    
    static void print() {
        for (int i = 0; i < pos.length; i++) {
            for (int j = 0; j < pos.length; j++) {
                if(pos[i] == j) {
                    System.out.print("■ ");
                    continue;
                }
                System.out.print("□ ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    static void set(int i) {
        for (int j = 0; j < pos.length; j++) {
            if(flag_a[j] || flag_b[i + j] || flag_c[i - j + 7]) {
                continue;
            }
            
            pos[i] = j;
            if(i == pos.length - 1) {
                print();
                continue;
            }
            
            flag_a[j] = true;
            flag_b[i + j] = true;
            flag_c[i - j + 7] = true;
            set(i + 1);
            flag_a[j] = false;
            flag_b[i + j] = false;
            flag_c[i - j + 7] = false;
        }
    }
    
    public static void main(String[] args) {
        set(0);
    }
    
}
