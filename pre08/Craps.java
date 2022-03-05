import java.lang.Math.*;
import java.util.*;


public class Craps{

  // roll - takes an int and returns a value btw 1 & int inclusive (+1 rand)
  public static int roll(int max){
    Random num = new Random();
    return (num.nextInt(max) + 1);

  }

  // shoot - could really just be done with 1 arg and assuming d6, but hey
  // you might play craps with a d12, I guess!
  public static int shoot(int dice, int max){
    int total = 0;
    for(int i = 0; i < dice; i ++){
      total += roll(max);
    }
    return total;
  }

  public static void main(String[] args){
    System.out.println(shoot(3,6));
    System.out.println(shoot(3,6));
    System.out.println(shoot(3,6));
    System.out.println(shoot(3,6));
  }

  
}