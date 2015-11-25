package hw.week3.circus;

import hw.testData.InitTestData;
import hw.week3.circus.model.Circus;
import hw.week3.circus.view.ClientView;

public class RunApplication {

    public static void main(String[] args) {

        Circus circus = InitTestData.hwWeek3Circus();

        ClientView.start(circus);

    }

}
