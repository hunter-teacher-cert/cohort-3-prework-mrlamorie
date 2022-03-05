import java.lang.Math.*;
import java.util.*;


public class Craps{

  // roll - takes an int and returns a value btw 1 & int inclusive (+1 rand)
  public static int roll(int max){
    Random num = new Random();
    return (num.nextInt(max) + 1);

  }

  public static void main(String[] args){
    System.out.println(roll(6));
    System.out.println(roll(6));
    System.out.println(roll(6));
    System.out.println(roll(6));
  }

  
}