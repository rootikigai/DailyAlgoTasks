import java.util.Arrays;

public class TaskFour {
    public static int[] countOfElementsGreaterThatTen(int[] elements){
        int count = 0;
        for (int element : elements) {
            if (element > 10) {
                count++;
            }
        }
        return new int[]{count};
    }
    public static void main(String[] args) {
        int[] elements = {15, 12, 3, 20};
        int[] result = countOfElementsGreaterThatTen(elements);
        System.out.println(Arrays.toString(result));
    }
}
