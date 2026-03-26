package OOP.Abstraction;

interface Landvehicle {
    void drive();
}

interface Watervehicle {
    void sail();
}

class AmphibiousVeh implements Watervehicle, Landvehicle {
    public void sail() {
        System.out.println("sailing on water");
    }

    public void drive() {
        System.out.println("Driving on road");
    }
}

public class interfaces_example {
    public static void main(String[] args) {
        AmphibiousVeh V1 = new AmphibiousVeh();
        V1.drive();
        V1.sail();
    }
}
