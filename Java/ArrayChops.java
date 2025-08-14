import java.util.Arrays;

public class ArrayChops {
    public static int[] replaceOddEven(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0) {
                numbers[i] = 1;
            }
            else numbers[i] = 0;
        }
        return numbers;
    }
    public static void main(String[] args) {
        int [] nums = {3,5,4,6,8,7,2};
        int [] fixed = ArrayChops.replaceOddEven(nums);
        System.out.println(Arrays.toString(fixed));
    }
}
