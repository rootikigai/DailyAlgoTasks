public class CodeWars{
    public static long sumMul(int n, int m){
        long sum = 0;
        for(long i = 1; i <= m; i++){
            if(i % n == 0){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        long result = CodeWars.sumMul(2, 9);
        System.out.println(result);
    }
}
