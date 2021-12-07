package day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {

    Ticket ticket1;
    Person person;
    Person personFst;
    FrontOfStageTicket fst;

    @BeforeEach
    void init() {
        ticket1 = new Ticket("ABBA", LocalDateTime.of(2021, 11, 22, 21, 01),
                4000);
        fst = new FrontOfStageTicket("Omega", LocalDateTime.of(2021, 12, 06, 21, 00),
                4500, 11);
        person = new Person(ticket1);
        personFst = new Person(fst);
    }

    @Test
    void testAddPerson() {
        Concert concert = new Concert();
        concert.addPerson(person, LocalTime.of( 20, 01));
        assertEquals(1, concert.getPersonList().size());
        concert.addPerson(personFst, LocalTime.of( 19, 00));
        assertEquals(2, concert.getPersonList().size());
    }

}