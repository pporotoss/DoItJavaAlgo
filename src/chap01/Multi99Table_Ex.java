package chap01;

public class Multi99Table_Ex {
    
    public static void main(String[] args) {
        System.out.print("   |");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        System.out.print("---+");
        for (int i = 1; i <= 9; i++) {
            System.out.print("---");
        }
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%3d%s", i, "|");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
    
}
