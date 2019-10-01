import java.util.Scanner;
import java.util.Random;



public class Test
{
    public static void main(String[] args) {
      Random gen = new Random();
      int random = gen.nextInt(26)+25;
      System.out.println(random);
    }
}
