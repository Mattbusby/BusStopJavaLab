import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int passengerCount() {
        return passengers.size();
    }

    public void addPassenger(Person person) {
        if (this.passengerCount() < this.capacity) {
            passengers.add(person);
        }
    }

    public void removePassenger(Person person){
        if(this.passengers.size()>0){
            passengers.remove(0);
        }
    }

    public void addPassengerFromBusStop(BusStop busStop){
        Person person = busStop.removeBSW();
        this.addPassenger(person);
    }
}
