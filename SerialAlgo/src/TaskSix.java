import java.util.Arrays;

public class TaskSix {
    public static int[] returnFirstElementGreaterThatTen(int[] elements){
        for (int element : elements) {
            if (element > 10) {
                return new int[]{element};
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] elements = {5, 9, 10, 20};
        int[] result = returnFirstElementGreaterThatTen(elements);
        System.out.println(Arrays.toString(result));
    }
}
