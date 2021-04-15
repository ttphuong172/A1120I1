package _13_sort.insertsort;

public class InsertSort {
    /*Function to sort array using insertion sort*/
    public static void insertSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] myArray = {9, 1, 3, 12, 4, 23, 45};
        InsertSort insertsort = new InsertSort();
        insertsort.insertSort(myArray);
        for (int element:myArray){
            System.out.println(element);
        }

    }
}
