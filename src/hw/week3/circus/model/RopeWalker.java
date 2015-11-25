package hw.week3.circus.model;


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
                ", salary=" + super.getSalary() +
                '}';
    }
    
    public String doWork() {
        super.incActed();
        return "Rope walker: - Scientist cat walks on chain circle!";
    }
}
