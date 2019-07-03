package org.fasttrackit;

public class Game {

    private Vehicle competitor1;
    private Vehicle competitor2;
    private Track[] tracks = new Track[3];


    public void start() {

        initiliazeTracks();
        displayTracks();

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
            if (tracks[i] !=null){
             System.out.println((i + 1) + "." + tracks[i].getName());
        }

    }

}}

