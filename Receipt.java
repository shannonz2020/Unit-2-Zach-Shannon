import java.util.Scanner;
import java.text.DecimalFormat;

public class Receipt {

  public static void main(String[] args) {
       DecimalFormat totalRounded = new DecimalFormat("0.##");
//FINAL VARIABLES
  //per cost
    final int BOOKCOST = 9;
    final double MOVIECOST = 13.97;
    final double PEANUTPOUNDCOST = 1.72;
  //shipping cost
    final double BOOKSHIPPINGRT = 0.95;
    final double MOVIESHIPPINGRT = 0.04;
    final double PEANUTSHIPPINGRT = 0.30;
  //tax
    final double TAXPERCENT = 0.072;

  //scanners
    Scanner bookScanner = new Scanner(System.in);
    System.out.println("Enter the number of books: ");
    double books = bookScanner.nextDouble();

    Scanner movieScanner = new Scanner(System.in);
    System.out.println("Enter the number of movies: ");
    double movies = movieScanner.nextDouble();

    Scanner peanutScanner = new Scanner(System.in);
    System.out.println("Enter the weight of peanuts (lbs): ");
    double peanuts = peanutScanner.nextDouble();

  //subtotal costs
    double subttlBookCost = books*BOOKCOST;
    double subttlMovieCost = movies*MOVIECOST;
    double subttlPeanutCost = peanuts*PEANUTPOUNDCOST;

    double totalSubttl = subttlBookCost + subttlMovieCost + subttlPeanutCost;

  //shipping costs
    double bookShippingCost = books*BOOKSHIPPINGRT;
    double movieShippingCost = subttlMovieCost*MOVIESHIPPINGRT;
    double peanutsShippingCost = peanuts*PEANUTSHIPPINGRT;

    double totalShippingCost = bookShippingCost + movieShippingCost + peanutsShippingCost;
  //tax costs
    double bookTaxCost = subttlBookCost * TAXPERCENT;
    double peanutsTaxCost = subttlPeanutCost * TAXPERCENT;
    double movieTaxCost = subttlMovieCost * TAXPERCENT;

    double totalTaxCost = bookTaxCost + peanutsTaxCost + movieTaxCost;

  //total cost
    double tempTotalCost = totalSubttl + totalShippingCost + totalTaxCost;
    //double totalCost = totalRounded.format(tempTotalCost);

    System.out.println("The total cost is: " + tempTotalCost);

    System.out.println("--------------------------------");
    System.out.println("|        Steve's S-Mart        |");
    System.out.println("|                              |");
    System.out.println("|  Books: "+books+"         "+subttlBookCost+"|");
    System.out.println("|  Movies: "+movies+"       "+subttlMovieCost+      "|");
    System.out.println("|  Peanuts: "+peanuts+" lbs "+subttlPeanutCost+ "|");
    System.out.println("|                              |");
    System.out.println("|                              |");
    System.out.println("|  Shipping: "+totalShippingCost+"|");
    System.out.println("|  Tax: "+totalTaxCost+"  |");
    System.out.println("|                              |");
    System.out.println("|                              |");
    System.out.println("|                              |");
    System.out.println("|                              |");
    System.out.println("|  Total: "+tempTotalCost+"          |");
    System.out.println("|                              |");
    System.out.println("|     Thanks for shopping!     |");
    System.out.println("-------------------------------");

  }
}
