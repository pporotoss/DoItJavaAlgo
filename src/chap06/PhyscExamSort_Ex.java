package chap06;

import java.util.Arrays;
import java.util.Comparator;

public class PhyscExamSort_Ex {

    static class PhyscData {
        String name;
        int height;
        double vision;
    
        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    
        @Override
        public String toString() {
            return name + " " + height + " " + vision;
        }
    
        static final Comparator<PhyscData> VISION_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {
    
            @Override
            public int compare(PhyscData d1, PhyscData d2) {
                return Double.compare(d2.vision, d1.vision);
            }
        }
    }
    
    public static void main(String[] args) {
        PhyscData[] x = {
                new PhyscData("이나령", 162, 0.3)
                , new PhyscData("전서현", 173, 0.7)
                , new PhyscData("이수민", 175, 2.0)
                , new PhyscData("홍준기", 171, 1.5)
                , new PhyscData("유지훈", 168, 0.4)
                , new PhyscData("이호연", 174, 1.2)
                , new PhyscData("김한결", 169, 0.8)
        };
    
        Arrays.sort(x, PhyscData.VISION_ORDER);
    
        System.out.println("■ 신체 검사 리스트 ■");
        System.out.println(" 이름       키        시력");
        System.out.println("--------------");
        
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
        }
        
    }

}
