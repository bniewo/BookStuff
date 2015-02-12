import java.util.Scanner;

/**
 * Created by bniewo on 2/12/2015.
 */
public class TriangleTester {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Triangle triangle = new Triangle();

        System.out.print("Enter x coordinate for point A: ");
        double  = in.nextInt();
        System.out.print("Enter y coordinate for point A: ");
        double  = in.nextInt();

        System.out.print("Enter x coordinate for point B: ");
        double  = in.nextInt();
        System.out.print("Enter y coordinate for point B: ");
        double  = in.nextInt();

        System.out.print("Enter x coordinate for point C: ");
        double  = in.nextInt();
        System.out.print("Enter y coordinate for point C: ");
        double  = in.nextInt();

        System.out.print("The length of side A is: ");
        System.out.println(triangle.giveSideA());
        System.out.print("The length of side B is: ");
        System.out.println(triangle.giveSideB());
        System.out.print("The length of side C is: ");
        System.out.println(triangle.giveSideC());

        System.out.print("The angle of point A is: ");
        System.out.println(triangle.giveAngleOfPointA());
        System.out.print("The angle of point B is: ");
        System.out.println(triangle.giveAngleOfPointB());
        System.out.print("The angle of point C is: ");
        System.out.println(triangle.giveAngleOfPointC());

        System.out.print("The perimeter of the triangle is: ");
        System.out.println(triangle.givePerimeter());

        System.out.print("The area of the triangle is: ");
        System.out.println(triangle.giveArea());

    }
}
