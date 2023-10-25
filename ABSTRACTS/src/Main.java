import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a shape type: ");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            System.out.println("4. Square");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                break;
            }

            String shapeName;
            double area, perimeter;

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the Rectangle: ");
                    shapeName = scanner.next();
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(shapeName, width, height);
                    area = rectangle.getArea();
                    perimeter = rectangle.getPerimeter();
                    break;

                case 2:
                    System.out.print("Enter the name of the Circle: ");
                    shapeName = scanner.next();
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(shapeName, radius);
                    area = circle.getArea();
                    perimeter = circle.getPerimeter();
                    break;

                case 3:
                    System.out.print("Enter the name of the Triangle: ");
                    shapeName = scanner.next();
                    System.out.print("Enter side 1: ");
                    double side1 = scanner.nextDouble();
                    System.out.print("Enter side 2: ");
                    double side2 = scanner.nextDouble();
                    System.out.print("Enter side 3: ");
                    double side3 = scanner.nextDouble();
                    Triangle triangle = new Triangle(shapeName, side1, side2, side3);
                    area = triangle.getArea();
                    perimeter = triangle.getPerimeter();
                    break;

                case 4:
                    System.out.print("Enter the name of the Square: ");
                    shapeName = scanner.next();
                    System.out.print("Enter side length: ");
                    double sideLength = scanner.nextDouble();
                    Square square = new Square(shapeName, sideLength);
                    area = square.getArea();
                    perimeter = square.getPerimeter();
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    continue;
            }

            System.out.println("Shape: " + shapeName);
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
        }
    }
}