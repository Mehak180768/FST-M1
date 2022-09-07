package com.ibm.activities;

public class Activity7 {

    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3, 0, 25);

        mb.bicycleDesc();

        mb.setHeight(26);

        mb.speedUp(2);

        mb.applyBrake(1);

        mb.bicycleDesc();
    }
}

interface BicycleParts{

    public int gears = 2;
    public int speed = 0;
}

interface BicycleOperations{

    public void applyBrake(int decrement);
    public void speedUp(int increment);

}

class Bicycle implements BicycleOperations,BicycleParts{

    int gears;
    int currentspeed;

    Bicycle (int g, int s){
        gears = g;
        currentspeed = s;
    }

    @Override
    public void applyBrake(int decrement) {
        currentspeed -= decrement;
    }

    @Override
    public void speedUp(int increment) {
        currentspeed += increment;
    }

   void bicycleDesc(){
       System.out.println("The gears are: " + gears + " and the speed of the bicycle is: " + currentspeed);
    }
}

class MountainBike extends Bicycle{
    int seatHeight;

    MountainBike(int g, int s, int h){
        super(g, s);
        seatHeight = h;
    }

    void setHeight(int newHeight){
        seatHeight = newHeight;
    }

    void bicycleDesc(){
        System.out.println("The gears are: " + gears + ", the speed of the bicycle is: " + currentspeed + " and the seat height is: " + seatHeight);
    }
}