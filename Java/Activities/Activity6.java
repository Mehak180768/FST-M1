package com.ibm.activities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Activity6 {

    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);

     int result = plane.onboard("First Passenger", "Second Passenger", "Third Passenger");

     if (result == 1) {
         System.out.println("Plane takes off at: " + plane.takeOff());

         System.out.println("The passengers in the plane are: ");

         for (String passenger : plane.getPassengers())
             System.out.println(passenger);

         System.out.println("Plane has taken off");

         Thread.sleep(5000);

         plane.land();
         System.out.println("Plane has landed at: " + plane.getLastTimelanded());

     }
    }
}

class Plane{

    private List<String> passengers;

    private int maxPassengers;

    private Date lastTimeTookOf;

    private Date lastTimelanded;

    Plane(int maxPass){
        passengers = null;
        maxPassengers = maxPass;
    }

    int onboard(String...passenger){
      if (passenger.length > maxPassengers) {
          System.out.println("The number of passengers that wish to onboard is more than the maximum number allowed, " + maxPassengers + ". Please reduce the size.");
          return 0;
      }
      else {

          passengers = new ArrayList<String>();

          for (String p : passenger)
              passengers.add(p);

          return 1;
      }
    }

    Date takeOff(){
      return Calendar.getInstance().getTime();
    }

    void land(){
        lastTimelanded = takeOff();
        passengers.clear();
    }

    Date getLastTimelanded(){
        return lastTimelanded;

    }

    List<String> getPassengers(){
        return passengers;
    }
}
