import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> Queue;

    public BusStop(String name){
        this.name = name;
        this.Queue = new ArrayList<>();
    }
    public void addBSW(Person person){
        this.Queue.add(person);
    }
    public Person removeBSW(){
        return this.Queue.remove(0);
    }

    public int queueLength() {
        return Queue.size();
    }
}
