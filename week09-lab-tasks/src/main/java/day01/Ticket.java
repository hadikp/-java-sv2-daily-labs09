package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {

    private String bandName;
    private LocalDateTime time;
    private int price;

    public Ticket(String bandName, LocalDateTime time, int price) {
        this.bandName = bandName;
        this.time = time;
        this.price = price;
    }

    public int entryTime() {
        return time.getHour() - 1;
    }

    public String getBandName() {
        return bandName;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public int getPrice() {
        return price;
    }
}
