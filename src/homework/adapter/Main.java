package homework.adapter;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.washCar(new Audi());
        car.washCar(new TrackAdapter(new BMW()));
    }
}

