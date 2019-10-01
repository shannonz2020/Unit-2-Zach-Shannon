import java.util.Random;

public class RandomNumbers{
  public static void main(String[] args){
    Random randomNumber = new Random();

//Printing random numbers
    /*
    System.out.println("Random number 0-9: " + (randomNumber.nextInt(10)+0));
    System.out.println("Random number 1-10: " + (randomNumber.nextInt(10)+1));
    System.out.println("Random number 20-34: " + (randomNumber.nextInt(15)+21));
    System.out.println("Random number -10 to 9: " + (randomNumber.nextInt(19)-10));
    System.out.println("Random number [0,1): " + (randomNumber.nextDouble()+0));
    System.out.println("Random number [0,6): " + (randomNumber.nextDouble()*6));
    */

    /*System.out.println("Random number 0-9: " + (int) (Math.random()*10));
    System.out.println("Random number 1-10: " + (int) (Math.random()*10 +1));
    System.out.println("Random number 20-34: " + (int) (Math.random()*15 + 20));
    */
    System.out.println("Random number -10 to 9: " + (int) (Math.random()*20 -10));
    //System.out.println("Random number [0,1): " + (int) (Math.random()*));
    //System.out.println("Random number [0,6): " + (int) (Math.random()*));
  }
}
