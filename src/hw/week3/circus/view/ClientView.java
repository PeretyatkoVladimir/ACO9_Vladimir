package hw.week3.circus.view;


import hw.week3.circus.model.Artist;
import hw.week3.circus.model.Circus;
import utils.DataInput;

import java.util.HashMap;
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

    public static void mainMenu1Logic(Circus circus, Scanner sc) {
        System.out.println(circus.getViewAllArtists());
    }

    public static void mainMenu2Logic(Circus circus, Scanner sc) {

        boolean cantExit = true;
        while (cantExit) {

            System.out.println("2| 1. Recruit acrobat");
            System.out.println("2| 2. Recruit rope walker");
            System.out.println("2| 0. Previous");

            int userChoise = DataInput.nextOnlyInt(sc);

            if (userChoise == 0) {
                cantExit = false;
            } else if (userChoise == 1) {
                circus.addNewArtistAcrobat(sc);
                cantExit = false;
            } else if (userChoise == 2) {
                circus.addNewRopeWalker(sc);
                cantExit = false;
            }
        }
    }

    public static void mainMenu3Logic(Circus circus, Scanner sc) {
        System.out.println(3);
    }

    public static void mainMenu4Logic(Circus circus, Scanner sc) {

        boolean cantExit = true;
        while (cantExit) {

            HashMap<Integer, Artist> hashMap = circus.getHasMapOfArtists();

            for (Integer i = 1; i <= hashMap.size(); i++) {
                System.out.println("4| " + i + ". " + hashMap.get(i));
            }
            System.out.println("4| 0. Previous");

            Integer userChoice = DataInput.nextOnlyInt(sc);
            if (userChoice == 0) {
                cantExit = false;
            } else if (hashMap.containsKey(userChoice)) {
                circus.getViewWorkResult(hashMap.get(userChoice));
                cantExit = false;
            }
        }
    }

    public static void mainMenu5Logic(Circus circus, Scanner sc) {
        System.out.println(circus.getViewArtistsActed());
    }

    public static void mainMenu6Logic(Circus circus, Scanner sc) {
        System.out.println(circus.getViewArtistsSalary());
    }

    public static void mainMenu7Logic(Circus circus, Scanner sc) {

        boolean cantExit = true;
        while (cantExit) {

            System.out.println("7| 1. View current location");
            System.out.println("7| 2. Change location");
            System.out.println("7| 0. Previous");

            int userChoise = DataInput.nextOnlyInt(sc);

            if (userChoise == 0) {
                cantExit = false;
            } else if (userChoise == 1) {
                System.out.println(circus.getLocation());
                cantExit = false;
            } else if (userChoise == 2) {
                circus.changeLocation(sc);
                cantExit = false;
            }
        }

    }

    public static void start(Circus circus) {

        boolean cantExit = true;

        while (cantExit) {
            showMainMenu();
            cantExit = mainMenuRun(circus);
        }
    }

}
