package org.fasttrackit;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {


    private Track[] tracks = new Track[3];

    private List<Vehicle> competitors = new ArrayList<>();


    public void start() {

        initiliazeTracks();
        displayTracks();

         int competitorCount= getCompetitorCountFromUser();

         for (int i=0; i<competitorCount; i++) {
             addCompetitor();
         }
        displayCompetitors();

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

    private int getCompetitorCountFromUser(){
        System.out.println("Please enter competitors count :");
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch(InputMismatchException e) {
         throw  new RuntimeException("You enter an invalid value.");
        }finally {
            System.out.println("Always executed");
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

