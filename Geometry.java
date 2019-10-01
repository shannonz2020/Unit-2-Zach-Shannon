public class Geometry
{
    public static void main(String[] args){
        int sides = 7;
        int radius = 5;
        final double PI = 3.14159265358979323846264338327950288419;
        System.out.println("A heptagon has " + sides + " sides.");
        
        //Change sides
        sides = sides + 3;
        System.out.println("A decagon has " + sides + " sides.");
        
        //Change sides
        sides = sides + 2;
        System.out.println("A dodecagon has " + sides + " sides.");
        
        //Create circumference
        double circumference = 2 * PI * radius;
        System.out.print("The circumference of a circle with a radius of "); 
        System.out.println(radius + " is " + circumference + ".");
    }
}
