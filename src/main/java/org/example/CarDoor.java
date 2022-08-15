package org.example;

public class CarDoor {
    private boolean doorStatus;
    private boolean windowStatus;

    public   CarDoor(){
        doorStatus = false;
        windowStatus = false;
        //System.out.println("Door is closed.");
        //System.out.println("Window is closed.");
    }
    public CarDoor(boolean doorStatus, boolean windowStatus){
        this.doorStatus = doorStatus;
        this.windowStatus = windowStatus;
    }
    public void openDoor(){
        doorStatus = true;
        //System.out.println("The door is open.");
    }
    public void closeDoor(){
        doorStatus = false;
        //System.out.println("Door is closed.");
    }
    public  void changeDoor(){
        if(doorStatus == false){
            openDoor();
        }else {
            closeDoor();
        }
    }
    public void openWindow(){
        windowStatus = true;
        //System.out.println("The window is open.");
    }
    public  void closeWindow(){
        windowStatus = false;
        //System.out.println("window is closed.");
    }
    public void changeWindow(){
        if(windowStatus == false){
            openWindow();
        }else{
            closeWindow();
        }
    }

    public void printInfo(){
        if(doorStatus == true){
            System.out.println("Your door is open.");
        }else {System.out.println("Your door is closed."); }
        if (windowStatus == true){
            System.out.println("Your window is open.");
        }else {System.out.println("Your window is closed");}

    }
}
