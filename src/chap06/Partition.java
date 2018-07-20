package chap06;

public class Partition {
    
    static void swap(int[] array, int idx1, int idx2) {
        int tmp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = tmp;
    }
    
    static void partition(int[] array, int n) {
        int pl = 0;
        int pr = n - 1;
        int pivot = array[n / 2];
        
        while (pl <= pr) {
            while (array[pl] < pivot) pl++;
            while (array[pr] > pivot) pr--;
            if(pl <= pr) {
                swap(array, pl++, pr--);
            }
        }
    
        System.out.println("피벗의 값은 "+pivot+"입니다.");
    
        System.out.println("피벗 이하의 그룹");
        for (int i = 0; i <= pl - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        if(pl > pr + 1) {
            System.out.println("피벗과 일치하는 그룹");
            for (int i = pr + 1; i <= pl - 1; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    
        System.out.println("피벗 이상의 그룹");
        for (int i = pr + 1; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] array = new int[] {1, 8, 7, 4, 5, 2, 6, 3, 9};
        System.out.println("배열 나누기 시작!!");
        
        partition(array, array.length);
    }
    
}
