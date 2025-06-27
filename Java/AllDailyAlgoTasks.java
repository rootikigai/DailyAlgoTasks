import java.util.Scanner;
public class AllDailyAlgoTasks{
  public static int collectAndPrintSum(int[] scores){
    int addScores = 0;
    for(int i = 0; i < scores.length; i++){
	    addScores += scores[i];
    }
    return addScores;
  }
  public static int collectAndPrintAverage(int[] scores){
    int addScores = 0;
    int average = 0;
    for(int i = 0; i < scores.length; i++){
	    addScores += scores[i];
      average = (addScores / scores.length);
    }
    return average;
  }

	public static void main(String[] args){
    int[] testScores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int result = collectAndPrintAverage(testScores);
    System.out.println(result);
	  /*collect and print sum
    Scanner input = new Scanner(System.in);
		int[] scores = new int[10];
		int sum = 0;
		for(int i = 0; i < 10; i++){
      System.out.print("Enter score " + (i + 1) + ": ");
      scores[i] = input.nextInt();
			sum += scores[i];
		}
    System.out.println("Sum is " + sum);*/
	}
}
