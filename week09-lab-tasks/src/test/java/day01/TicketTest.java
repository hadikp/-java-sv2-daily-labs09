package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test
    void testEntryTime() {
        Ticket ticket = new Ticket("ABBA", LocalDateTime.of(2021, 11, 22, 21, 00), 4000);
        System.out.println(ticket.entryTime());

    }

}