package hw.week3.circus.model;

/**
 * Created by Valdess on 24.11.2015.
 */
public class Acrobat extends Stuff {

    int drunks;

    public Acrobat() {
        super();
        drunks = 0;
    }

    public Acrobat(String name, double salary) {
        super(name, salary);
        drunks = 0;
    }
    
    public void viewPlay() {
        System.out.println("Acrobat: - I am not drunk! But i have some botle of vodka!");
    }

}
