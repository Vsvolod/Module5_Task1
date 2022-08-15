package org.example;

public class Main {
    public static void main(String[] args) {
        CarDoor dverOtZaporozhca = new CarDoor();
        CarWheel koleco = new CarWheel();
        koleco.changeWheel();
        koleco.getWheelInfo();

        Car lada = new Car("22.06.1992", "Neplohoi engine", 140.0, 0, 0, 4, 1);

        lada.setWheel(5);
        lada.useCurrentWheel(3,0.3);
        lada.useCurrentWheel(2,0.8);
        lada.getWheelCondition(1);
        lada.calculateMaxSpeed();

        lada.getInfo();
    }
}