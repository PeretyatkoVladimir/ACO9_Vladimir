package hw.week3.circus.model;

import utils.DataInput;

import java.io.Serializable;
import java.util.Scanner;


public class Artist {

    private String name;
    private double salary;
    private int acted;

    public Artist() {
        this.name = "empty object";
        this.acted = 0;
        this.salary = 0.0;
    }

    public Artist(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.acted = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    
    public double getActed() {
        return acted;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void incActed() {
        this.acted++;
    }

    public String doWork() {
        this.incActed();
        return "I am work";
    }

    public static Artist createNewArtist(Scanner sc) {
        String name = DataInput.nextStr(sc, "Please enter name:");
        double salary = DataInput.nextOnlyDouble(sc, "Please enter salary:");
        return new Artist(name, salary);
    }

    @Override
    public String toString() {
            return "Artist{" +
                    "name='" + name +
                    '}';
        }
}

