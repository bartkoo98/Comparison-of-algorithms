package bartkoo98;


public class Main {
        static SimpleCounter loopCounter = new SimpleCounter();
        static SimpleCounter compareCounter = new SimpleCounter();
    public static void main(String[] args) {
        System.out.println("BubbleSort:");
        for(int i = 10; i <= 20; i++) {
                var x = (int) Math.pow(2, i);
                run_compare(1, x);
                System.out.printf("Vector size: 2^%d| loopCounter %d | compareCounter %d\n", i,loopCounter.get_count(), compareCounter.get_count());
        }

        System.out.println("QuickSort:");
        for(int i = 10; i <= 20; i++) {
            var x = (int) Math.pow(2, i);
            run_compare(2, x);
            System.out.printf("Vector size: %d| loopCounter %d | compareCounter %d\n", x,loopCounter.get_count(), compareCounter.get_count());
        }
    }

    public static void run_compare(int sort, int size) {
            OwnContainer ownContainer = ContainerGenerator.generateRandomArray(size);
            switch(sort) {
                    case 1 -> BubbleSort.bubbleSort(ownContainer, loopCounter, compareCounter);
                    case 2 -> QuickSort.quicksort(ownContainer, loopCounter, compareCounter, 0, size -1);
            }
    }
}