package hw.testData;

import hw.week3.circus.model.*;
import hw.week4.stack.ArrayStack;
import hw.week4.stack.LinkedStack;

import java.util.ArrayList;

public class InitTestData {

    // <<< Home work 3 ---
    public static Circus hwWeek3Circus() {

        RopeWalker ropeWalker1 = new RopeWalker("Peter", 1600, 5);
        RopeWalker ropeWalker2 = new RopeWalker("Vasil", 1700, 5);
        RopeWalker ropeWalker3 = new RopeWalker("Andru",  1400, 15);

        Acrobat acrobat1 = new Acrobat("Boris",  1400);
        Acrobat acrobat2 = new Acrobat("Kumar",  1400);
        Acrobat acrobat3 = new Acrobat("Eugen",  1400);

        ArrayList<Artist> artists = new ArrayList<>();
        artists.add(ropeWalker1);
        artists.add(ropeWalker2);
        artists.add(ropeWalker3);

        artists.add(acrobat1);
        artists.add(acrobat2);
        artists.add(acrobat3);

        return new Circus(artists, new Location("Kiev", "Frunze 103"));

    }
    // --- Home work 3 >>>

    // <<< Home work 4 ---

    public static ArrayStack hwWeek4ArrayStack() {

        ArrayStack arrayStack = new ArrayStack();
        for (int i = 1; i < 13; i ++) {
            arrayStack.push(i);
        }
        return arrayStack;
    }

    public static LinkedStack hwWeek4LinkedStack() {
        LinkedStack linkedStack = new LinkedStack();
        for (int i = 1; i < 13; i ++) {
            linkedStack.push(i);
        }
        return linkedStack;
    }

    // --- Home work 4 >>>
}
