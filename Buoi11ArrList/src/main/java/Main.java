import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        System.out.println(System.currentTimeMillis());
        Scanner sc = new Scanner(System.in);
        PersonAction action = new PersonAction();

        // Input information for HouseHolde
        System.out.println("Mời b nhập id: ");
        Integer id = Integer.parseInt(sc.nextLine());
        System.out.println("Mời b nhập address: ");
        String address= sc.nextLine();

        // init arraylist to contain person
        ArrayList<Person> people = new ArrayList<>();
        Person person = action.inputPerson(sc);
        Person person2 = action.inputPerson(sc);
        people.add(person);
        people.add(person2);

        HouseHode houseHode = new HouseHode(id, address,people);
        System.out.println(houseHode.toString());

    }
}
