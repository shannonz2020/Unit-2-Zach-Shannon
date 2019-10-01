public class RandomPhoneNumber{
  public static void main(String[] args){
    //Area code
      //first digit
      //double Math.random() = Math.random();
  String areaCode = ("(" + (int) (Math.random()*8+2) + (int) (Math.random()*9) + (int) (Math.random()*10)+ ")");

    //Exchange Code
  String exchangeCode = ("" + (int) (Math.random()*8+2) + (int) (Math.random()*10) + (int) (Math.random()*10));

    //Last numbers
  String lastNumbers = ("" + (int) (Math.random()*10)+ (int) (Math.random()*10)+ (int) (Math.random()*10)+ (int) (Math.random()*10));

String randomPhoneNumber = (areaCode + " " + exchangeCode + " " + lastNumbers);

//Print result
System.out.print(randomPhoneNumber);

//next line is for testing:
//System.out.println(areaCode);
  }
}
