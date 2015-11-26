package hw.week3.circus.model;


import utils.DataInput;

import java.util.Scanner;

public class RopeWalker extends Artist {

    private double percent;

    public RopeWalker() {
        super();
        percent = 0;
    }

    public RopeWalker(String name, double salary, double percent) {
        super(name, salary);
        this.percent = percent;
    }

    @Override
    public double getSalary() {
        double salary = super.getSalary();
        return salary + (salary / 100 * this.percent);
    }

    @Override
    public String toString() {
        return "Rope walker{" +
                "name='" + super.getName()  +
                '}';
    }

    public static Artist createNewArtist(Scanner sc) {
        String name    = DataInput.nextStr(sc,        "Please enter name:");
        double salary  = DataInput.nextOnlyDouble(sc, "Please enter salary:");
        double percent = DataInput.nextOnlyDouble(sc, "Please enter percent:");
        return new RopeWalker(name, salary, percent);
    }

    public String doWork() {
        super.incActed();
        return "Rope walker: - Scientist cat walks on chain circle!";
    }
}
