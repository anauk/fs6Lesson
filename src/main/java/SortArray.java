import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortArray {
    static int[] ar;

    static void sort(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            int index=findMin(i,a.length-1);
            swap(i, index);
        }
    }

    private static int findMin(int ind1, int ind2) {
        int ind=ind1;
        int min=ar[ind1];
        for (int i = ind1; i <= ind2; i++) {
            if (ar[i]<min) {
                min=ar[i];
                ind=i;
            }
        }
        return ind;
    }

    private static void swap(int i, int j) {
        int t=ar[i];
        ar[i]=ar[j];
        ar[j]=t;
    }

    static String arrayToString1(int[] a) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <a.length ; i++) {
            sb.append(a[i]);
            sb.append(i == a.length-1 ? "" : ", ");
        }
        sb.append("]");
        return sb.toString();
    }

    static String arrayToString(int[] a) {
        return Arrays.stream(a)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(", "));
    }

    public static void main_1(String[] args) {
        List<Integer> ints = Arrays.asList(3, 7, 12, 1, 6);
        Collections.sort(ints);
        System.out.printf("Is: %s\n",
        ints.stream().map(integer -> Integer.toString(integer))
                .collect(Collectors.joining(", "))
        );
    }

    public static void main_0(String[] args) {
        ar=new int[] {3,7,12,1,6};
        System.out.printf("Array was:%s\n", arrayToString(ar));
        sort(ar);
        System.out.printf("Array is %s\n", arrayToString(ar));
    }

    public static void main(String[] args) {
        Stream.of(3, 7, 12, 1, 6).sorted().forEach(el -> System.out.print(el+", "));
    }
}
