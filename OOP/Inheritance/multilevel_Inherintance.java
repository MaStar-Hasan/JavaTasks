package OOP.Inheritance;

class vehicle {
    vehicle() {
        System.out.println("This is a vehicle");
    }
}

class fourWheeler extends vehicle {
    fourWheeler() {
        System.out.println("this is four wheeler");
    }
}

class car extends fourWheeler {
    car() {
        System.out.println("this fourwheeler is car");
    }
}

public class multilevel_Inherintance {
    public static void main(String[] args) {
        car c = new car();
        fourWheeler f = new fourWheeler();
        vehicle v = new vehicle();
    }
}