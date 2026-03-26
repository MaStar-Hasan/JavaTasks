package OOP.Abstraction;

abstract class animal {
    abstract void sound();

    abstract void run();

    void sleep() {
        System.out.println("animal is sleeping");
    }
}

class dog extends animal {

    void sound() {
        System.out.println("dog is Barking");
    }

    void run() {
        System.out.println("dog runs fast");

    }
}

public class abstr {
    public static void main(String[] args) {
        dog d1 = new dog();

        d1.sound();
        d1.run();
        d1.sleep();
    }

}
