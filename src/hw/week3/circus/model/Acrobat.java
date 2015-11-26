package hw.week3.circus.model;

import utils.DataInput;

import java.util.Scanner;

public class Acrobat extends Artist {

    int drunks;

    public Acrobat() {
        super();
        drunks = 0;
    }

    public Acrobat(String name, double salary) {
        super(name, salary);
        drunks = 0;
    }

    public static Artist createNewArtist(Scanner sc) {
        String name = DataInput.nextStr(sc, "Please enter name:");
        double salary = DataInput.nextOnlyDouble(sc, "Please enter salary:");
        return new Acrobat(name, salary);
    }

    public String toString() {
        return "Acrobat{" +
                "name='" + super.getName()  +
                '}';
    }

    @Override
    public String doWork() {
        return "Acrobat: - I am not drunk! But i have some botle of vodka!";
    }

}
