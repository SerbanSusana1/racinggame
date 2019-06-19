package org.fasttrackit;

import java.time.LocalDate;

public class Vehicle

{




    private static int totalCount;

   private String name;
   private double mileage;
   private String color;
   private   double maxSpeed;
   private boolean running;
   private double fuelLevel;
   private double traveledDistance;

   public Vehicle(){
       totalCount=totalCount+1;

   }

    // ""has-a" relationship

    LocalDate createDate;

    public double accelerate (double speed, double durationInHours){
        //concatenation
        System.out.println(name + " is accelerating with " + speed + " km/h for "+ durationInHours + "h.");

       double distance =  speed * durationInHours;
              System.out.println("Traveled " + distance + "km.");

      // traveledDistance = traveledDistance + distance;
        // same result as the above statement
       traveledDistance += distance;
       //logs
        System.out.println("Total traveled distance: " + " km. ");


       double spentFuel =  distance /100 *mileage;
        System.out.println(" Spent fuel : " + spentFuel + " 1. ");

        //fuelLevel = fuelLevel - spentFuel;
        // same as above
        fuelLevel-= spentFuel;
        System.out.println("Remain fuel: " + fuelLevel + " 1.");


       // fuelLevel = fuelLevel+1;
        //fuelLevel+=1;
        //fuelLevel++;
        //++fuelLevel;


        return distance;

    }

    public double accelerate(double speed){
        return accelerate(speed,1);

    }




    public String getName() {
        return name;
    }

    public double getMileage() {
        return mileage;
    }

    public String getColor() {
        return color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isRunning() {
        return running;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public static int getTotalCount() {
        return totalCount;
    }
}
