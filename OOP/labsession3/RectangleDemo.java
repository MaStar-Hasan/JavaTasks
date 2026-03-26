package OOP.labsession3;

public class RectangleDemo {
    // method to demonstrate message passing
    static void compareArea(Rectangle r1, Rectangle r2) {
        int area1 = r1.calculateArea();
        int area2 = r2.calculateArea();

        if (area1 > area2) {
            System.out.println("Rectangle 1 has a larger area.");
        } else if (area2 > area1) {
            System.out.println("Rectangle 2 has a larger area.");
        } else {
            System.out.println("Both rectangles have the same area.");
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(80, 20);
        Rectangle rectangle2 = new Rectangle(10, 25);

        System.out.println("Rectangle 1 Area: " + rectangle1.calculateArea());
        System.out.println("Rectangle 1 Perimeter: " + rectangle1.calculatePerimeter());
        System.out.println("Rectangle 2 Area: " + rectangle2.calculateArea());
        System.out.println("Rectangle 2 Perimeter: " + rectangle2.calculatePerimeter());
        compareArea(rectangle1, rectangle2);

    }
}
