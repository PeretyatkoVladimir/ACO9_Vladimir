package hw.week3.circus.model;

import utils.DataInput;

import java.util.Scanner;

public class Location {

    String city;
    String adress;

    public Location() {
        this.city = "empty city";
        this.adress = "empty adress";
    }

    public Location(String city, String adress) {
        this.city = city;
        this.adress = adress;
    }

    public static Location createNewLocation(Scanner sc) {
        String city = DataInput.nextStr(sc, "Please enter city:");
        String adress = DataInput.nextStr(sc, "Please enter adress:");
        return new Location(city, adress);
    }

    public String toString() {
        return "city: " + this.city + ", adress: " + this.adress;
    }
}
