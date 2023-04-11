package bartkoo98;



public class QuickSort {
    public static void swap(OwnContainer arr, int p1, int p2) {
        int temp = arr.get(p1);
        arr.set(p1, arr.get(p2));
        arr.set(p2, temp);

    }

    static int partition(OwnContainer ownContainer, SimpleCounter sc, SimpleCounter cc, int low, int high){
        int pivot = ownContainer.get(high);
        int i = low - 1;
        for(int j = low; j < high; j++) {
            sc.step();
            if (ownContainer.get(j) <= pivot) {

                i++;
                swap(ownContainer, i, j);
                cc.step();
            }
        }
        swap(ownContainer, i + 1, high);
        cc.step();
        return i + 1;
    }


    public static void quicksort(OwnContainer ownContainer, SimpleCounter sc, SimpleCounter cc, int low, int high){
        if(low < high){
            int p = partition(ownContainer, sc, cc, low, high );
            quicksort(ownContainer, sc, cc, low, p-1);
            quicksort(ownContainer, sc, cc, p+1, high);
        }
    }

    static void printArray(OwnContainer arr) {
        int n = arr.size();
        for (int i = 0; i < n; ++i)
            System.out.print(arr.get(i) + " ");
        System.out.println();
    }
}