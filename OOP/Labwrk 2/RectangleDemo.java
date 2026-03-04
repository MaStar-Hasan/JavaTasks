public class Rectangle {
    int width;
    int height;

    public Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public int calculateArea() {
        int area = width * height;
        return area;
    }

    public int calculatePerimeter() {
        int perimeter = 2 * (width + height);
        return perimeter;
    }
}

public class RectangleDemo {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 5);
        Rectangle rectangle2 = new Rectangle(8, 8);

        int area1 = rectangle1.calculateArea();
        int peri1 = rectangle1.calculatePerimeter();
        System.out.println("Rectangle 1 Area: " + area1);
        System.out.println("Rectangle 1 Perimeter: " + peri1);

        int area2 = rectangle2.calculateArea();
        int peri2 = rectangle2.calculatePerimeter();
        System.out.println("Rectangle 2 Area: " + area2);
        System.out.println("Rectangle 2 Perimeter: " + peri2);

        compareAreas(rectangle1, rectangle2);
    }

    public static void compareAreas(Rectangle r1, Rectangle r2) {
        int a1 = r1.calculateArea();
        int a2 = r2.calculateArea();

        if (a1 > a2) {
            System.out.println("Rectangle 1 has a larger area.");
        } else if (a2 > a1) {
            System.out.println("Rectangle 2 has a larger area.");
        } else {
            System.out.println("Both rectangles have the same area.");
        }
    }
}