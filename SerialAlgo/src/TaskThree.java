import java.util.Arrays;

public class TaskThree {
    public static int[] countOfAllEvenElements(int[] elements){
        int count = 0;
        for (int element : elements) {
            if (element % 2 == 0) {
                count++;
            }
        }
        return new int[]{count};
    }
    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 4};
        int[] result = countOfAllEvenElements(elements);
        System.out.println(Arrays.toString(result));
    }
}
