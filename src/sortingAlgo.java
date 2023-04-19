// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class sortingAlgo {
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >=0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

    }

    }
    public static void main(String[] args)
    {
        int arr[] = {12, 11, 13, 5, 6};


    }
}