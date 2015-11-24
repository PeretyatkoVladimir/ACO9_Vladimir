package hw.week1;

public class Main {

    public static void main(String[] args) {

        System.out.println(" OwnInt ------------------------------------------------------");

        System.out.println(" OwnMas ------------------------------------------------------");

        OwnMas nums = new OwnMas(11);
        nums.randomFill(0, 9);
        System.out.println(nums);
        nums.incLengthBy(5);
        System.out.println(nums);

        System.out.println(" OwnString ---------------------------------------------------");

        OwnString str = new OwnString("XyXyYxxYY");
        System.out.println(str);

        str.concat(new OwnString("ZZZzZzZZ"));
        System.out.println(str);

        str.toLowerCase();
        System.out.println(str);

        str.toUpperCase();
        System.out.println(str);
        System.out.println("ok");

    }
}
