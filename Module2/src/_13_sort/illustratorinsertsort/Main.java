package _13_sort.illustratorinsertsort;

public class Main {
    /*Function to sort array using insertion sort*/

        public static int [] insertSort(int[] arr) {
            int n = arr.length;
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                System.out.println("Gia tri key:"+key);
                int j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    System.out.println("Gia tri arr[j]: "+ arr[j]);
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
            return arr;
        }

    public static void main(String[] args) {
        int[] myArray = {9, 1, 3, 12, 4, 23, 45};
        for (int element: insertSort(myArray)){
            System.out.println(element);
        }
    }
}
