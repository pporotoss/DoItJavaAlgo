package chap05;

public class BubbleSort3_Ex {
    
    static void swap(int[] array, int idx1, int idx2) {
        int tmp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = tmp;
    }
    
    static void bubbleSort(int[] array, int n) {
        int k = 0;
        int pass = 1;
        int sortCount = 0;
        int swapCount = 0;
        while (k < n - 1) {
            int last = n - 1;
            System.out.println("패스"+(pass++)+":");
            printSortState(array, n, k);
    
            for (int i = n - 1; i > k; i--) {
                sortCount++;
                if(array[i - 1] > array[i]) {
                    swapCount++;
                    swap(array, i - 1, i);
                    last = i;
                }
            }
            k = last;
    
            printArray(array, n);
        }
        System.out.println();
        System.out.println("비교 횟수 : "+sortCount);
        System.out.println("교환 횟수 : "+swapCount);
        System.out.println();
    }
    
    private static void printArray(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    private static void printSortState(int[] array, int n, int k) {
        for (int i = n - 1; i > k; i--) {
            for (int j = 0; j < n; j++) {
                if(j == (i - 1)) {
                    String str = array[i - 1] > array[i] ? "+" : "-";
                    System.out.print(array[j] + str);
                    continue;
                }
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[] array = new int[]{6, 4, 3, 7, 1, 9, 8};
        System.out.println("버블 정렬(버전 3)");
        
        bubbleSort(array, array.length);
    
        System.out.println("오름차순 정렬 완료!!");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
    
}
