public class BubbleSort<T extends Comparable<T>> {

    /**
     * Sorts an array using Bubble Sort algorithm.
     *
     * @param array the array to be sorted
     */
    public void sort(T[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // Swap array[j] and array[j + 1]
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] array = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort.sort(array);
        System.out.println("Sorted array: " + java.util.Arrays.toString(array));
    }
}