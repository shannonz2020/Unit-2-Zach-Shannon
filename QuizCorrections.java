import java.util.Scanner;
public class QuizCorrections{
  public static void main(String[] args){
    //Question 5 correction

    //Given code
    String firstName = "Sofia";
    String middleName = "Maria";
    String lastName = "Hernandez";
    //My code
    String firstInitial = "" + firstName.substring(0,1);
    String middleInitial = "" + middleName.substring(0,1);
    String lastInitial = "" + lastName.substring(0,1);

    String initials = "" + firstInitial + middleInitial + lastInitial;
    initials.toLowerCase();
    System.out.println(initials);

    //Question 6 correction

    Scanner integerInput = new Scanner(System.in);
    int userNumber = integerInput.nextInt();
    double randomNumber = (int) (Math.random()*10 +1);
    double absVal = Math.abs(userNumber - randomNumber);
    System.out.println("Your lucky number is: " + absVal);
  }
}
