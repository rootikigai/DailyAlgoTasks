import java.lang.reflect.Array;
import java.util.Arrays;

public class TaskSeven {
    public static int[] returnAllElementsGreaterThatTen(int[] elements){
        int[] newElements;
        for (int element : elements) {
            if (element > 10) {
                newElements =
                return new int[]{element};
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] elements = {5, 19, 10, 20};
        int[] result = returnAllElementsGreaterThatTen(elements);
        System.out.println(Arrays.toString(result));
    }
}
