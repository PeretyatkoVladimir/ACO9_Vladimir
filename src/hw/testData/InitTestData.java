package hw.testData;

import com.sun.org.apache.bcel.internal.generic.NEW;
import hw.week3.circus.model.*;

import java.util.ArrayList;

public class InitTestData {

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
        artists.add(acrobat1);
        artists.add(acrobat1);

        return new Circus(artists, new Location("Kiev", "Frunze 103"));

    }
}
