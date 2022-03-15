import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("outsideCodeclan");
        person = new Person();
    }

    @Test
    public void canAddToQueue(){
        busStop.addBSW(person);
        assertEquals(1, busStop.queueLength());
    }

    @Test
    public void canRemoveFromQueue(){
        busStop.addBSW(person);
        busStop.removeBSW();
        assertEquals(0, busStop.queueLength());
    }

}
