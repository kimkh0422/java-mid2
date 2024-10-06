package collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain2 {
    public static void main(String[] args) {
        Integer[] array = {3,2,1};
        System.out.println(Arrays.toString(array));
        System.out.println("Comparator 비교");
        Arrays.sort(array, new AseComparator());
        System.out.println("AseComparator: "+Arrays.toString(array));

        Arrays.sort(array, new DesComparator());
        System.out.println("DesComparator: "+Arrays.toString(array));
        Arrays.sort(array, new AseComparator().reversed());
        System.out.println("AseComparator.reversed: "+Arrays.toString(array));





    }

    static class AseComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1="+o1+", o2="+o2);
            return (o1<o2) ? -1 : ((o1 == o2) ? 0 : 1);
        }
    }

    static class DesComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1="+o1+", o2="+o2);
            return (o1<o2) ? -1 : ((o1 == o2) ? 0 : 1) * -1;
        }
    }
}
