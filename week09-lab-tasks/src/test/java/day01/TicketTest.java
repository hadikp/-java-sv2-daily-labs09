package day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    Ticket ticket;

    @BeforeEach
    void init() {
        ticket = new Ticket("ABBA", LocalDateTime.of(2021, 11, 22, 21, 00),
                4000);

    }

    @Test
    void testEntryTime() {
        assertEquals(20, ticket.entryTime());
    }

    @Test
    void testEntryNewTime() {
        FrontOfStageTicket fst = new FrontOfStageTicket("Omega", LocalDateTime.of(2021, 12, 06, 11, 00),
                4500, 11);
        assertEquals(9, fst.entryTime());
    }

}