package OOP.labwrk2;

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
