package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {

    private List<Person> personList = new ArrayList<>();

    public void addPerson(Person person, LocalTime time) {
        //System.out.println(time.getHour());
        //System.out.println(person.getTicket().entryTime());
        //return ((time.getHour()) == (person.getTicket().entryTime()));
       if (time.getHour()  >= person.getTicket().entryTime()) {
           personList.add(person);
       } else {
           throw new IllegalArgumentException("Az időpontok nem egyeznek!");
       }
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
