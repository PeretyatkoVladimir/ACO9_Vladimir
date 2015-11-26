package utils;

public class OwnMath {

    public static boolean CheckIntValueInIntervalIncluding(int value, int min, int max) {
        return (value >= min && value <= max);
    }

    public static boolean CheckDoubleValueInIntervalIncluding(double value, double min, double max) {

        return (value >= min && value <= max);
    }

    public static int getRandomInt(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

}
