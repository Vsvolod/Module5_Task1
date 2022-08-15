package org.example;
import java.util.*;

public class Car {
    private String dateOfFabrication;
    private String engineType;
    private double maxSpeed;
    private double currentSpeed;
    private double racing;
    private int valueOfPassengers;
    private int passengersInCar;
    private CarWheel wheels[];
    private int doors[];

    public Car(final String dateOfFabrication){
        this.dateOfFabrication = dateOfFabrication;
    }
    public Car(final String dateOfFabrication, String engineType, double maxSpeed, double currentSpeed, double racing, int valueOfPassengers, int passengersInCar){
        this.dateOfFabrication = dateOfFabrication;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
        this.racing = racing;
        this.valueOfPassengers = valueOfPassengers;
        this.passengersInCar = passengersInCar;
    }

    public void changeSpeed(double changeValueSpeed){
        currentSpeed += changeValueSpeed;
    }
    public void setPassenger(){
        passengersInCar ++;
    }
    public void getOutPassenger(){
        passengersInCar --;
    }
    public void allGetOut(){
        passengersInCar = 0;
    }
    public void getDoorsNumber(int numberOfDoor){
        for(int i=0; i<doors.length; i++){
            if(i == numberOfDoor){
                System.out.println("You choose the door number " + doors[i]);
            }
        }
    }

    public void setWheel(int range){
        wheels = new CarWheel[range];
        for (int i=0; i<=wheels.length-1; i++){
            CarWheel koleco = new CarWheel();
            wheels[i] = koleco;
            }
        }


    public void  getWheelsNumber(int numberOfWheel){
        for (int x=0; x<wheels.length; x++){
            if(x == numberOfWheel){
                System.out.println("You choose wheel number " + wheels[x] +" № "+ x);
            }
        }
    }
    public void removeAllWheels(){
        wheels = new CarWheel[0];
        System.out.println("you have no wheels.");
    }
    public void addWheel(int numberOfAddingWheels){
        wheels = new CarWheel[wheels.length+numberOfAddingWheels];
        for (int i=0; i<=wheels.length-1; i++){
            CarWheel koleco = new CarWheel();
            wheels[i] = koleco;
        }
    }

    public void useCurrentWheel(int currentWheel, double wheelExpluatation){
        wheels[currentWheel].useWheel(wheelExpluatation);
    }
    public void getWheelCondition (int currentWheel){
        wheels[currentWheel].getWheelInfo();
    }
    public double calculateMaxSpeed(){
        double minCondition = 0;
        double Condition[] = new double[wheels.length];

        for (int i = 0; i<wheels.length; i++){
            Condition[i] = wheels[i].getCondition();
            for (int j = 0; j<wheels.length-1; j++){
                if(Condition[j]<Condition[j+1]){
                minCondition = Condition[j];
                }
            }
        }
        System.out.println(minCondition);
        double currentMaxSpeed = maxSpeed * minCondition;
        if(passengersInCar == 0){
            currentMaxSpeed = 0;
        }
        return currentMaxSpeed;
    }
    public void getInfo(){
        System.out.println("Here is information about your Car:\n" + dateOfFabrication + engineType + maxSpeed + valueOfPassengers + passengersInCar);
    }
}
