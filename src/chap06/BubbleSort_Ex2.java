package chap06;

public class BubbleSort_Ex2 {
    
    static void swap(int[] array, int idx1, int idx2) {
        int tmp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = tmp;
    }
    
    static void bubbleSort(int[] array, int n) {
        int totalCount = 0;
        int swapCount = 0;
        for (int i = 0; i < n - 1; i++) {
            System.out.println("패스"+ (i + 1)+":");
            for (int j = n - 1; j > i; j--) {
                printSortStep(array, n, j);
                totalCount++;
                if(array[j - 1] > array[j]) {
                    swapCount++;
                    swap(array, j - 1, j);
                }
            }
            printArray(array, n);
        }
        System.out.println();
        System.out.println("비교 횟수 : "+totalCount);
        System.out.println("교환 횟수 : "+swapCount);
        System.out.println();
        
    }
    
    private static void printSortStep(int[] array, int n, int j) {
        for (int k = 0; k < n; k++) {
            if(k == (j - 1)) {
                String str = array[j - 1] > array[j] ? "+" : "-";
                System.out.print(array[k] + str);
                continue;
            }
            
            System.out.print(array[k] + " ");
        }
        System.out.println();
    }
    
    private static void printArray(int[] array, int n) {
        for (int j = 0; j < n; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] array = new int[]{6, 4, 3, 7, 1, 9, 8};
        System.out.println("버블 정렬(버전 2)");
        
        bubbleSort(array, array.length);
    
        System.out.println("오름차순 정렬 완료!!");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
    
}
