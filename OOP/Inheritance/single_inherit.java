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

class vehicle {
    void tires() {
        System.out.println("vehicle has 4 tires...");
    }
}

class bike extends vehicle {
    void tires() {
        System.out.println("Bike has 2 tires...");
    }
}

public class single_inherit {

    public static void main(String[] args) {
        dog d = new dog();
        d.eat(); // inherited method
        d.bark(); // child class method

        vehicle v = new vehicle();
        v.tires(); // parent class method
        bike b = new bike();
        b.tires(); // overridden method
    }
}