import java.lang.Math;

public class Loops{

  // Exercise 2
  public static double squareRoot(double a){
    // formula: x1 = (x0 + a/x0)/2  initual x0 should be a/2
    // this should happen until x0 and x0 less then 0.0001 apart
    double x0, x1;
    x0 = a/2;
    x1 = (x0 + (a/x0))/2;
  
    while (Math.abs(x0 - x1) > 0.0001){
      x0 = x1;
      x1 = (x0 + (a/x0))/2;
    }
    return x1; // could be either I guess. 
  }
  
  public static void main(String[] args) {

    System.out.println("Test of Exercise 2:");
    System.out.println(squareRoot(9));

    
  }
  
}