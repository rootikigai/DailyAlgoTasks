import java.util.Scanner;
public class AllDailyAlgoTasks{
	public static void main(String[] args){
	//collect and print sum
    Scanner input = new Scanner(System.in);
		int[] scores = new int[10];
		int sum = 0;
		for(int i = 0; i < 10; i++){
      System.out.print("Enter score " + (i + 1) + ": ");
      scores[i] = input.nextInt();
			sum += scores[i];
		}
    System.out.println("Sum is " + sum);
	}
}
