package chap06;

public class BubbleSort2 {
    
    static void swap(int[] array, int idx1, int idx2) {
        int tmp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = tmp;
    }
    
    static void bubbleSort(int[] array, int n) {
        for (int i = 0; i < n - 1; i++) {
            int exchg = 0;
            for (int j = n - 1; j > i; j--) {
                if(array[j - 1] > array[j]) {
                    swap(array, j - 1, j);
                    exchg++;
                }
            }
            if(exchg == 0) break;
        }
    }
    
    public static void main(String[] args) {
        int[] array = new int[]{22, 5, 11, 32, 120, 68, 70};
        System.out.println("버블 정렬(버전 1)");
        
        bubbleSort(array, array.length);
    
        System.out.println("오름차순 정렬 완료!!");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
    
}
