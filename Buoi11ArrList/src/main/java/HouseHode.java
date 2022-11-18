import java.util.ArrayList;
import java.util.List;

public class HouseHode {
    private int id;
    private String address;
    private ArrayList<Person> people;

    public HouseHode(int id, String address, ArrayList<Person> people) {
        this.id = id;
        this.address = address;
        this.people = people;
    }

    @Override
    public String toString() {
        return "HouseHode{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", people=" + people +
                '}';
    }
}
