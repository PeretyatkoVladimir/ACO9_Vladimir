package hw.week3.circus.model;


import hw.week3.circus.model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Circus {

    private ArrayList<Artist> artists;
    private Location location;

    public Circus() {
        this.artists = new ArrayList<>();
    }

    public Circus(ArrayList<Artist> artists, Location location) {
        this.artists = artists;
        this.location = location;
    }

    public Location getLocation(){
        return this.location;
    }

    // task 1
    public String getViewAllArtists() {
        String allArtists = "";
        for (Artist a : artists) {
            allArtists += a + "\n";
        }
        return allArtists;
    }

    // task 2
    public void addArtist(Artist artist) {
        this.artists.add(artist);
    }

    public void addNewArtistAcrobat(Scanner sc) {
        addArtist(Acrobat.createNewArtist(sc));
    }

    public void addNewRopeWalker(Scanner sc) {
        addArtist(RopeWalker.createNewArtist(sc));
    }

    //task 3
    public void remArtist(Artist artist) {
        this.artists.remove(artist);
    }

    // task 4
    public String getWorkResult(Artist artist) {
        return artist.doWork();
    }

    // task 5
    public String getViewArtistsActed() {
        String allArtistsActed = "";
        for (Artist a : artists) {
            allArtistsActed += a + ", acted - " + a.getActed() + " times. \n";
        }
        return allArtistsActed;
    }

    // task 6
    public String getViewArtistsSalary() {
        String allArtistsSalary = "";
        for (Artist a : artists) {
            allArtistsSalary += a + ", salary - " + a.getSalary() + "\n";
        }
        return allArtistsSalary;
    }

    // task 7
    public void changeLocation(Scanner sc) {
        this.location = Location.createNewLocation(sc);
    }
}
