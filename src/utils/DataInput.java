package utils;

import java.util.Scanner;

public class DataInput {



    public static int nextOnlyInt(Scanner sc) {

        boolean cantExit = true;
        int number = 0;

        while (cantExit) {
            try {
                number = sc.nextInt();
                cantExit = false;
            } catch (Exception e) {
                System.err.println("Wrong input! Input only 'integer' numbers dummy!");
                sc.nextLine();
            }
        }
        return number;
    }

    public static double nextOnlyDouble(Scanner sc) {

        boolean cantExit = true;
        double number = 0;

        while (cantExit) {
            try {
                number = sc.nextDouble();
                cantExit = false;
            } catch (Exception e) {
                System.err.println("Wrong input! Input only 'double' numbers dummy!");
                sc.nextLine();
            }
        }
        return number;
    }


}
