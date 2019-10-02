import java.util.Scanner;

public class TriangleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter color Triangle:");
        String color1 = scanner.nextLine();

        System.out.print("Enter side 1:");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2:");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3:");
        double side3 = scanner.nextDouble();


        Triangle triangle = new Triangle(side1, side2, side3, color1, true);
        System.out.println(triangle);


    }
}
