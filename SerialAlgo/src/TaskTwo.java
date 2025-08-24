import java.util.Arrays;

public class TaskTwo {
    public static int[] sumOfAllEvenElements(int[] elements){
        int sum = 0;
        for (int element : elements) {
            if (element % 2 == 0) {
                sum += element;
            }
        }
        return new int[]{sum};
    }
    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 4};
        int[] result = sumOfAllEvenElements(elements);
        System.out.println(Arrays.toString(result));
    }
}
