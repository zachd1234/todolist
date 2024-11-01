import java.util.Arrays;


public class MethodTester {

    public static void main(String[] args) {
        System.out.println("hi");
        testBubble();
    }

    public static void testBubble() {
        int[] arr = {1, 3, 4, 76, 23, 12};
        System.out.println(Arrays.toString(arr));
        Sorting.bubbleSort(arr);
        System.out.println("post bubble sort: " + Arrays.toString(arr));
    }
}