package OOP.Inheritance;

class animal {
    void eat() {
        System.out.println("animal is eating...");
    }
}

class dog extends animal {
    void bark() {
        System.out.println("dog is barking...");
    }
}

public class single_inherit {

    public static void main(String[] args) {
        dog d = new dog();
        d.eat(); // inherited method
        d.bark(); // child class method
    }
}