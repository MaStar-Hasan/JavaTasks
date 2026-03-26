package OOP.Inheritance;

class Vehicles {
    void VehicleType() {
        System.out.println("This is vehicle ");
    }
}

interface fare {
    default void Fareinfo() {
        System.out.println("Fare information");
    }
}

class car extends Vehicles {
    void carType() {
        System.out.println("This is a car");
    }
}

class bus extends Vehicles implements fare {
    void busType() {
        System.out.println("This is a us");
    }
}

public class hybrid_inherit {
    public static void main(String[] args) {
        car Car = new car();
        Car.VehicleType();
        Car.carType();

        bus Bus = new bus();
        Bus.VehicleType();
        Bus.busType();
        Bus.Fareinfo();
    }
}
