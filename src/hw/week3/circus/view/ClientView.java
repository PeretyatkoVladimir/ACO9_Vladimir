package hw.week3.circus.view;


import hw.week3.circus.model.Circus;
import utils.DataInput;

import java.util.Scanner;

public class ClientView {


    public static void showMainMenu() {

        System.out.println("1. See a list of artists");
        System.out.println("2. Recruit new circus artist");
        System.out.println("3. Dismiss the drinker acrobat");
        System.out.println("4. Send someone to play(work)");
        System.out.println("5. Find out how many times each of the artist is acted");
        System.out.println("6. Pay salary to artists");
        System.out.println("7. Change location");

        System.out.println("0. Exit");
    }

    public static boolean mainMenuRun(Circus circus) {

        Scanner sc = new Scanner(System.in);
        int userChoice = DataInput.nextOnlyInt(sc);

        if (userChoice == 0) {
            return mainMenuExitLogic(circus, sc);
        } else if (userChoice == 1) {
            mainMenu1Logic(circus, sc);
        } else if (userChoice == 2) {
            mainMenu2Logic(circus, sc);
        } else if (userChoice == 3) {
            mainMenu3Logic(circus, sc);
        } else if (userChoice == 4) {
            mainMenu4Logic(circus, sc);
        } else if (userChoice == 5) {
            mainMenu5Logic(circus, sc);
        } else if (userChoice == 6) {
            mainMenu6Logic(circus, sc);
        } else if (userChoice == 7) {
            mainMenu7Logic(circus, sc);
        }
        return true;
    }

    public static boolean mainMenuExitLogic(Circus circus, Scanner sc) {
        System.out.println("Good bye scumbag!");
        return false;

    }

    public static void mainMenu1Logic(Circus circus, Scanner sc){
        System.out.println(circus.getViewAllArtists());
    }

    public static void mainMenu2Logic(Circus circus, Scanner sc){
        System.out.println(2);
    }

    public static void mainMenu3Logic(Circus circus, Scanner sc){
        System.out.println(3);
    }

    public static void mainMenu4Logic(Circus circus, Scanner sc){
        System.out.println(4);
    }

    public static void mainMenu5Logic(Circus circus, Scanner sc){
        System.out.println(circus.getViewArtistsActed());
    }

    public static void mainMenu6Logic(Circus circus, Scanner sc){
        System.out.println(circus.getViewArtistsSalary());
    }

    public static void mainMenu7Logic(Circus circus, Scanner sc){
        System.out.println(7);
    }

    public static void start(Circus circus) {

        boolean cantExit = true;

        while (cantExit) {
            showMainMenu();
            cantExit = mainMenuRun(circus);
        }
    }

}
