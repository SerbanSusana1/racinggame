package org.fasttrackit;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {


    private Track[] tracks = new Track[3];

    private List<Vehicle> competitors = new ArrayList<>();


    public void start() throws Exception {

        initiliazeTracks();
        displayTracks();

        Track selectedTrack = getTrackSelectByUser();

         int competitorCount= getCompetitorCountFromUser();

         for (int i=0; i<competitorCount; i++) {
             addCompetitor();
         }
        displayCompetitors();


         boolean winnerNotKnow=true;

         int competirorsWithoutFuel=0;

         while(winnerNotKnow && competirorsWithoutFuel<competitors.size()) {


             // enhanced for / for-each
             for (Vehicle competitor : competitors) {
                 double speed = getSpeedFromUser();
                 competitor.accelerate(speed);

                 if (competitor.getTraveledDistance() >= selectedTrack.getLengh()) {
                     System.out.println("Congrats! The winer is: " + competitor.getName());
                     winnerNotKnow=false;
                     break;

                 }

                 if(competitor.getFuelLevel() <=0){
                     competirorsWithoutFuel++;
                 }

                 // sau  competitor.accelerate(getSpeedFromUser());

             }
         }

     //    do {
     //      System.out.println("Doing something");
     //    }while(winnerNotKnow);

    }

    private double getSpeedFromUser(){
        System.out.println("Please enter acceleration speed :");
        Scanner scanner = new Scanner((System.in));
        try {
            return scanner.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("You have entered an invalid value");
           return getSpeedFromUser();
        }
    }

    private Track getTrackSelectByUser(){
        System.out.println("please enter track number:");

        try {
            Scanner scanner = new Scanner((System.in));
            int trackNumber = scanner.nextInt();

            Track track = tracks[trackNumber - 1];

            System.out.println("Selected track: " + track.getName());

            return track;
        }catch(InputMismatchException | ArrayIndexOutOfBoundsException e){
            System.out.println("Please entered an invalid track number . Please try again...");
          // recursion - a method invoking itself
            return getTrackSelectByUser();
        }

    }

    private void addCompetitor() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName(getVehicleNameFromUse());
        vehicle.setFuelLevel(60);
        vehicle.setMaxSpeed(200);
        vehicle.setMileage(ThreadLocalRandom.current().nextDouble(4.5, 20));

        competitors.add(vehicle);

    }

    private  String getVehicleNameFromUse(){
        System.out.println("Please enter vehicle name");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private int getCompetitorCountFromUser() throws Exception {
        System.out.println("Please enter competitors count :");
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch(InputMismatchException e) {
         throw  new Exception("You enter an invalid value.");
        }finally {
            System.out.println("Read input from user");
        }
    }

    private void displayCompetitors() {
        System.out.println(("Today's competirors are :"));

        for (int i = 0; i < competitors.size(); i++) {
            if (competitors.get(i) != null) {
                System.out.println(competitors.get(i).getName() + "- mileage:" + competitors.get(i).getMileage());
            }
        }

    }


    private void initiliazeTracks() {
        Track city = new Track();
        city.setName("Cluj Track");
        city.setLengh(100);

        tracks[0] = city;

        Track forest = new Track();
        forest.setName("Faget Tracks");
        forest.setLengh(20);

        tracks[1] = forest;
    }

    private void displayTracks() {
        System.out.println("Available tracks: ");
        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] != null) {
                System.out.println((i + 1) + "." + tracks[i].getName());
            }

        }

    }
}

