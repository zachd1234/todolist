import java.util.Arrays;


public class Main { 
    public static void main(String[] args) {
        System.out.println("One small step towards zero human comapnies");
        System.out.println("hi");
        System.out.println("Hiagain!");
        int[] arr = {1, 3, 4, 76, 23, 12};
        System.out.println(Arrays.toString(arr));
        Sorting.bubbleSort(arr);
        System.out.println("post bubble sort: " + Arrays.toString(arr));


    }     
} 