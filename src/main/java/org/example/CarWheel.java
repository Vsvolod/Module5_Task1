package org.example;

public class CarWheel {
    private double wheelCondition = 1;

    public CarWheel(){
        //System.out.println("you have car wheel.");
    }
    public CarWheel(double wheelCondition){
        this.wheelCondition = wheelCondition;
        if( this.wheelCondition >= 0 & this.wheelCondition <= 1){
        }else {
            System.out.println("Out of condition range.");
        }
    }
    public void changeWheel(){
        wheelCondition = 1;
    }
    public void useWheel(double wheelExpluatation) {
        if (wheelExpluatation >= 0 & wheelExpluatation <= 1) {
            wheelCondition = wheelCondition * wheelExpluatation;
        } else{
            System.out.println("You will destroy your wheel if you would do that. ");
        }
    }
    public double getCondition(){
        return wheelCondition;
    }
    public void getWheelInfo(){
        System.out.println("Your wheel condition is " + getCondition());
    }
}
