package hw.week3.circus.model;


import hw.week3.circus.model.*;

import java.util.ArrayList;
import java.util.HashMap;
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

    // task 3
    public void remArtist(Artist artist) {
        this.artists.remove(artist);
    }

    public ArrayList<Acrobat> getAcrobatsOnly() {
        ArrayList<Acrobat> acrobats = new ArrayList<>();
        for (Artist a : this.artists) {
            if (a instanceof Acrobat) {
                acrobats.add((Acrobat) a);
            }
        }
        return acrobats;
    }

    public Acrobat getDrunkestAcrobat() {
        ArrayList<Acrobat> acrobats = getAcrobatsOnly();
        return Acrobat.findDrunkestAcrobat(acrobats);
    }

    // task 4
    public void getViewWorkResult(Artist artist) {
        System.out.println(artist.doWork());
    }

    public HashMap<Integer, Artist> getHasMapOfArtists() {

        HashMap<Integer, Artist> hashMap = new HashMap<>();

        Integer i = 1;
        for (Artist a : this.artists) {
            hashMap.put(i, a);
            i++;
        }
        return hashMap;
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
