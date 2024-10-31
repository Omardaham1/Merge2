public class MergeSort<T extends Comparable<T>> {

  /**
   * Sorts an array using Merge Sort algorithm.
   *
   * @param array the array to be sorted
   */
  public void sort(T[] array) {
      mergeSort(array, 0, array.length - 1);
  }

  private void mergeSort(T[] array, int left, int right) {
      if (left < right) {
          int mid = left + (right - left) / 2;
          mergeSort(array, left, mid);
          mergeSort(array, mid + 1, right);
          merge(array, left, mid, right);
      }
  }

  private void merge(T[] array, int left, int mid, int right) {
      T[] leftArray = java.util.Arrays.copyOfRange(array, left, mid + 1);
      T[] rightArray = java.util.Arrays.copyOfRange(array, mid + 1, right + 1);

      int i = 0, j = 0, k = left;
      while (i < leftArray.length && j < rightArray.length) {
          if (leftArray[i].compareTo(rightArray[j]) <= 0) {
              array[k] = leftArray[i];
              i++;
          } else {
              array[k] = rightArray[j];
              j++;
          }
          k++;
      }

      while (i < leftArray.length) {
          array[k] = leftArray[i];
          i++;
          k++;
      }

      while (j < rightArray.length) {
          array[k] = rightArray[j];
          j++;
          k++;
      }
  }

  public static void main(String[] args) {
      MergeSort<Integer> mergeSort = new MergeSort<>();
      Integer[] array = {64, 34, 25, 12, 22, 11, 90};
      mergeSort.sort(array);
      System.out.println("Sorted array: " + java.util.Arrays.toString(array));
  }
}