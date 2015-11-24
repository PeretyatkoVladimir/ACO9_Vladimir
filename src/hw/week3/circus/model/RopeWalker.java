package hw.week3.circus.model;


public class RopeWalker extends Stuff {

    private double percent;

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
        return "Stuff{" +
                "name='" + super.getName()  +
                ", salary=" + super.getSalary() +
                ", percent=" + percent +
                '}';
    }
}
