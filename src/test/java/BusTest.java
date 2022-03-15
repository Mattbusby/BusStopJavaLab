import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;


    @Before
    public void before() {
        bus = new Bus("Malaga", 3);
        busStop = new BusStop("outsideCodeclan");
        person = new Person();

    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(3, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canPickUpPassenger(){
        busStop.addBSW(person);
        bus.addPassengerFromBusStop(busStop);
        assertEquals(1, bus.passengerCount());
    }
}
