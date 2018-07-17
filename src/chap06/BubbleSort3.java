package chap06;

public class BubbleSort3 {
    
    static void swap(int[] array, int idx1, int idx2) {
        int tmp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = tmp;
    }
    
    static void bubbleSort(int[] array, int n) {
        int k = 0;
        while (k < n - 1) {
            int last = n - 1;
            for (int i = n - 1; i > k; i--) {
                if(array[i - 1] > array[i]) {
                    swap(array, i - 1, i);
                    last = i;
                }
            }
            k = last;
        }
    }
    
    public static void main(String[] args) {
        int[] array = new int[]{22, 5, 11, 32, 120, 68, 70};
        System.out.println("버블 정렬(버전 3)");
        
        bubbleSort(array, array.length);
    
        System.out.println("오름차순 정렬 완료!!");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
    
}
