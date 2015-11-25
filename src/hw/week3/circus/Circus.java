package hw.week3.circus;


public class Circus {
  
  private ArrayList<Stuff> artists;
  private Location location;
  
  // task 1
  public String viewArtists() {
    String allArtists = "";
    for (Stuff a : artists) {
      allArtists += a + "/n";
    }
    return allArtists;
  }
  
  // task 4
  public String goPlay(Stuff artist) {
    return artist.viewPlay();
  }
  
  // task 5
  public String viewArtistsActed() {
    String allArtistsActed = "";
    for (Stuff a : artists) {
      allArtistsActed += a + ", acted - " + a.getActed() + " times. /n";
    }
    return allArtistsActed;
  } 
  
  // task 6
  public String viewArtistsSalary() {
    String allArtistsSalary = "";
    for (Stuff a : artists) {
      allArtistsActed += a + ", salary - " + a.getSalary() + "/n";
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
