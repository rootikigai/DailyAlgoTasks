/*
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
      System.out.println();
    //Print all odd numbers between 1 and 30
      for(int i = 1; i <= 30; i++){
          if(i % 2 != 0){
              System.out.print(i + " ");
          }
      }
      System.out.println();
    //print numbers in reverse from 10 to 1
      for(int i = 10; i >= 1; i--){
          System.out.print(i + " ");
      }
      System.out.println();
    //Print first 10 multiples of 3
      for(int i = 1; i <= 10; i++){
          System.out.print((i * 3) + " ");
      }
      System.out.println();
    //Print all numbers divisible by 5 between 1 and 100
      for(int i = 1; i <= 100; i++){
          if(i % 5 == 0){
              System.out.print(i + " ");
          }
      }
      System.out.println();
    //Print a message inside a box made of stars
      for(int i = 1; i <= 10; i++){
          for(int j = 1; j <= 10; j++){
              if(i == 1 || j == 1 || i == 10 || j == 10){
                  System.out.print("* ");
              }
              else if(i == 5 && j == 5){
                  System.out.print("OK");
              }
              else{
                  System.out.print(" "+" ");
              }
          }
          System.out.println();
      }
      System.out.println();
    //Print a message with the current date
      LocalDateTime currentTime = LocalDateTime.now();
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
      String currentDate = dtf.format(currentTime);
      System.out.println("Happy Birthday Mrs. Glory Lawrence-Ifeanyi on " + currentDate);
  }
}
*/

//Write a function that takes in two args, an array and a number.
//Return an array that is the result of each number in the array
//multiplied by the number which is the second argument.

import java.util.Arrays;

public class AllDailyAlgoTasks {
    public static int [] multiplex(int[] nums, int number){
        int[] result = new int[nums.length];
        for(int index = 0; index < nums.length; index++){
            result[index] = nums[index] * number;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,4,7,10};
        int number = 2;
        System.out.println(Arrays.toString(multiplex(nums, number)));
    }
}


