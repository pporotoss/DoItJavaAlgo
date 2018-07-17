package chap06;

public class SelectionSort_Ex {
    
    static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if(array[j] < array[min]) {
                    min = j;
                }
            }
    
            printSortState(array, n, i, min);
            
            swap(array, i, min);
        }
    }
    
    private static void printSortState(int[] array, int n, int i, int min) {
        printMark(n, i, min);
        printArray(array, n);
    }
    
    private static void printArray(int[] array, int n) {
        for (int j = 0; j < n; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
    }
    
    private static void printMark(int n, int i, int min) {
        for (int j = 0; j < n; j++) {
            String str = " ";
            if(j == i) {
                str = "*";
            }
            else if(j == min) {
                str = "+";
            }
            System.out.print(str + " ");
        }
        System.out.println();
    }
    
    private static void swap(int[] array, int idx1, int idx2) {
        int tmp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = tmp;
    }
    
    public static void main(String[] args) {
        int[] array = new int[]{6, 4, 8, 3, 1, 9, 7};
        System.out.println("선택 정렬");
        
        selectionSort(array);
        
        System.out.println("오름차순 정렬 완료!!");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
    
}
