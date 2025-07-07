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

    //Print numbers from 1 to 10
      for(int i = 1; i <= 10; i++){
          System.out.print(i + " ");
      }
      System.out.println();
    //Print even numbers from 1 to 20
      for(int i = 1; i <= 20; i++){
          if(i % 2 == 0){
              System.out.print(i + " ");
          }
      }
      System.out.println();
    //Print your name 5 times
      for(int i = 1; i <= 5; i++) {
          System.out.print("Kelvin Ifeanyi ");
      }
      System.out.println();
    //Print all numbers from 50 to 100
      for(int i = 50; i <= 100; i++){
          System.out.print(i + " ");
      }
  }
}

