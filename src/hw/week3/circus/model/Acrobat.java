package hw.week3.circus.model;

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
    
    @Override
    public String doWork() {
        return "Acrobat: - I am not drunk! But i have some botle of vodka!";
    }

}
