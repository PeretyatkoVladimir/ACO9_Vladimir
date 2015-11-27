package hw.week3.circus.model;

import utils.DataInput;

import java.util.Scanner;

public class Acrobat extends Artist implements Comparable {

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
    
    public int compareTo(Object anObject) {
        Acrobat anAcrobat = (Acrobat)anObject;
        if(this.drunks < anAcrobat.drunks) {
            return -1;
        } else if(this.student_id > tmp.student_id) {
            return 1;
        } else {
            return 0;  
        }
    }

    public String toString() {
        return "Acrobat{" +
                "name='" + super.getName()  +
                '}';
    }

    @Override
    public String doWork() {
        super.incActed();
        return "Acrobat, " + this.getName() + ": - I am not drunk! But i have some botle of vodka!";
    }

}
