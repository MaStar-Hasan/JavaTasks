package OOP.labsession3;

class Rectangle {
    int width;
    int height;

    // paremeter constructor
    Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }

    // method to calculate area
    int calculateArea() {
        return width * height;
    }

    // method to calculate perimeter
    int calculatePerimeter() {
        return 2 * (width + height);
    }

}