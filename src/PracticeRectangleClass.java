import java.awt.*;
import java.util.Scanner;

public class PracticeRectangleClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = input.nextDouble();
        System.out.print("Enter the height: ");
        double height = input.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }
}
