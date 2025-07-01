public class AllDailyAlgoTasks{
  public static int collectAndPrintSum(int[] scores){
    int addScores = 0;
      for (int score : scores) {
          addScores += score;
      }
    return addScores;
  }
  public static int collectAndPrintAverage(int[] scores){
    int addScores = 0;
    int average = 0;
      for (int score : scores) {
          addScores += score;
          average = (addScores / scores.length);
      }
    return average;
  }
  public static int collectAndPrintSumAndAverage(int[] scores){
      int addScores = collectAndPrintSum(scores);
      int average = 0;
      for (int score : scores) {
          addScores += score;
          average = (addScores / scores.length);
      }
    return addScores;
  }
	public static int divisibleByFive(int number){
		if(number % 5 == 0){
      return number * number;
    }
    return number % 5;
	}
  public static void main(String[] args){
    int result = AllDailyAlgoTasks.divisibleByFive(5);
    System.out.println(result);
  }
}
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
