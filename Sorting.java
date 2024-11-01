public class Sorting {
    public static void bubbleSort(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            for (int i = 0 ; i < arr.length -1 ; i++) { 
                if (arr[i] > arr[i+1]) {
                    int swap = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = swap; 
                }
            }
        }
     
    }
}