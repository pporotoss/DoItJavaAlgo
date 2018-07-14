package chap05;

public class GcdArray {
    
    static int gcdArray(int[] array) {
    
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result = gcd(result, array[i]);
        }
        
        return result;
    }
    
    static int gcdArray(int[] array, int start, int no) {
        
        if(no == 1) {
            return array[start];
        }
        
        if(no == 2) {
            return gcd(array[start], array[start + 1]);
        }
        
        return gcd(array[start], gcdArray(array, start + 1, no - 1));
    }
    
    private static int gcd(int x, int y) {
        
        while (y != 0) {
            int tmp = y;
            y = x % y;
            x = tmp;
        }
    
        return x;
    }
    
    public static void main(String[] args) {
        int[] array = new int[]{20, 24, 28};
        System.out.println(gcdArray(array));
    
        System.out.println(gcdArray(array, 0, array.length));
    }
    
}
