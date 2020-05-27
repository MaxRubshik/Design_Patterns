package src.sort;


public class Sort {
    public static void main(String[] args) {
        Object[]aa = {1,3,2,5,7};
        sort(aa);

        for (int i = 0; i < aa.length; i++) {
            System.out.print(" "+ aa[i]);
        }

    }
    public static void sort(Object[] a){
        Object aux[] = a.clone();
        mergeSort(aux, a, 0, a.length, 0);
    }

    private static void mergeSort(Object[] src, Object[] dest,
                                  int low, int high, int off) {
        for (int i = low; i < high; i++) {
            for (int j = i; j > low
                    && ((Comparable)dest[j-1])
                    .compareTo((Comparable)dest[j]) > 0; j--)
            {
                swap(dest, j, j-1);
            }
        }
        return;
    }

    private static void swap(Object[] x, int a, int b) {
        Object t = x[a];
        x[a] = x[b];
        x[b] = t;
    }

}
