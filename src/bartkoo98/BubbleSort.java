package bartkoo98;

public class BubbleSort {

    public static void swap(OwnContainer arr, int p1, int p2) {
        int temp = arr.get(p1);
        arr.set(p1, arr.get(p2));
        arr.set(p2, temp);
    }
    public static void bubbleSort(OwnContainer arr, SimpleCounter loopCounter, SimpleCounter compareCounter) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            loopCounter.step();
            for (int j = 0; j < (n - i - 1); j++) {
                loopCounter.step();
                compareCounter.step();
                if (arr.get(j) > arr.get(j + 1) ){
                    swap(arr, j, j+1);
                }
            }
        }
    }




}

