import java.util.Arrays;

public class TaskFive {
    public static boolean containsElementsGreaterThatTen(int[] elements){
        for (int element : elements) {
            if (element > 10) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] elements = {5, 2, 3, 2};
        boolean result = containsElementsGreaterThatTen(elements);
        System.out.println(result);
    }
}
