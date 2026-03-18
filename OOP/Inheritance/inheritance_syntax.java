class Parent {
    void display() {
        System.out.println("This is parent");
    }
}

class child extends Parent {
    void display2() {
        System.out.println("This is child");
    }
}

public class inheritance_syntax {

    public static void main(String[] args) {
        child c = new child();
        c.display();
    }
}