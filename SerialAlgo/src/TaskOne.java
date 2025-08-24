import java.util.Arrays;

public class TaskOne {
    public static int[] sumOfAllElements(int[] elements){
        int sum = 0;
        for (int element : elements) {
            sum += element;
        }
        return new int[]{sum};
    }
    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 4};
        int[] result = sumOfAllElements(elements);
        System.out.println(Arrays.toString(result));
    }
}
