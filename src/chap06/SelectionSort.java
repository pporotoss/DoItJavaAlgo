package chap06;

public class SelectionSort {
    
    static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if(array[j] < array[min]) {
                    min = j;
                }
            }
            swap(array, i, min);
        }
    }
    
    private static void swap(int[] array, int idx1, int idx2) {
        int tmp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = tmp;
    }
    
    public static void main(String[] args) {
        int[] array = new int[]{22, 5, 11, 32, 120, 68, 70};
        System.out.println("선택 정렬");
        
        selectionSort(array);
        
        System.out.println("오름차순 정렬 완료!!");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
    
}
