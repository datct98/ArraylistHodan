import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PersonAction {
    // input value of each person
    public Person inputPerson(Scanner scanner) throws ParseException {
        System.out.println("Mời b nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập ngày tháng năm sinh (dd/MM/yyyy) ");
        String date = scanner.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dob = simpleDateFormat.parse(date);
        System.out.println("Mời b nhập job: ");
        String job = scanner.nextLine();
        Person person = new Person(name, dob, job);
        return person;
    }
}
