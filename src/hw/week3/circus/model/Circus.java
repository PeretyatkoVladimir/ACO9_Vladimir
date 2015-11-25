package hw.week3.circus.model;


import hw.week3.circus.model.*;

import java.util.ArrayList;

public class Circus {
  
  private ArrayList<Artist> artists;
  private Location location;

    public Circus() {
      this.artists = new ArrayList<>();
    }

    // task 1
  public String getViewAllArtists() {
    String allArtists = "";
    for (Artist a : artists) {
      allArtists += a + "/n";
    }
    return allArtists;
  }
  
  // task 4
  public String getWorkResult(Artist artist) {
    return artist.doWork();
  }
  
  // task 5
  public String getViewArtistsActed() {
    String allArtistsActed = "";
    for (Artist a : artists) {
      allArtistsActed += a + ", acted - " + a.getActed() + " times. /n";
    }
    return allArtistsActed;
  } 
  
  // task 6
  public String getViewArtistsSalary() {
    String allArtistsSalary = "";
    for (Artist a : artists) {
        allArtistsSalary += a + ", salary - " + a.getSalary() + "/n";
    }
    return allArtistsSalary;
  } 
  
  // task 7
  public void changeLocation() {
    
  } 
  
  // task 7.1
  public void viewCurentLocation() {
    
  }
  
}
