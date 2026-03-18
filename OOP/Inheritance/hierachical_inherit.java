package OOP.Inheritance;

class Phone {
    void name() {
        System.out.println("this is phone");
    }
}

class Samsung extends Phone {
    void brand() {
        System.out.println("this phone is samsung");
    }
}

class Apple extends Phone {
    void brand() {
        System.out.println("this phone is apple");
    }
}

class Vehicle {
    Vehicle() {
        System.out.println("This is a vehicle");
    }
}

class car extends Vehicle {
    car() {
        System.out.println("This is a car");
    }
}

class bus extends Vehicle {
    bus() {
        System.out.println("This is a bus");
    }
}

public class hierachical_inherit {
    public static void main(String[] args) {
        Samsung s = new Samsung();
        s.name(); // inherited method
        s.brand(); // child class method

        Apple a = new Apple();
        a.name(); // inherited method
        a.brand(); // child class method

        car obj1 = new car();
        bus obj2 = new bus();

    }
}
